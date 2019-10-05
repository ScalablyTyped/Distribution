package typings.atJupyterlabObservables.libObservablelistMod.IObservableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The changed args object which is emitted by an observable list.
  */
trait IChangedArgs[T] extends js.Object {
  /**
    * The new index associated with the change.
    */
  var newIndex: Double
  /**
    * The new values associated with the change.
    *
    * #### Notes
    * The values will be contiguous starting at the `newIndex`.
    */
  var newValues: js.Array[T]
  /**
    * The old index associated with the change.
    */
  var oldIndex: Double
  /**
    * The old values associated with the change.
    *
    * #### Notes
    * The values will be contiguous starting at the `oldIndex`.
    */
  var oldValues: js.Array[T]
  /**
    * The type of change undergone by the vector.
    */
  var `type`: ChangeType
}

object IChangedArgs {
  @scala.inline
  def apply[T](
    newIndex: Double,
    newValues: js.Array[T],
    oldIndex: Double,
    oldValues: js.Array[T],
    `type`: ChangeType
  ): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal(newIndex = newIndex, newValues = newValues, oldIndex = oldIndex, oldValues = oldValues)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IChangedArgs[T]]
  }
}

