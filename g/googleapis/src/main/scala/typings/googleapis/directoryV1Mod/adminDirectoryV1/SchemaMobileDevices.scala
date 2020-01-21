package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Mobile Devices operation in Directory API.
  */
@js.native
trait SchemaMobileDevices extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of Mobile Device objects.
    */
  var mobiledevices: js.UndefOr[js.Array[SchemaMobileDevice]] = js.native
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaMobileDevices {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    mobiledevices: js.Array[SchemaMobileDevice] = null,
    nextPageToken: String = null
  ): SchemaMobileDevices = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobiledevices != null) __obj.updateDynamic("mobiledevices")(mobiledevices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileDevices]
  }
}

