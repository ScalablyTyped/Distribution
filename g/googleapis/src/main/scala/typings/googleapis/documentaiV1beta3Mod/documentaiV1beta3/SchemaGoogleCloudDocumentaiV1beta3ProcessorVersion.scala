package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion extends StObject {
  
  /**
    * The time the processor version was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, information about the eventual deprecation of this version.
    */
  var deprecationInfo: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersionDeprecationInfo] = js.undefined
  
  /**
    * The display name of the processor version.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Denotes that this ProcessorVersion is managed by google.
    */
  var googleManaged: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The KMS key name used for encryption.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The KMS key version with which data is encrypted.
    */
  var kmsKeyVersionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the processor version. Format: `projects/{project\}/locations/{location\}/processors/{processor\}/processorVersions/{processor_version\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the processor version.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeprecationInfo(value: SchemaGoogleCloudDocumentaiV1beta3ProcessorVersionDeprecationInfo): Self = StObject.set(x, "deprecationInfo", value.asInstanceOf[js.Any])
    
    inline def setDeprecationInfoUndefined: Self = StObject.set(x, "deprecationInfo", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGoogleManaged(value: Boolean): Self = StObject.set(x, "googleManaged", value.asInstanceOf[js.Any])
    
    inline def setGoogleManagedNull: Self = StObject.set(x, "googleManaged", null)
    
    inline def setGoogleManagedUndefined: Self = StObject.set(x, "googleManaged", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setKmsKeyVersionName(value: String): Self = StObject.set(x, "kmsKeyVersionName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyVersionNameNull: Self = StObject.set(x, "kmsKeyVersionName", null)
    
    inline def setKmsKeyVersionNameUndefined: Self = StObject.set(x, "kmsKeyVersionName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
