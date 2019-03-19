package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UniqueIndex")
@js.native
class UniqueIndex[E /* <: js.Object */] protected () extends js.Object {
  def this(uniqueField: java.lang.String) = this()
  var field: java.lang.String = js.native
  var keyMap: org.scalablytyped.runtime.StringDictionary[js.UndefOr[E]] = js.native
  var lokiMap: org.scalablytyped.runtime.NumberDictionary[js.UndefOr[java.lang.String | scala.Double]] = js.native
  def byId(id: scala.Double): js.UndefOr[E] = js.native
  def clear(): scala.Unit = js.native
  def get(key: java.lang.String): js.UndefOr[E] = js.native
  def get(key: scala.Double): js.UndefOr[E] = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def set(obj: E): scala.Unit = js.native
  /**
    * Updates a document's unique index given an updated object.
    * @param  {Object} obj Original document object
    * @param  {Object} doc New document object (likely the same as obj)
    */
  def update(obj: E, doc: js.Any): scala.Unit = js.native
}

