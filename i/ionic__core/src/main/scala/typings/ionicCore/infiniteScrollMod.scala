package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.top
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/infinite-scroll/infinite-scroll", JSImport.Namespace)
@js.native
object infiniteScrollMod extends js.Object {
  @js.native
  class InfiniteScroll () extends ComponentInterface {
    var canStart: js.Any = js.native
    var didFire: js.Any = js.native
    /**
      * If `true`, the infinite scroll will be hidden and scroll event listeners
      * will be removed.
      *
      * Set this to true to disable the infinite scroll from actively
      * trying to receive new data while scrolling. This is useful
      * when it is known that there is no more data that can be added, and
      * the infinite scroll is no longer needed.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    var enableScrollEvents: js.Any = js.native
    /**
      * Emitted when the scroll reaches
      * the threshold distance. From within your infinite handler,
      * you must call the infinite scroll's `complete()` method when
      * your async operation has completed.
      */
    var ionInfinite: EventEmitter[Unit] = js.native
    var isBusy: js.Any = js.native
    var isLoading: Boolean = js.native
    var onScroll: js.Any = js.native
    /**
      * The position of the infinite scroll element.
      * The value can be either `top` or `bottom`.
      */
    var position: top | bottom = js.native
    var scrollEl: js.Any = js.native
    var thrPc: js.Any = js.native
    var thrPx: js.Any = js.native
    /**
      * The threshold distance from the bottom
      * of the content to call the `infinite` output event when scrolled.
      * The threshold value can be either a percent, or
      * in pixels. For example, use the value of `10%` for the `infinite`
      * output event to get called when the user has scrolled 10%
      * from the bottom of the page. Use the value `100px` when the
      * scroll is within 100 pixels from the bottom of the page.
      */
    var threshold: String = js.native
    /**
      * Call `complete()` within the `ionInfinite` output event handler when
      * your async operation has completed. For example, the `loading`
      * state is while the app is performing an asynchronous operation,
      * such as receiving more data from an AJAX request to add more items
      * to a data list. Once the data has been received and UI updated, you
      * then call this method to signify that the loading has completed.
      * This method will change the infinite scroll's state from `loading`
      * to `enabled`.
      */
    def complete(): js.Promise[Unit] = js.native
    @JSName("connectedCallback")
    def connectedCallback_MInfiniteScroll(): js.Promise[Unit] = js.native
    /* protected */ def disabledChanged(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MInfiniteScroll(): Unit = js.native
    @JSName("render")
    def render_MInfiniteScroll(): js.Any = js.native
    /* protected */ def thresholdChanged(): Unit = js.native
  }
  
}

