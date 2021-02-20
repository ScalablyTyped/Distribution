package typings.jest.mod.jest

import typings.jest.jestStrings.`return`
import typings.jest.jestStrings.`throw`
import typings.jest.jestStrings.incomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jest.mod.jest.MockResultReturn[T]
  - typings.jest.mod.jest.MockResultThrow
  - typings.jest.mod.jest.MockResultIncomplete
*/
trait MockResult[T] extends StObject
object MockResult {
  
  @scala.inline
  def MockResultIncomplete(`type`: incomplete): typings.jest.mod.jest.MockResultIncomplete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jest.mod.jest.MockResultIncomplete]
  }
  
  @scala.inline
  def MockResultReturn[T](`type`: `return`, value: T): typings.jest.mod.jest.MockResultReturn[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jest.mod.jest.MockResultReturn[T]]
  }
  
  @scala.inline
  def MockResultThrow(`type`: `throw`, value: js.Any): typings.jest.mod.jest.MockResultThrow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jest.mod.jest.MockResultThrow]
  }
}
