package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stubs extends StObject {
  
  var stubs: js.UndefOr[Double] = js.native
}
object Stubs {
  
  @scala.inline
  def apply(): Stubs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stubs]
  }
  
  @scala.inline
  implicit class StubsMutableBuilder[Self <: Stubs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStubs(value: Double): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStubsUndefined: Self = StObject.set(x, "stubs", js.undefined)
  }
}
