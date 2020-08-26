package typings.jointjs.mod.connectionPoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericConnectionPointJSON[K /* <: ConnectionPointType */] extends js.Object {
  var args: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
  ] = js.native
  var name: K = js.native
}

object GenericConnectionPointJSON {
  @scala.inline
  def apply[/* <: typings.jointjs.mod.connectionPoints.ConnectionPointType */ K](name: K): GenericConnectionPointJSON[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericConnectionPointJSON[K]]
  }
  @scala.inline
  implicit class GenericConnectionPointJSONOps[Self <: GenericConnectionPointJSON[_], /* <: typings.jointjs.mod.connectionPoints.ConnectionPointType */ K] (val x: Self with GenericConnectionPointJSON[K]) extends AnyVal {
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
    def setName(value: K): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
    ): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
  }
  
}

