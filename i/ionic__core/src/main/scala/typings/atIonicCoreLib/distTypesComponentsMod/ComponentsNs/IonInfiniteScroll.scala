package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonInfiniteScroll extends js.Object {
  /**
    * If `true`, the infinite scroll will be hidden and scroll event listeners will be removed.  Set this to true to disable the infinite scroll from actively trying to receive new data while scrolling. This is useful when it is known that there is no more data that can be added, and the infinite scroll is no longer needed.
    */
  var disabled: scala.Boolean
  /**
    * The position of the infinite scroll element. The value can be either `top` or `bottom`.
    */
  var position: atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom
  /**
    * The threshold distance from the bottom of the content to call the `infinite` output event when scrolled. The threshold value can be either a percent, or in pixels. For example, use the value of `10%` for the `infinite` output event to get called when the user has scrolled 10% from the bottom of the page. Use the value `100px` when the scroll is within 100 pixels from the bottom of the page.
    */
  var threshold: java.lang.String
  /**
    * Call `complete()` within the `ionInfinite` output event handler when your async operation has completed. For example, the `loading` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request to add more items to a data list. Once the data has been received and UI updated, you then call this method to signify that the loading has completed. This method will change the infinite scroll's state from `loading` to `enabled`.
    */
  def complete(): scala.Unit
}

object IonInfiniteScroll {
  @scala.inline
  def apply(
    complete: () => scala.Unit,
    disabled: scala.Boolean,
    position: atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom,
    threshold: java.lang.String
  ): IonInfiniteScroll = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), disabled = disabled, position = position.asInstanceOf[js.Any], threshold = threshold)
  
    __obj.asInstanceOf[IonInfiniteScroll]
  }
}

