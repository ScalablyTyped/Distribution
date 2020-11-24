package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorControlOptions extends js.Object {
  
  var formatMessage: js.UndefOr[js.Function1[/* error */ IError, String]] = js.native
  
  var header: js.UndefOr[String] = js.native
}
object ErrorControlOptions {
  
  @scala.inline
  def apply(): ErrorControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorControlOptions]
  }
  
  @scala.inline
  implicit class ErrorControlOptionsOps[Self <: ErrorControlOptions] (val x: Self) extends AnyVal {
    
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
    def setFormatMessage(value: /* error */ IError => String): Self = this.set("formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatMessage: Self = this.set("formatMessage", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
}
