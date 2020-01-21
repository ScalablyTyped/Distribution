package typings.jupyterlabObservables.undoablelistMod

import typings.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializer[T] extends js.Object {
  /**
    * Deserialize the object from JSON.
    */
  def fromJSON(value: JSONValue): T
  /**
    * Convert the object to JSON.
    */
  def toJSON(value: T): JSONValue
}

object ISerializer {
  @scala.inline
  def apply[T](fromJSON: JSONValue => T, toJSON: T => JSONValue): ISerializer[T] = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = js.Any.fromFunction1(toJSON))
  
    __obj.asInstanceOf[ISerializer[T]]
  }
}

