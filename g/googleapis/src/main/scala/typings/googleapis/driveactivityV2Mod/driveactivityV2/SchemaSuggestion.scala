package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggestion.
  */
@js.native
trait SchemaSuggestion extends StObject {
  
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
  implicit class SchemaSuggestionMutableBuilder[Self <: SchemaSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
