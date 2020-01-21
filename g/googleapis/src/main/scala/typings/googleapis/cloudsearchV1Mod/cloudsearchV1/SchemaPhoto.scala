package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s photo.
  */
@js.native
trait SchemaPhoto extends js.Object {
  /**
    * The URL of the photo.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaPhoto {
  @scala.inline
  def apply(url: String = null): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPhoto]
  }
}

