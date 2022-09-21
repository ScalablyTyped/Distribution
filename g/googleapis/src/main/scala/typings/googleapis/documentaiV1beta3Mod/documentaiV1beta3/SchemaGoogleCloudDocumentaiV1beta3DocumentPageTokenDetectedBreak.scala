package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentPageTokenDetectedBreak extends StObject {
  
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentPageTokenDetectedBreak {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentPageTokenDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentPageTokenDetectedBreak]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentPageTokenDetectedBreak](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
