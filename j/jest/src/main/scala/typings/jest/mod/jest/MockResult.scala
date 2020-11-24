package typings.jest.mod.jest

import typings.jest.jestStrings.`return`
import typings.jest.jestStrings.`throw`
import typings.jest.jestStrings.incomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jest.mod.jest.MockResultReturn[T]
  - typings.jest.mod.jest.MockResultThrow
  - typings.jest.mod.jest.MockResultIncomplete
*/
trait MockResult[T] extends js.Object
object MockResult {
  
  @scala.inline
  def MockResultReturn[T](`type`: `return`, value: T): MockResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResult[T]]
  }
  
  @scala.inline
  def MockResultThrow[T](`type`: `throw`, value: js.Any): MockResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResult[T]]
  }
  
  @scala.inline
  def MockResultIncomplete[T](`type`: incomplete): MockResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResult[T]]
  }
}
