package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonImg extends js.Object {
  /**
    * This attribute defines the alternative text describing the image. Users will see this text displayed if the image URL is wrong, the image is not in one of the supported formats, or if the image is not yet downloaded.
    */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the img fails to load
    */
  var onIonError: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the image has finished loading
    */
  var onIonImgDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the img src has been set
    */
  var onIonImgWillLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * The image URL. This attribute is mandatory for the `<img>` element.
    */
  var src: js.UndefOr[String] = js.undefined
}

object IonImg {
  @scala.inline
  def apply(
    alt: String = null,
    onIonError: /* event */ CustomEvent[Unit] => Unit = null,
    onIonImgDidLoad: /* event */ CustomEvent[Unit] => Unit = null,
    onIonImgWillLoad: /* event */ CustomEvent[Unit] => Unit = null,
    src: String = null
  ): IonImg = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (onIonError != null) __obj.updateDynamic("onIonError")(js.Any.fromFunction1(onIonError))
    if (onIonImgDidLoad != null) __obj.updateDynamic("onIonImgDidLoad")(js.Any.fromFunction1(onIonImgDidLoad))
    if (onIonImgWillLoad != null) __obj.updateDynamic("onIonImgWillLoad")(js.Any.fromFunction1(onIonImgWillLoad))
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonImg]
  }
}

