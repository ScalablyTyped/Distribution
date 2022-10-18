package typings.lesgo

import typings.awsSdk.clientsS3Mod.BucketName
import typings.awsSdk.clientsS3Mod.GetObjectOutput
import typings.awsSdk.clientsS3Mod.ObjectKey
import typings.awsSdk.clientsS3Mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesS3ServiceMod {
  
  @JSImport("lesgo/services/S3Service", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with S3Service {
    def this(opts: S3ServiceParams) = this()
    
    /* CompleteClass */
    override def getObject(key: ObjectKey, bucketName: BucketName): js.Promise[GetObjectOutput] = js.native
    
    /* CompleteClass */
    var s3Instance: ^ = js.native
  }
  
  trait S3Service extends StObject {
    
    def getObject(key: ObjectKey, bucketName: BucketName): js.Promise[GetObjectOutput]
    
    var s3Instance: ^
  }
  object S3Service {
    
    inline def apply(getObject: (ObjectKey, BucketName) => js.Promise[GetObjectOutput], s3Instance: ^): S3Service = {
      val __obj = js.Dynamic.literal(getObject = js.Any.fromFunction2(getObject), s3Instance = s3Instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3Service]
    }
    
    extension [Self <: S3Service](x: Self) {
      
      inline def setGetObject(value: (ObjectKey, BucketName) => js.Promise[GetObjectOutput]): Self = StObject.set(x, "getObject", js.Any.fromFunction2(value))
      
      inline def setS3Instance(value: ^): Self = StObject.set(x, "s3Instance", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3ServiceParams extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var secretAccessKey: js.UndefOr[String] = js.undefined
  }
  object S3ServiceParams {
    
    inline def apply(): S3ServiceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3ServiceParams]
    }
    
    extension [Self <: S3ServiceParams](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    }
  }
}
