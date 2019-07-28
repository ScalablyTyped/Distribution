package typings.atJupyterlabCoreutils.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangedArgs[T] extends js.Object {
  /**
    * The name of the changed attribute.
    */
  var name: String
  /**
    * The new value of the changed attribute.
    */
  var newValue: T
  /**
    * The old value of the changed attribute.
    */
  var oldValue: T
}

object IChangedArgs {
  @scala.inline
  def apply[T](name: String, newValue: T, oldValue: T): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal(name = name, newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IChangedArgs[T]]
  }
}

