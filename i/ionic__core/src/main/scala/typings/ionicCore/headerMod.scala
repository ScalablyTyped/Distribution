package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.condense
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/header/header", JSImport.Namespace)
@js.native
object headerMod extends js.Object {
  @js.native
  class Header () extends ComponentInterface {
    var checkCollapsibleHeader: js.Any = js.native
    /**
      * Describes the scroll effect that will be applied to the header
      * `condense` only applies in iOS mode.
      *
      * Typically used for [Collapsible Large Titles](https://ionicframework.com/docs/api/title#collapsible-large-titles)
      */
    var collapse: js.UndefOr[condense] = js.native
    var collapsibleHeaderInitialized: js.Any = js.native
    var collapsibleMainHeader: js.Any = js.native
    var contentScrollCallback: js.Any = js.native
    var destroyCollapsibleHeader: js.Any = js.native
    var el: HTMLElement = js.native
    var intersectionObserver: js.Any = js.native
    var scrollEl: js.Any = js.native
    var setupCollapsibleHeader: js.Any = js.native
    /**
      * If `true`, the header will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      *
      * Note: In order to scroll content behind the header, the `fullscreen`
      * attribute needs to be set on the content.
      */
    var translucent: Boolean = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MHeader(): js.Promise[Unit] = js.native
    def componentDidUnload(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHeader(): js.Promise[Unit] = js.native
    @JSName("render")
    def render_MHeader(): js.Any = js.native
  }
  
}

