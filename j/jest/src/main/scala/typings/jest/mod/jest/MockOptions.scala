package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MockOptions extends StObject {
  
  var virtual: js.UndefOr[Boolean] = js.undefined
}
object MockOptions {
  
  @scala.inline
  def apply(): MockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptions]
  }
  
  @scala.inline
  implicit class MockOptionsMutableBuilder[Self <: MockOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
