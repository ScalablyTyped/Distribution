package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListViewOptions extends js.Object {
  var appendOnRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ ListViewClickEvent, scala.Unit]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.DataSource | js.Any] = js.undefined
  var endlessScroll: js.UndefOr[scala.Boolean] = js.undefined
  var filterable: js.UndefOr[scala.Boolean | ListViewFilterable] = js.undefined
  var fixedHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var itemChange: js.UndefOr[js.Function1[/* e */ ListViewEvent, scala.Unit]] = js.undefined
  var loadMore: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[ListViewMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pullParameters: js.UndefOr[js.Function] = js.undefined
  var pullToRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var virtualViewSize: js.UndefOr[scala.Double] = js.undefined
}

