package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainerSpec extends StObject {
  
  /**
    * Default runtime environment for the job.
    */
  var defaultEnvironment: js.UndefOr[SchemaFlexTemplateRuntimeEnvironment] = js.undefined
  
  /**
    * Name of the docker container image. E.g., gcr.io/project/some-image
    */
  var image: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud Storage path to self-signed certificate of private registry.
    */
  var imageRepositoryCertPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Secret Manager secret id for password to authenticate to private registry.
    */
  var imageRepositoryPasswordSecretId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Secret Manager secret id for username to authenticate to private registry.
    */
  var imageRepositoryUsernameSecretId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata describing a template including description and validation rules.
    */
  var metadata: js.UndefOr[SchemaTemplateMetadata] = js.undefined
  
  /**
    * Required. SDK info of the Flex Template.
    */
  var sdkInfo: js.UndefOr[SchemaSDKInfo] = js.undefined
}
object SchemaContainerSpec {
  
  inline def apply(): SchemaContainerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerSpec]
  }
  
  extension [Self <: SchemaContainerSpec](x: Self) {
    
    inline def setDefaultEnvironment(value: SchemaFlexTemplateRuntimeEnvironment): Self = StObject.set(x, "defaultEnvironment", value.asInstanceOf[js.Any])
    
    inline def setDefaultEnvironmentUndefined: Self = StObject.set(x, "defaultEnvironment", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageRepositoryCertPath(value: String): Self = StObject.set(x, "imageRepositoryCertPath", value.asInstanceOf[js.Any])
    
    inline def setImageRepositoryCertPathNull: Self = StObject.set(x, "imageRepositoryCertPath", null)
    
    inline def setImageRepositoryCertPathUndefined: Self = StObject.set(x, "imageRepositoryCertPath", js.undefined)
    
    inline def setImageRepositoryPasswordSecretId(value: String): Self = StObject.set(x, "imageRepositoryPasswordSecretId", value.asInstanceOf[js.Any])
    
    inline def setImageRepositoryPasswordSecretIdNull: Self = StObject.set(x, "imageRepositoryPasswordSecretId", null)
    
    inline def setImageRepositoryPasswordSecretIdUndefined: Self = StObject.set(x, "imageRepositoryPasswordSecretId", js.undefined)
    
    inline def setImageRepositoryUsernameSecretId(value: String): Self = StObject.set(x, "imageRepositoryUsernameSecretId", value.asInstanceOf[js.Any])
    
    inline def setImageRepositoryUsernameSecretIdNull: Self = StObject.set(x, "imageRepositoryUsernameSecretId", null)
    
    inline def setImageRepositoryUsernameSecretIdUndefined: Self = StObject.set(x, "imageRepositoryUsernameSecretId", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setMetadata(value: SchemaTemplateMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSdkInfo(value: SchemaSDKInfo): Self = StObject.set(x, "sdkInfo", value.asInstanceOf[js.Any])
    
    inline def setSdkInfoUndefined: Self = StObject.set(x, "sdkInfo", js.undefined)
  }
}
