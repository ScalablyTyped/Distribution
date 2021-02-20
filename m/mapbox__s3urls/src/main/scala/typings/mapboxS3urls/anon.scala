package typings.mapboxS3urls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bucket extends StObject {
    
    var Bucket: js.UndefOr[String] = js.native
    
    var Key: js.UndefOr[String] = js.native
  }
  object Bucket {
    
    @scala.inline
    def apply(): Bucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bucket]
    }
    
    @scala.inline
    implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    }
  }
  
  @js.native
  trait Bucketinhost extends StObject {
    
    var `bucket-in-host`: String = js.native
    
    var `bucket-in-path`: String = js.native
    
    var s3: String = js.native
  }
  object Bucketinhost {
    
    @scala.inline
    def apply(`bucket-in-host`: String, `bucket-in-path`: String, s3: String): Bucketinhost = {
      val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
      __obj.updateDynamic("bucket-in-host")(`bucket-in-host`.asInstanceOf[js.Any])
      __obj.updateDynamic("bucket-in-path")(`bucket-in-path`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucketinhost]
    }
    
    @scala.inline
    implicit class BucketinhostMutableBuilder[Self <: Bucketinhost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBucket-in-host`(value: String): Self = StObject.set(x, "bucket-in-host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBucket-in-path`(value: String): Self = StObject.set(x, "bucket-in-path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3(value: String): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    }
  }
}
