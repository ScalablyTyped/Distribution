package typings.maskedinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedInputDefaults extends js.Object {
  
  var aliases: js.Any = js.native
  
  var definitions: js.Any = js.native
}
object MaskedInputDefaults {
  
  @scala.inline
  def apply(aliases: js.Any, definitions: js.Any): MaskedInputDefaults = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputDefaults]
  }
  
  @scala.inline
  implicit class MaskedInputDefaultsOps[Self <: MaskedInputDefaults] (val x: Self) extends AnyVal {
    
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
    def setAliases(value: js.Any): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitions(value: js.Any): Self = this.set("definitions", value.asInstanceOf[js.Any])
  }
}
