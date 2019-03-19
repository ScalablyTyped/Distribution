package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ExactIndex")
@js.native
class ExactIndex[E /* <: js.Object */] protected () extends js.Object {
  def this(exactField: java.lang.String) = this()
  var field: java.lang.String = js.native
  var index: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[E]]] = js.native
  // clear will zap the index
  def clear(): scala.Unit = js.native
  // get the values related to the key, could be more than one
  def get(key: java.lang.String): js.UndefOr[js.Array[E]] = js.native
  def get(key: scala.Double): js.UndefOr[js.Array[E]] = js.native
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: java.lang.String, `val`: E): scala.Unit = js.native
  def remove(key: scala.Double, `val`: E): scala.Unit = js.native
  // add the value you want returned to the key in the index
  def set(key: java.lang.String, `val`: E): scala.Unit = js.native
  def set(key: scala.Double, `val`: E): scala.Unit = js.native
}

