package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ PanelBarActivateEvent, scala.Unit]] = js.undefined
  var animation: js.UndefOr[scala.Boolean | PanelBarAnimation] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ PanelBarCollapseEvent, scala.Unit]] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ PanelBarContentLoadEvent, scala.Unit]] = js.undefined
  var contentUrls: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ PanelBarDataBoundEvent, scala.Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[java.lang.String] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ PanelBarErrorEvent, scala.Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ PanelBarExpandEvent, scala.Unit]] = js.undefined
  var expandMode: js.UndefOr[java.lang.String] = js.undefined
  var loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[PanelBarMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ PanelBarSelectEvent, scala.Unit]] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

