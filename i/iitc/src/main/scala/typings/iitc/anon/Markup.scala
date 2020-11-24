package typings.iitc.anon

import typings.iitc.iitcStrings.ENLIGHTENED
import typings.iitc.iitcStrings.PLAYER_GENERATED
import typings.iitc.iitcStrings.RESISTANCE
import typings.iitc.iitcStrings.SYSTEM_BROADCAST
import typings.iitc.iitcStrings.SYSTEM_NARROWCAST
import typings.iitc.inteltypesMod.Intel.MarkUpPlayer
import typings.iitc.inteltypesMod.Intel.MarkUpPortal
import typings.iitc.inteltypesMod.Intel.MarkUpText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Markup extends js.Object {
  
  var markup: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText] = js.native
  
  var plextType: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED = js.native
  
  var team: RESISTANCE | ENLIGHTENED = js.native
  
  var text: String = js.native
}
object Markup {
  
  @scala.inline
  def apply(
    markup: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText],
    plextType: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED,
    team: RESISTANCE | ENLIGHTENED,
    text: String
  ): Markup = {
    val __obj = js.Dynamic.literal(markup = markup.asInstanceOf[js.Any], plextType = plextType.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markup]
  }
  
  @scala.inline
  implicit class MarkupOps[Self <: Markup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarkupVarargs(value: (MarkUpPortal | MarkUpPlayer | MarkUpText)*): Self = this.set("markup", js.Array(value :_*))
    
    @scala.inline
    def setMarkup(value: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText]): Self = this.set("markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlextType(value: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED): Self = this.set("plextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: RESISTANCE | ENLIGHTENED): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
