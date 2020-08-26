package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonImg extends js.Object {
  /**
    * This attribute defines the alternative text describing the image. Users will see this text displayed if the image URL is wrong, the image is not in one of the supported formats, or if the image is not yet downloaded.
    */
  var alt: js.UndefOr[String] = js.native
  /**
    * Emitted when the img fails to load
    */
  var onIonError: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the image has finished loading
    */
  var onIonImgDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the img src has been set
    */
  var onIonImgWillLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * The image URL. This attribute is mandatory for the `<img>` element.
    */
  var src: js.UndefOr[String] = js.native
}

object IonImg {
  @scala.inline
  def apply(): IonImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonImg]
  }
  @scala.inline
  implicit class IonImgOps[Self <: IonImg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setOnIonError(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonError: Self = this.set("onIonError", js.undefined)
    @scala.inline
    def setOnIonImgDidLoad(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonImgDidLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonImgDidLoad: Self = this.set("onIonImgDidLoad", js.undefined)
    @scala.inline
    def setOnIonImgWillLoad(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonImgWillLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonImgWillLoad: Self = this.set("onIonImgWillLoad", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

