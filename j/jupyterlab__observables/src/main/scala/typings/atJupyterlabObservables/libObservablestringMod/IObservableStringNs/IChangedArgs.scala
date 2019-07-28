package typings.atJupyterlabObservables.libObservablestringMod.IObservableStringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The changed args object which is emitted by an observable string.
  */
trait IChangedArgs extends js.Object {
  /**
    * The end index of the change.
    */
  var end: Double
  /**
    * The starting index of the change.
    */
  var start: Double
  /**
    * The type of change undergone by the list.
    */
  var `type`: ChangeType
  /**
    * The value of the change.
    *
    * ### Notes
    * If `ChangeType` is `set`, then
    * this is the new value of the string.
    *
    * If `ChangeType` is `insert` this is
    * the value of the inserted string.
    *
    * If `ChangeType` is remove this is the
    * value of the removed substring.
    */
  var value: String
}

object IChangedArgs {
  @scala.inline
  def apply(end: Double, start: Double, `type`: ChangeType, value: String): IChangedArgs = {
    val __obj = js.Dynamic.literal(end = end, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IChangedArgs]
  }
}

