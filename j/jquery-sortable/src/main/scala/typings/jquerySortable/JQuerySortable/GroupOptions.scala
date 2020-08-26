package typings.jquerySortable.JQuerySortable

import typings.jquerySortable.JQuery
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupOptions extends js.Object {
  var afterMove: js.UndefOr[
    js.Function3[
      /* $placeholder */ JQuery, 
      /* container */ Container, 
      /* $closestItemOrContainer */ JQuery, 
      Unit
    ]
  ] = js.native
  var containerPath: js.UndefOr[String] = js.native
  var containerSelector: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var distance: js.UndefOr[Double] = js.native
  var handle: js.UndefOr[String] = js.native
  var isValidTarget: js.UndefOr[js.Function2[/* $item */ JQuery, /* container */ Container, Boolean]] = js.native
  var itemPath: js.UndefOr[String] = js.native
  var itemSelector: js.UndefOr[String] = js.native
  var onCancel: js.UndefOr[OnCancelHandler] = js.native
  var onDrag: js.UndefOr[OnDragEventHandler] = js.native
  var onDragStart: js.UndefOr[GenericEventHandler] = js.native
  var onDrop: js.UndefOr[GenericEventHandler] = js.native
  var onMousedown: js.UndefOr[OnMousedownHandler] = js.native
  var placeholder: js.UndefOr[JQuery | js.Array[_] | Element | String] = js.native
  var pullPlaceholder: js.UndefOr[Boolean] = js.native
  var serialize: js.UndefOr[SerializeFunc] = js.native
  var tolerance: js.UndefOr[Double] = js.native
}

object GroupOptions {
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterMove(
      value: (/* $placeholder */ JQuery, /* container */ Container, /* $closestItemOrContainer */ JQuery) => Unit
    ): Self = this.set("afterMove", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterMove: Self = this.set("afterMove", js.undefined)
    @scala.inline
    def setContainerPath(value: String): Self = this.set("containerPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPath: Self = this.set("containerPath", js.undefined)
    @scala.inline
    def setContainerSelector(value: String): Self = this.set("containerSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerSelector: Self = this.set("containerSelector", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setIsValidTarget(value: (/* $item */ JQuery, /* container */ Container) => Boolean): Self = this.set("isValidTarget", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsValidTarget: Self = this.set("isValidTarget", js.undefined)
    @scala.inline
    def setItemPath(value: String): Self = this.set("itemPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemPath: Self = this.set("itemPath", js.undefined)
    @scala.inline
    def setItemSelector(value: String): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    @scala.inline
    def setOnCancel(
      value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = this.set("onCancel", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnDrag(
      value: (/* $item */ js.UndefOr[JQuery], /* position */ js.UndefOr[Position], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = this.set("onDrag", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragStart(
      value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = this.set("onDragStart", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(
      value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = this.set("onDrop", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnMousedown(
      value: (/* $item */ js.UndefOr[JQuery], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = this.set("onMousedown", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnMousedown: Self = this.set("onMousedown", js.undefined)
    @scala.inline
    def setPlaceholderVarargs(value: js.Any*): Self = this.set("placeholder", js.Array(value :_*))
    @scala.inline
    def setPlaceholder(value: JQuery | js.Array[_] | Element | String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPullPlaceholder(value: Boolean): Self = this.set("pullPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullPlaceholder: Self = this.set("pullPlaceholder", js.undefined)
    @scala.inline
    def setSerialize(value: (/* $parent */ JQuery, /* $children */ js.Any, /* parentIsContainer */ Boolean) => Unit): Self = this.set("serialize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
  
}

