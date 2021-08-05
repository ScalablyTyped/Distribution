package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An export file on cloud storage
  */
trait SchemaCloudStorageFile extends StObject {
  
  /**
    * The cloud storage bucket name of this export file. Can be used in cloud
    * storage JSON/XML API.
    */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The md5 hash of the file.
    */
  var md5Hash: js.UndefOr[String] = js.undefined
  
  /**
    * The cloud storage object name of this export file. Can be used in cloud
    * storage JSON/XML API.
    */
  var objectName: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the export file.
    */
  var size: js.UndefOr[String] = js.undefined
}
object SchemaCloudStorageFile {
  
  inline def apply(): SchemaCloudStorageFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudStorageFile]
  }
  
  extension [Self <: SchemaCloudStorageFile](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
