package typings.atMapboxS3urls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucketinhost extends js.Object {
  var `bucket-in-host`: String
  var `bucket-in-path`: String
  var s3: String
}

object Anon_Bucketinhost {
  @scala.inline
  def apply(`bucket-in-host`: String, `bucket-in-path`: String, s3: String): Anon_Bucketinhost = {
    val __obj = js.Dynamic.literal(s3 = s3)
    __obj.updateDynamic("bucket-in-host")(`bucket-in-host`)
    __obj.updateDynamic("bucket-in-path")(`bucket-in-path`)
    __obj.asInstanceOf[Anon_Bucketinhost]
  }
}

