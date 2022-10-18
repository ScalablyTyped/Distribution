package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repository extends StObject {
  
  /** The time when the repository was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The user-provided description of the repository. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The format of packages that are stored in the repository. */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The Cloud KMS resource name of the customer managed encryption key that's used to encrypt the contents of the Repository. Has the form:
    * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter
    * and may only contain lowercase letters, numeric characters, underscores, and dashes.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Maven repository config contains repository level configuration for the repositories of maven type. */
  var mavenConfig: js.UndefOr[MavenRepositoryConfig] = js.undefined
  
  /** The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1". */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The size, in bytes, of all artifact storage in this repository. Repositories that are generally available or in public preview use this to calculate storage costs. */
  var sizeBytes: js.UndefOr[String] = js.undefined
  
  /** The time when the repository was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Repository {
  
  inline def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  
  extension [Self <: Repository](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMavenConfig(value: MavenRepositoryConfig): Self = StObject.set(x, "mavenConfig", value.asInstanceOf[js.Any])
    
    inline def setMavenConfigUndefined: Self = StObject.set(x, "mavenConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
