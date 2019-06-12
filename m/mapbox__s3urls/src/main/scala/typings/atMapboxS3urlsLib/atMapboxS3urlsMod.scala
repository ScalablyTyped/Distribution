package typings
package atMapboxS3urlsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/s3urls", JSImport.Namespace)
@js.native
object atMapboxS3urlsMod extends js.Object {
  @JSName("convert")
  def convert_bucketinhost(url: java.lang.String, to: atMapboxS3urlsLib.atMapboxS3urlsLibStrings.`bucket-in-host`): java.lang.String = js.native
  @JSName("convert")
  def convert_bucketinpath(url: java.lang.String, to: atMapboxS3urlsLib.atMapboxS3urlsLibStrings.`bucket-in-path`): java.lang.String = js.native
  @JSName("convert")
  def convert_s3(url: java.lang.String, to: atMapboxS3urlsLib.atMapboxS3urlsLibStrings.s3): java.lang.String = js.native
  def fromUrl(url: java.lang.String): atMapboxS3urlsLib.Anon_Bucket = js.native
  def signed(
    url: java.lang.String,
    expires: scala.Double,
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toUrl(bucket: java.lang.String, key: java.lang.String): atMapboxS3urlsLib.Anon_Bucketinhost = js.native
  def valid(url: java.lang.String): scala.Boolean = js.native
}

