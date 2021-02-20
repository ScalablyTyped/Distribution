package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTransportWithFunctionOperations extends PivotTransport {
  
  @JSName("discover")
  var discover_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
  
  @JSName("read")
  var read_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
}
object PivotTransportWithFunctionOperations {
  
  @scala.inline
  def apply(): PivotTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransportWithFunctionOperations]
  }
  
  @scala.inline
  implicit class PivotTransportWithFunctionOperationsMutableBuilder[Self <: PivotTransportWithFunctionOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscover(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "discover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiscoverUndefined: Self = StObject.set(x, "discover", js.undefined)
    
    @scala.inline
    def setRead(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
