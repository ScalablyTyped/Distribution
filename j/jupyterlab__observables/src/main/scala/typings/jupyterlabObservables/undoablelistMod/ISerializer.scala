package typings.jupyterlabObservables.undoablelistMod

import typings.luminoCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISerializer[T] extends js.Object {
  
  /**
    * Deserialize the object from JSON.
    */
  def fromJSON(value: JSONValue): T = js.native
  
  /**
    * Convert the object to JSON.
    */
  def toJSON(value: T): JSONValue = js.native
}
object ISerializer {
  
  @scala.inline
  def apply[T](fromJSON: JSONValue => T, toJSON: T => JSONValue): ISerializer[T] = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ISerializer[T]]
  }
  
  @scala.inline
  implicit class ISerializerOps[Self <: ISerializer[_], T] (val x: Self with ISerializer[T]) extends AnyVal {
    
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
    def setFromJSON(value: JSONValue => T): Self = this.set("fromJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: T => JSONValue): Self = this.set("toJSON", js.Any.fromFunction1(value))
  }
}
