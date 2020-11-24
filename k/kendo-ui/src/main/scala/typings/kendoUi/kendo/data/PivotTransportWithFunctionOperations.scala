package typings.kendoUi.kendo.data

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
  implicit class PivotTransportWithFunctionOperationsOps[Self <: PivotTransportWithFunctionOperations] (val x: Self) extends AnyVal {
    
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
    def setDiscover(value: /* options */ DataSourceTransportOptions => Unit): Self = this.set("discover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDiscover: Self = this.set("discover", js.undefined)
    
    @scala.inline
    def setRead(value: /* options */ DataSourceTransportOptions => Unit): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
  }
}
