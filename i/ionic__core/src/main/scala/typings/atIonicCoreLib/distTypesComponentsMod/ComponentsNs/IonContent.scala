package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonContent extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.native
  /**
    * If `true` and the content does not cause an overflow scroll, the scroll interaction will cause a bounce. If the content exceeds the bounds of ionContent, nothing will change. Note, the does not disable the system bounce on iOS. That is an OS level setting.
    */
  var forceOverscroll: js.UndefOr[scala.Boolean] = js.native
  /**
    * If `true`, the content will scroll behind the headers and footers. This effect can easily be seen by setting the toolbar to transparent.
    */
  var fullscreen: scala.Boolean = js.native
  /**
    * Because of performance reasons, ionScroll events are disabled by default, in order to enable them and start listening from (ionScroll), set this property to `true`.
    */
  var scrollEvents: scala.Boolean = js.native
  /**
    * If you want to enable the content scrolling in the X axis, set this property to `true`.
    */
  var scrollX: scala.Boolean = js.native
  /**
    * If you want to disable the content scrolling in the Y axis, set this property to `false`.
    */
  var scrollY: scala.Boolean = js.native
  /**
    * Returns the element where the actual scrolling takes places. This element is the one you could subscribe to `scroll` events or manually modify `scrollTop`, however, it's recommended to use the API provided by `ion-content`:  Ie. Using `ionScroll`, `ionScrollStart`, `ionScrollEnd` for scrolling events and scrollToPoint() to scroll the content into a certain point.
    */
  def getScrollElement(): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * Scroll by a specified X/Y distance in the component
    */
  def scrollByPoint(x: scala.Double, y: scala.Double, duration: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Scroll to the bottom of the component
    */
  def scrollToBottom(): js.Promise[scala.Unit] = js.native
  def scrollToBottom(duration: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], duration: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: js.UndefOr[scala.Nothing], y: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: js.UndefOr[scala.Nothing], y: scala.Double, duration: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: js.UndefOr[scala.Nothing], y: scala.Null, duration: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: scala.Double, y: js.UndefOr[scala.Nothing], duration: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Scroll to a specified X/Y location in the component
    */
  def scrollToPoint(x: scala.Double, y: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: scala.Double, y: scala.Double, duration: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: scala.Double, y: scala.Null, duration: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: scala.Null, y: js.UndefOr[scala.Nothing], duration: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: scala.Null, y: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: scala.Null, y: scala.Double, duration: scala.Double): js.Promise[scala.Unit] = js.native
  def scrollToPoint(x: scala.Null, y: scala.Null, duration: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Scroll to the top of the component
    */
  def scrollToTop(): js.Promise[scala.Unit] = js.native
  def scrollToTop(duration: scala.Double): js.Promise[scala.Unit] = js.native
}

