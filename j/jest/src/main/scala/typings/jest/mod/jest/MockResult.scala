package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jest.mod.jest.MockResultReturn[T]
  - typings.jest.mod.jest.MockResultThrow
  - typings.jest.mod.jest.MockResultIncomplete
*/
trait MockResult[T] extends StObject
object MockResult {
  
  inline def MockResultIncomplete(value: Unit): typings.jest.mod.jest.MockResultIncomplete = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("incomplete")
    __obj.asInstanceOf[typings.jest.mod.jest.MockResultIncomplete]
  }
  
  inline def MockResultReturn[T](value: T): typings.jest.mod.jest.MockResultReturn[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("return")
    __obj.asInstanceOf[typings.jest.mod.jest.MockResultReturn[T]]
  }
  
  inline def MockResultThrow(value: js.Any): typings.jest.mod.jest.MockResultThrow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("throw")
    __obj.asInstanceOf[typings.jest.mod.jest.MockResultThrow]
  }
}
