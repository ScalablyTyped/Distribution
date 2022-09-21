package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Container extends StObject {
  
  /**
    * A string representation of the full container name. Examples: - BigQuery: 'Project:DataSetId.TableId' - Cloud Storage: 'gs://Bucket/folders/filename.txt'
    */
  var fullPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Project where the finding was found. Can be different from the project that owns the finding.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rest of the path after the root. Examples: - For BigQuery table `project_id:dataset_id.table_id`, the relative path is `table_id` - For Cloud Storage file `gs://bucket/folder/filename.txt`, the relative path is `folder/filename.txt`
    */
  var relativePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The root of the container. Examples: - For BigQuery table `project_id:dataset_id.table_id`, the root is `dataset_id` - For Cloud Storage file `gs://bucket/folder/filename.txt`, the root is `gs://bucket`
    */
  var rootPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container type, for example BigQuery or Cloud Storage.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Findings container modification timestamp, if applicable. For Cloud Storage, this field contains the last file modification timestamp. For a BigQuery table, this field contains the last_modified_time property. For Datastore, this field isn't populated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Findings container version, if available ("generation" for Cloud Storage).
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Container {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Container]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Container](x: Self) {
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setFullPathNull: Self = StObject.set(x, "fullPath", null)
    
    inline def setFullPathUndefined: Self = StObject.set(x, "fullPath", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathNull: Self = StObject.set(x, "relativePath", null)
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
    
    inline def setRootPathNull: Self = StObject.set(x, "rootPath", null)
    
    inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
