package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | TreeViewAnimation] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var autoScroll: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TreeViewEvent, scala.Unit]] = js.undefined
  var check: js.UndefOr[js.Function1[/* e */ TreeViewCheckEvent, scala.Unit]] = js.undefined
  var checkboxes: js.UndefOr[scala.Boolean | TreeViewCheckboxes] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ TreeViewCollapseEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeViewDataBoundEvent, scala.Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[java.lang.String] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[java.lang.String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ TreeViewDragEvent, scala.Unit]] = js.undefined
  var dragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ TreeViewDragendEvent, scala.Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeViewDragstartEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ TreeViewDropEvent, scala.Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ TreeViewExpandEvent, scala.Unit]] = js.undefined
  var loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[TreeViewMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ TreeViewNavigateEvent, scala.Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ TreeViewSelectEvent, scala.Unit]] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object TreeViewOptions {
  @scala.inline
  def apply(
    animation: scala.Boolean | TreeViewAnimation = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    autoScroll: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ TreeViewEvent, scala.Unit] = null,
    check: js.Function1[/* e */ TreeViewCheckEvent, scala.Unit] = null,
    checkboxes: scala.Boolean | TreeViewCheckboxes = null,
    collapse: js.Function1[/* e */ TreeViewCollapseEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ TreeViewDataBoundEvent, scala.Unit] = null,
    dataImageUrlField: java.lang.String = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource = null,
    dataSpriteCssClassField: java.lang.String = null,
    dataTextField: java.lang.String | js.Any = null,
    dataUrlField: java.lang.String = null,
    drag: js.Function1[/* e */ TreeViewDragEvent, scala.Unit] = null,
    dragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    dragend: js.Function1[/* e */ TreeViewDragendEvent, scala.Unit] = null,
    dragstart: js.Function1[/* e */ TreeViewDragstartEvent, scala.Unit] = null,
    drop: js.Function1[/* e */ TreeViewDropEvent, scala.Unit] = null,
    expand: js.Function1[/* e */ TreeViewExpandEvent, scala.Unit] = null,
    loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined,
    messages: TreeViewMessages = null,
    name: java.lang.String = null,
    navigate: js.Function1[/* e */ TreeViewNavigateEvent, scala.Unit] = null,
    select: js.Function1[/* e */ TreeViewSelectEvent, scala.Unit] = null,
    template: java.lang.String | js.Function = null
  ): TreeViewOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll)
    if (change != null) __obj.updateDynamic("change")(change)
    if (check != null) __obj.updateDynamic("check")(check)
    if (checkboxes != null) __obj.updateDynamic("checkboxes")(checkboxes.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClassField != null) __obj.updateDynamic("dataSpriteCssClassField")(dataSpriteCssClassField)
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop)
    if (dragend != null) __obj.updateDynamic("dragend")(dragend)
    if (dragstart != null) __obj.updateDynamic("dragstart")(dragstart)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (select != null) __obj.updateDynamic("select")(select)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewOptions]
  }
}

