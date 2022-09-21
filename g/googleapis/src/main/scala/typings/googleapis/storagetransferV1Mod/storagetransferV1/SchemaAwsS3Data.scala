package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAwsS3Data extends StObject {
  
  /**
    * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
    */
  var awsAccessKey: js.UndefOr[SchemaAwsAccessKey] = js.undefined
  
  /**
    * Required. S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role to support temporary credentials via `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a `AssumeRoleWithWebIdentity` call for the provided role using the GoogleServiceAccount for this project.
    */
  var roleArn: js.UndefOr[String | Null] = js.undefined
}
object SchemaAwsS3Data {
  
  inline def apply(): SchemaAwsS3Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAwsS3Data]
  }
  
  extension [Self <: SchemaAwsS3Data](x: Self) {
    
    inline def setAwsAccessKey(value: SchemaAwsAccessKey): Self = StObject.set(x, "awsAccessKey", value.asInstanceOf[js.Any])
    
    inline def setAwsAccessKeyUndefined: Self = StObject.set(x, "awsAccessKey", js.undefined)
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameNull: Self = StObject.set(x, "bucketName", null)
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnNull: Self = StObject.set(x, "roleArn", null)
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
