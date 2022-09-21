package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3Processor extends StObject {
  
  /**
    * The time the processor was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default processor version.
    */
  var defaultProcessorVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the processor.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The resource name of the processor. Format: `projects/{project\}/locations/{location\}/processors/{processor\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The http endpoint that can be called to invoke processing.
    */
  var processEndpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the processor.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The processor type, e.g., OCR_PROCESSOR, INVOICE_PROCESSOR, etc. To get a list of processors types, see FetchProcessorTypes.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3Processor {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3Processor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3Processor]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3Processor](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDefaultProcessorVersion(value: String): Self = StObject.set(x, "defaultProcessorVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultProcessorVersionNull: Self = StObject.set(x, "defaultProcessorVersion", null)
    
    inline def setDefaultProcessorVersionUndefined: Self = StObject.set(x, "defaultProcessorVersion", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProcessEndpoint(value: String): Self = StObject.set(x, "processEndpoint", value.asInstanceOf[js.Any])
    
    inline def setProcessEndpointNull: Self = StObject.set(x, "processEndpoint", null)
    
    inline def setProcessEndpointUndefined: Self = StObject.set(x, "processEndpoint", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
