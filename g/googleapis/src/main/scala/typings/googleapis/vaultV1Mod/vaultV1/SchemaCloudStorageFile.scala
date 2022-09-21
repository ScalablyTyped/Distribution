package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudStorageFile extends StObject {
  
  /**
    * The name of the Cloud Storage bucket for the export file. You can use this value in the [Cloud Storage JSON or XML APIs](https://cloud.google.com/storage/docs/apis), but not to list the bucket contents. Instead, you can [get individual export files](https://cloud.google.com/storage/docs/json_api/v1/objects/get) by object name.
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The md5 hash of the file.
    */
  var md5Hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Cloud Storage object for the export file. You can use this value in the [Cloud Storage JSON or XML APIs](https://cloud.google.com/storage/docs/apis).
    */
  var objectName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The export file size.
    */
  var size: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudStorageFile {
  
  inline def apply(): SchemaCloudStorageFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudStorageFile]
  }
  
  extension [Self <: SchemaCloudStorageFile](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameNull: Self = StObject.set(x, "bucketName", null)
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    inline def setObjectNameNull: Self = StObject.set(x, "objectName", null)
    
    inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
