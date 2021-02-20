package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An AwsS3Data resource can be a data source, but not a data sink. In an
  * AwsS3Data resource, an object&#39;s name is the S3 object&#39;s key name.
  */
@js.native
trait SchemaAwsS3Data extends StObject {
  
  /**
    * AWS access key used to sign the API requests to the AWS S3 bucket.
    * Permissions on the bucket must be granted to the access ID of the AWS
    * access key. Required.
    */
  var awsAccessKey: js.UndefOr[SchemaAwsAccessKey] = js.native
  
  /**
    * S3 Bucket name (see [Creating a
    * bucket](http://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
    * Required.
    */
  var bucketName: js.UndefOr[String] = js.native
}
object SchemaAwsS3Data {
  
  @scala.inline
  def apply(): SchemaAwsS3Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAwsS3Data]
  }
  
  @scala.inline
  implicit class SchemaAwsS3DataMutableBuilder[Self <: SchemaAwsS3Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccessKey(value: SchemaAwsAccessKey): Self = StObject.set(x, "awsAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccessKeyUndefined: Self = StObject.set(x, "awsAccessKey", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
  }
}
