package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggestion.
  */
@js.native
trait SchemaSuggestion extends js.Object {
  
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String] = js.native
}
object SchemaSuggestion {
  
  @scala.inline
  def apply(): SchemaSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestion]
  }
  
  @scala.inline
  implicit class SchemaSuggestionOps[Self <: SchemaSuggestion] (val x: Self) extends AnyVal {
    
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
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
  }
}
