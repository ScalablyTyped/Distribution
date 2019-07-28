package typings.lokijs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ExactIndex")
@js.native
class ExactIndex[E /* <: js.Object */] protected () extends js.Object {
  def this(exactField: String) = this()
  var field: String = js.native
  var index: StringDictionary[js.UndefOr[js.Array[E]]] = js.native
  // clear will zap the index
  def clear(): Unit = js.native
  // get the values related to the key, could be more than one
  def get(key: String): js.UndefOr[js.Array[E]] = js.native
  def get(key: Double): js.UndefOr[js.Array[E]] = js.native
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: String, `val`: E): Unit = js.native
  def remove(key: Double, `val`: E): Unit = js.native
  // add the value you want returned to the key in the index
  def set(key: String, `val`: E): Unit = js.native
  def set(key: Double, `val`: E): Unit = js.native
}

