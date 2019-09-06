package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonImg extends js.Object {
  /**
    * This attribute defines the alternative text describing the image. Users will see this text displayed if the image URL is wrong, the image is not in one of the supported formats, or if the image is not yet downloaded.
    */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * The image URL. This attribute is mandatory for the `<img>` element.
    */
  var src: js.UndefOr[String] = js.undefined
}

object IonImg {
  @scala.inline
  def apply(alt: String = null, src: String = null): IonImg = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[IonImg]
  }
}

