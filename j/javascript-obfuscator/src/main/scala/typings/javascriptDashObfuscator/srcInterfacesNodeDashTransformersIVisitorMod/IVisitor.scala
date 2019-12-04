package typings.javascriptDashObfuscator.srcInterfacesNodeDashTransformersIVisitorMod

import typings.estraverse.estraverseMod.VisitorOption
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisitor[T /* <: Node */] extends js.Object {
  var enter: js.UndefOr[
    js.Function2[/* node */ T, /* parentNode */ Node | Null, Node | VisitorOption | Unit]
  ] = js.undefined
  var leave: js.UndefOr[
    js.Function2[/* node */ T, /* parentNode */ Node | Null, Node | VisitorOption | Unit]
  ] = js.undefined
}

object IVisitor {
  @scala.inline
  def apply[T /* <: Node */](
    enter: (/* node */ T, /* parentNode */ Node | Null) => Node | VisitorOption | Unit = null,
    leave: (/* node */ T, /* parentNode */ Node | Null) => Node | VisitorOption | Unit = null
  ): IVisitor[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2(enter))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2(leave))
    __obj.asInstanceOf[IVisitor[T]]
  }
}

