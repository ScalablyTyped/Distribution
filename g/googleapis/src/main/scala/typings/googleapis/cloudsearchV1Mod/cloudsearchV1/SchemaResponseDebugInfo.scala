package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Debugging information about the response.
  */
@js.native
trait SchemaResponseDebugInfo extends StObject {
  
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}
object SchemaResponseDebugInfo {
  
  @scala.inline
  def apply(): SchemaResponseDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseDebugInfo]
  }
  
  @scala.inline
  implicit class SchemaResponseDebugInfoMutableBuilder[Self <: SchemaResponseDebugInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedDebugInfo(value: String): Self = StObject.set(x, "formattedDebugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedDebugInfoUndefined: Self = StObject.set(x, "formattedDebugInfo", js.undefined)
  }
}
