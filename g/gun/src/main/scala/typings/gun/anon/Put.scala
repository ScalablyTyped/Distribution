package typings.gun.anon

import typings.gun.mod.Gun.DisallowArray
import typings.gun.mod.Gun.Saveable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Put[DataType] extends StObject {
  
  def put(data: DisallowArray[Saveable[DataType]]): Unit
}
object Put {
  
  @scala.inline
  def apply[DataType](put: DisallowArray[Saveable[DataType]] => Unit): Put[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1(put))
    __obj.asInstanceOf[Put[DataType]]
  }
  
  @scala.inline
  implicit class PutMutableBuilder[Self <: Put[?], DataType] (val x: Self & Put[DataType]) extends AnyVal {
    
    @scala.inline
    def setPut(value: DisallowArray[Saveable[DataType]] => Unit): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
  }
}
