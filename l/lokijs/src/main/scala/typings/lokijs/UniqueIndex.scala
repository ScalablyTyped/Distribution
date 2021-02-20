package typings.lokijs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueIndex[E /* <: js.Object */] extends StObject {
  
  def byId(id: Double): js.UndefOr[E] = js.native
  
  def clear(): Unit = js.native
  
  var field: /* keyof E */ String = js.native
  
  def get(key: String): js.UndefOr[E] = js.native
  def get(key: Double): js.UndefOr[E] = js.native
  
  var keyMap: StringDictionary[js.UndefOr[E]] = js.native
  
  var lokiMap: NumberDictionary[js.UndefOr[String | Double]] = js.native
  
  def remove(key: String): Unit = js.native
  
  def set(obj: E): Unit = js.native
  
  /**
    * Updates a document's unique index given an updated object.
    * @param  {Object} obj Original document object
    * @param  {Object} doc New document object (likely the same as obj)
    */
  def update(obj: E, doc: js.Any): Unit = js.native
}
