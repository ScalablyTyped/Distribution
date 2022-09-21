package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ProcessorVersionDeprecationInfo extends StObject {
  
  /**
    * The time at which this processor version will be deprecated.
    */
  var deprecationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, the processor version that will be used as a replacement.
    */
  var replacementProcessorVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ProcessorVersionDeprecationInfo {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ProcessorVersionDeprecationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersionDeprecationInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ProcessorVersionDeprecationInfo](x: Self) {
    
    inline def setDeprecationTime(value: String): Self = StObject.set(x, "deprecationTime", value.asInstanceOf[js.Any])
    
    inline def setDeprecationTimeNull: Self = StObject.set(x, "deprecationTime", null)
    
    inline def setDeprecationTimeUndefined: Self = StObject.set(x, "deprecationTime", js.undefined)
    
    inline def setReplacementProcessorVersion(value: String): Self = StObject.set(x, "replacementProcessorVersion", value.asInstanceOf[js.Any])
    
    inline def setReplacementProcessorVersionNull: Self = StObject.set(x, "replacementProcessorVersion", null)
    
    inline def setReplacementProcessorVersionUndefined: Self = StObject.set(x, "replacementProcessorVersion", js.undefined)
  }
}
