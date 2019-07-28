package typings.atMapboxS3urls

import typings.atMapboxS3urls.atMapboxS3urlsStrings.`bucket-in-host`
import typings.atMapboxS3urls.atMapboxS3urlsStrings.`bucket-in-path`
import typings.atMapboxS3urls.atMapboxS3urlsStrings.s3
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/s3urls", JSImport.Namespace)
@js.native
object atMapboxS3urlsMod extends js.Object {
  @JSName("convert")
  def convert_bucketinhost(url: String, to: `bucket-in-host`): String = js.native
  @JSName("convert")
  def convert_bucketinpath(url: String, to: `bucket-in-path`): String = js.native
  @JSName("convert")
  def convert_s3(url: String, to: s3): String = js.native
  def fromUrl(url: String): Anon_Bucket = js.native
  def signed(
    url: String,
    expires: Double,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]
  ): Unit = js.native
  def toUrl(bucket: String, key: String): Anon_Bucketinhost = js.native
  def valid(url: String): Boolean = js.native
}

