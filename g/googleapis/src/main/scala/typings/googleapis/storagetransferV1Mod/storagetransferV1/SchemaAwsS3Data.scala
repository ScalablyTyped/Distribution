package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An AwsS3Data resource can be a data source, but not a data sink. In an
  * AwsS3Data resource, an object&#39;s name is the S3 object&#39;s key name.
  */
@js.native
trait SchemaAwsS3Data extends js.Object {
  
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
  implicit class SchemaAwsS3DataOps[Self <: SchemaAwsS3Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsAccessKey(value: SchemaAwsAccessKey): Self = this.set("awsAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccessKey: Self = this.set("awsAccessKey", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
  }
}
