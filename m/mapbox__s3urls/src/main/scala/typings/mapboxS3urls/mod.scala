package typings.mapboxS3urls

import typings.mapboxS3urls.anon.Bucket
import typings.mapboxS3urls.anon.Bucketinhost
import typings.mapboxS3urls.mapboxS3urlsStrings.`bucket-in-host`
import typings.mapboxS3urls.mapboxS3urlsStrings.`bucket-in-path`
import typings.mapboxS3urls.mapboxS3urlsStrings.s3
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/s3urls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert_bucketinhost(url: String, to: `bucket-in-host`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(url.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convert_bucketinpath(url: String, to: `bucket-in-path`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(url.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convert_s3(url: String, to: s3): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(url.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromUrl(url: String): Bucket = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Bucket]
  
  inline def signed(
    url: String,
    expires: Double,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("signed")(url.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toUrl(bucket: String, key: String): Bucketinhost = (^.asInstanceOf[js.Dynamic].applyDynamic("toUrl")(bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Bucketinhost]
  
  inline def valid(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
