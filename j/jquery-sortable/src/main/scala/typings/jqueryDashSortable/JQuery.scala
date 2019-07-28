package typings.jqueryDashSortable

import typings.jqueryDashSortable.JQuerySortableNs.Options
import typings.jqueryDashSortable.jqueryDashSortableStrings.destroy
import typings.jqueryDashSortable.jqueryDashSortableStrings.disable
import typings.jqueryDashSortable.jqueryDashSortableStrings.enable
import typings.jqueryDashSortable.jqueryDashSortableStrings.refresh
import typings.jqueryDashSortable.jqueryDashSortableStrings.serialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def sortable(): JQuery = js.native
  def sortable(methodName: String): JQuery = js.native
  def sortable(options: Options): JQuery = js.native
  @JSName("sortable")
  def sortable_destroy(methodName: destroy): JQuery = js.native
  @JSName("sortable")
  def sortable_disable(methodName: disable): JQuery = js.native
  @JSName("sortable")
  def sortable_enable(methodName: enable): JQuery = js.native
  @JSName("sortable")
  def sortable_refresh(methodName: refresh): JQuery = js.native
  @JSName("sortable")
  def sortable_serialize(methodName: serialize): JQuery = js.native
}

