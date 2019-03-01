package typings
package atMapboxS3urlsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucketinhost extends js.Object {
  var `bucket-in-host`: java.lang.String
  var `bucket-in-path`: java.lang.String
  var s3: java.lang.String
}

object Anon_Bucketinhost {
  @scala.inline
  def apply(`bucket-in-host`: java.lang.String, `bucket-in-path`: java.lang.String, s3: java.lang.String): Anon_Bucketinhost = {
    val __obj = js.Dynamic.literal(`bucket-in-host` = `bucket-in-host`, `bucket-in-path` = `bucket-in-path`)
    __obj.updateDynamic("s3")(s3)
    __obj.asInstanceOf[Anon_Bucketinhost]
  }
}

