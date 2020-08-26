package typings.jupyterlabCoreutils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChangedArgs[T, OldT, U /* <: String */] extends js.Object {
  /**
    * The name of the changed attribute.
    */
  var name: U = js.native
  /**
    * The new value of the changed attribute.
    */
  var newValue: T = js.native
  /**
    * The old value of the changed attribute.
    */
  var oldValue: OldT = js.native
}

object IChangedArgs {
  @scala.inline
  def apply[T, OldT, /* <: java.lang.String */ U](name: U, newValue: T, oldValue: OldT): IChangedArgs[T, OldT, U] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs[T, OldT, U]]
  }
  @scala.inline
  implicit class IChangedArgsOps[Self <: IChangedArgs[_, _, _], T, OldT, /* <: java.lang.String */ U] (val x: Self with (IChangedArgs[T, OldT, U])) extends AnyVal {
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
    def setName(value: U): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: T): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: OldT): Self = this.set("oldValue", value.asInstanceOf[js.Any])
  }
  
}

