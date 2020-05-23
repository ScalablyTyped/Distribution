package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchicalDataSource extends js.Object {
  def dataAt(path: js.Object, keyspath: js.Object): Unit
  def dataBind(callback: js.Object, callee: js.Object): Unit
  def root(): Unit
}

object HierarchicalDataSource {
  @scala.inline
  def apply(dataAt: (js.Object, js.Object) => Unit, dataBind: (js.Object, js.Object) => Unit, root: () => Unit): HierarchicalDataSource = {
    val __obj = js.Dynamic.literal(dataAt = js.Any.fromFunction2(dataAt), dataBind = js.Any.fromFunction2(dataBind), root = js.Any.fromFunction0(root))
    __obj.asInstanceOf[HierarchicalDataSource]
  }
}

