package typings.atIonicCore

import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/img/img", JSImport.Namespace)
@js.native
object distTypesComponentsImgImgMod extends js.Object {
  @js.native
  class Img () extends ComponentInterface {
    var addIO: js.Any = js.native
    /**
      * This attribute defines the alternative text describing the image.
      * Users will see this text displayed if the image URL is wrong,
      * the image is not in one of the supported formats, or if the image is not yet downloaded.
      */
    var alt: js.UndefOr[String] = js.native
    var el: HTMLElement = js.native
    var io: js.UndefOr[js.Any] = js.native
    /** Emitted when the img fails to load */
    var ionError: EventEmitter[Unit] = js.native
    /** Emitted when the image has finished loading */
    var ionImgDidLoad: EventEmitter[Unit] = js.native
    /** Emitted when the img src has been set */
    var ionImgWillLoad: EventEmitter[Unit] = js.native
    var load: js.Any = js.native
    var loadError: js.UndefOr[js.Function0[Unit]] = js.native
    var loadSrc: js.UndefOr[String] = js.native
    var onError: js.Any = js.native
    var onLoad: js.Any = js.native
    var removeIO: js.Any = js.native
    /**
      * The image URL. This attribute is mandatory for the `<img>` element.
      */
    var src: js.UndefOr[String] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MImg(): Unit = js.native
    @JSName("render")
    def render_MImg(): js.Any = js.native
    def srcChanged(): Unit = js.native
  }
  
}

