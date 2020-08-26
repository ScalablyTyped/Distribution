package typings.knockout.mod.utils

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingOptions[T] extends js.Object {
  var afterAdd: js.UndefOr[MappingHookFunction[T]] = js.native
  var afterMove: js.UndefOr[MappingHookFunction[T]] = js.native
  var afterRemove: js.UndefOr[MappingHookFunction[T]] = js.native
  var beforeMove: js.UndefOr[MappingHookFunction[T]] = js.native
  var beforeRemove: js.UndefOr[MappingHookFunction[T]] = js.native
  var dontLimitMoves: js.UndefOr[Boolean] = js.native
}

object MappingOptions {
  @scala.inline
  def apply[T](): MappingOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingOptions[T]]
  }
  @scala.inline
  implicit class MappingOptionsOps[Self <: MappingOptions[_], T] (val x: Self with MappingOptions[T]) extends AnyVal {
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
    def setAfterAdd(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = this.set("afterAdd", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterAdd: Self = this.set("afterAdd", js.undefined)
    @scala.inline
    def setAfterMove(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = this.set("afterMove", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterMove: Self = this.set("afterMove", js.undefined)
    @scala.inline
    def setAfterRemove(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = this.set("afterRemove", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterRemove: Self = this.set("afterRemove", js.undefined)
    @scala.inline
    def setBeforeMove(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = this.set("beforeMove", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeMove: Self = this.set("beforeMove", js.undefined)
    @scala.inline
    def setBeforeRemove(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = this.set("beforeRemove", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeRemove: Self = this.set("beforeRemove", js.undefined)
    @scala.inline
    def setDontLimitMoves(value: Boolean): Self = this.set("dontLimitMoves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontLimitMoves: Self = this.set("dontLimitMoves", js.undefined)
  }
  
}

