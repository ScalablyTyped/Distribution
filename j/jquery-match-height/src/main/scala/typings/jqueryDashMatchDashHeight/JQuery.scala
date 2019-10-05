package typings.jqueryDashMatchDashHeight

import typings.jqueryDashMatchDashHeight.JQueryMatchHeight.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("matchHeight")
  var matchHeight_Original: JQueryMatchHeight = js.native
  /**
    * Set all selected elements to the height of the tallest.
    * If the items are on multiple rows, the items of each row will be set to the tallest of that row.
    */
  def matchHeight(): JQuery = js.native
  def matchHeight(options: Options): JQuery = js.native
}

