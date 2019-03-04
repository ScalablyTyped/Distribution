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
    val __obj = js.Dynamic.literal(s3 = s3)
    __obj.updateDynamic("bucket-in-host")(`bucket-in-host`)
    __obj.updateDynamic("bucket-in-path")(`bucket-in-path`)
    __obj.asInstanceOf[Anon_Bucketinhost]
  }
}

