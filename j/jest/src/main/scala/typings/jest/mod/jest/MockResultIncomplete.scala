package typings.jest.mod.jest

import typings.jest.jestStrings.incomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single incomplete call to a mock function.
  */
@js.native
trait MockResultIncomplete
  extends MockResult[js.Any] {
  
  var `type`: incomplete = js.native
  
  var value: js.UndefOr[scala.Nothing] = js.native
}
object MockResultIncomplete {
  
  @scala.inline
  def apply(`type`: incomplete): MockResultIncomplete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResultIncomplete]
  }
  
  @scala.inline
  implicit class MockResultIncompleteMutableBuilder[Self <: MockResultIncomplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: incomplete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
