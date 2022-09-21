package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNonCompliantFile extends StObject {
  
  /**
    * Command to display the non-compliant files.
    */
  var displayCommand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Empty if `display_command` is set.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Explains why a file is non compliant for a CIS check.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaNonCompliantFile {
  
  inline def apply(): SchemaNonCompliantFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonCompliantFile]
  }
  
  extension [Self <: SchemaNonCompliantFile](x: Self) {
    
    inline def setDisplayCommand(value: String): Self = StObject.set(x, "displayCommand", value.asInstanceOf[js.Any])
    
    inline def setDisplayCommandNull: Self = StObject.set(x, "displayCommand", null)
    
    inline def setDisplayCommandUndefined: Self = StObject.set(x, "displayCommand", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
