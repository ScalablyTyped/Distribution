package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynaTreeDNDOptions extends js.Object {
  var autoExpandMS: js.UndefOr[Double] = js.native
   // Callback(sourceNode)
  // Make tree nodes accept draggables
  var onDragEnter: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, Unit]] = js.native
   // Callback(targetNode, sourceNode, hitMode)
  var onDragLeave: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, Unit]] = js.native
   // Callback(targetNode, sourceNode)
  var onDragOver: js.UndefOr[
    js.Function3[/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String, Unit]
  ] = js.native
   // true: slide helper back to source if drop is rejected
  // Make tree nodes draggable:
  var onDragStart: js.UndefOr[js.Function1[/* sourceNode */ js.Any, Unit]] = js.native
   // Callback(sourceNode), return true, to enable dnd
  var onDragStop: js.UndefOr[js.Function1[/* sourceNode */ js.Any, Unit]] = js.native
    // Callback(targetNode, sourceNode, hitMode)
  var onDrop: js.UndefOr[
    js.Function3[/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String, Unit]
  ] = js.native
   // Expand nodes after n milliseconds of hovering.
  var preventVoidMoves: js.UndefOr[Boolean] = js.native
   // Prevent dropping nodes 'before self', etc.
  var revert: Boolean = js.native
}

object DynaTreeDNDOptions {
  @scala.inline
  def apply(revert: Boolean): DynaTreeDNDOptions = {
    val __obj = js.Dynamic.literal(revert = revert.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeDNDOptions]
  }
  @scala.inline
  implicit class DynaTreeDNDOptionsOps[Self <: DynaTreeDNDOptions] (val x: Self) extends AnyVal {
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
    def setRevert(value: Boolean): Self = this.set("revert", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoExpandMS(value: Double): Self = this.set("autoExpandMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoExpandMS: Self = this.set("autoExpandMS", js.undefined)
    @scala.inline
    def setOnDragEnter(value: (/* targetNode */ js.Any, /* sourceNode */ js.Any) => Unit): Self = this.set("onDragEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragLeave(value: (/* targetNode */ js.Any, /* sourceNode */ js.Any) => Unit): Self = this.set("onDragLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: (/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String) => Unit): Self = this.set("onDragOver", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* sourceNode */ js.Any => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragStop(value: /* sourceNode */ js.Any => Unit): Self = this.set("onDragStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStop: Self = this.set("onDragStop", js.undefined)
    @scala.inline
    def setOnDrop(value: (/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String) => Unit): Self = this.set("onDrop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setPreventVoidMoves(value: Boolean): Self = this.set("preventVoidMoves", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventVoidMoves: Self = this.set("preventVoidMoves", js.undefined)
  }
  
}

