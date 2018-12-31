package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Param extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** content type of a posted file. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** name of a posted file. */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** name of a posted parameter. */
  var name: java.lang.String
  /** value of a posted parameter or content of a posted file */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

