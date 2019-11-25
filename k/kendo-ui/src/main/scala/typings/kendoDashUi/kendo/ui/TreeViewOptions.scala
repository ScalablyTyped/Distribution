package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewOptions extends js.Object {
  var animation: js.UndefOr[Boolean | TreeViewAnimation] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TreeViewEvent, Unit]] = js.undefined
  var check: js.UndefOr[js.Function1[/* e */ TreeViewCheckEvent, Unit]] = js.undefined
  var checkboxes: js.UndefOr[Boolean | TreeViewCheckboxes] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ TreeViewCollapseEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeViewDataBoundEvent, Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  var dataTextField: js.UndefOr[String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ TreeViewDragEvent, Unit]] = js.undefined
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ TreeViewDragendEvent, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeViewDragstartEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ TreeViewDropEvent, Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ TreeViewExpandEvent, Unit]] = js.undefined
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[TreeViewMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ TreeViewNavigateEvent, Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ TreeViewSelectEvent, Unit]] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
}

object TreeViewOptions {
  @scala.inline
  def apply(
    animation: Boolean | TreeViewAnimation = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ TreeViewEvent => Unit = null,
    check: /* e */ TreeViewCheckEvent => Unit = null,
    checkboxes: Boolean | TreeViewCheckboxes = null,
    collapse: /* e */ TreeViewCollapseEvent => Unit = null,
    dataBound: /* e */ TreeViewDataBoundEvent => Unit = null,
    dataImageUrlField: String = null,
    dataSource: js.Any | HierarchicalDataSource = null,
    dataSpriteCssClassField: String = null,
    dataTextField: String | js.Any = null,
    dataUrlField: String = null,
    drag: /* e */ TreeViewDragEvent => Unit = null,
    dragAndDrop: js.UndefOr[Boolean] = js.undefined,
    dragend: /* e */ TreeViewDragendEvent => Unit = null,
    dragstart: /* e */ TreeViewDragstartEvent => Unit = null,
    drop: /* e */ TreeViewDropEvent => Unit = null,
    expand: /* e */ TreeViewExpandEvent => Unit = null,
    loadOnDemand: js.UndefOr[Boolean] = js.undefined,
    messages: TreeViewMessages = null,
    name: String = null,
    navigate: /* e */ TreeViewNavigateEvent => Unit = null,
    select: /* e */ TreeViewSelectEvent => Unit = null,
    template: String | js.Function = null
  ): TreeViewOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (check != null) __obj.updateDynamic("check")(js.Any.fromFunction1(check))
    if (checkboxes != null) __obj.updateDynamic("checkboxes")(checkboxes.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1(collapse))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClassField != null) __obj.updateDynamic("dataSpriteCssClassField")(dataSpriteCssClassField.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop.asInstanceOf[js.Any])
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewOptions]
  }
}

