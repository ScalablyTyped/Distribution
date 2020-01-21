package typings.jupyterlabObservables.observablemapMod.IObservableMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The changed args object which is emitted by an observable map.
  */
trait IChangedArgs[T] extends js.Object {
  /**
    * The key of the change.
    */
  var key: String
  /**
    * The new value of the change.
    */
  var newValue: js.UndefOr[T] = js.undefined
  /**
    * The old value of the change.
    */
  var oldValue: js.UndefOr[T] = js.undefined
  /**
    * The type of change undergone by the map.
    */
  var `type`: ChangeType
}

object IChangedArgs {
  @scala.inline
  def apply[T](key: String, `type`: ChangeType, newValue: T = null, oldValue: T = null): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs[T]]
  }
}

