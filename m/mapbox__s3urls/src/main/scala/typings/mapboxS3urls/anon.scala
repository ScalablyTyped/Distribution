package typings.mapboxS3urls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bucket extends StObject {
    
    var Bucket: js.UndefOr[String] = js.undefined
    
    var Key: js.UndefOr[String] = js.undefined
  }
  object Bucket {
    
    inline def apply(): Bucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bucket]
    }
    
    extension [Self <: Bucket](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    }
  }
  
  trait Bucketinhost extends StObject {
    
    var `bucket-in-host`: String
    
    var `bucket-in-path`: String
    
    var s3: String
  }
  object Bucketinhost {
    
    inline def apply(`bucket-in-host`: String, `bucket-in-path`: String, s3: String): Bucketinhost = {
      val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
      __obj.updateDynamic("bucket-in-host")(`bucket-in-host`.asInstanceOf[js.Any])
      __obj.updateDynamic("bucket-in-path")(`bucket-in-path`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucketinhost]
    }
    
    extension [Self <: Bucketinhost](x: Self) {
      
      inline def `setBucket-in-host`(value: String): Self = StObject.set(x, "bucket-in-host", value.asInstanceOf[js.Any])
      
      inline def `setBucket-in-path`(value: String): Self = StObject.set(x, "bucket-in-path", value.asInstanceOf[js.Any])
      
      inline def setS3(value: String): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    }
  }
}
