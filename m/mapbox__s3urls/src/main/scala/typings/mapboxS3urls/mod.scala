package typings.mapboxS3urls

import typings.mapboxS3urls.anon.Bucket
import typings.mapboxS3urls.anon.Bucketinhost
import typings.mapboxS3urls.mapboxS3urlsStrings.`bucket-in-host`
import typings.mapboxS3urls.mapboxS3urlsStrings.`bucket-in-path`
import typings.mapboxS3urls.mapboxS3urlsStrings.s3
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mapbox/s3urls", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("convert")
  def convert_bucketinhost(url: String, to: `bucket-in-host`): String = js.native
  @JSName("convert")
  def convert_bucketinpath(url: String, to: `bucket-in-path`): String = js.native
  @JSName("convert")
  def convert_s3(url: String, to: s3): String = js.native
  
  def fromUrl(url: String): Bucket = js.native
  
  def signed(
    url: String,
    expires: Double,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]
  ): Unit = js.native
  
  def toUrl(bucket: String, key: String): Bucketinhost = js.native
  
  def valid(url: String): Boolean = js.native
}
