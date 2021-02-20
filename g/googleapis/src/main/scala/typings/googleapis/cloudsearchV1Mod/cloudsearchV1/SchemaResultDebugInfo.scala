package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Debugging information about the result.
  */
@js.native
trait SchemaResultDebugInfo extends StObject {
  
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}
object SchemaResultDebugInfo {
  
  @scala.inline
  def apply(): SchemaResultDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDebugInfo]
  }
  
  @scala.inline
  implicit class SchemaResultDebugInfoMutableBuilder[Self <: SchemaResultDebugInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedDebugInfo(value: String): Self = StObject.set(x, "formattedDebugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedDebugInfoUndefined: Self = StObject.set(x, "formattedDebugInfo", js.undefined)
  }
}
