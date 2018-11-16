package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("activity")
  var activity_Original: KoLiteActivity = js.native
  def activity(options: KoLiteActivityOptions): JQuery = js.native
  def activityEx(isLoading: scala.Boolean): JQuery = js.native
}

