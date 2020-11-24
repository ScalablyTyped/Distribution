package typings.koaBunyanLogger.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestLoggerOptions extends js.Object {
  
  var durationField: js.UndefOr[String] = js.native
  
  var formatRequestMessage: js.UndefOr[js.Function1[/* requestData */ RequestData, String]] = js.native
  
  var formatResponseMessage: js.UndefOr[js.Function1[/* responseData */ ResponseData, String]] = js.native
  
  var ignorePath: js.UndefOr[js.Array[String]] = js.native
  
  var levelFn: js.UndefOr[js.Function2[/* status */ Double, /* err */ Error, String]] = js.native
  
  var updateLogFields: js.UndefOr[js.Function1[/* data */ RequestData, RequestData]] = js.native
  
  var updateRequestLogFields: js.UndefOr[js.Function1[/* requestData */ RequestData, RequestData]] = js.native
  
  var updateResponseLogFields: js.UndefOr[js.Function1[/* responseData */ ResponseData, ResponseData]] = js.native
}
object RequestLoggerOptions {
  
  @scala.inline
  def apply(): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerOptions]
  }
  
  @scala.inline
  implicit class RequestLoggerOptionsOps[Self <: RequestLoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setDurationField(value: String): Self = this.set("durationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationField: Self = this.set("durationField", js.undefined)
    
    @scala.inline
    def setFormatRequestMessage(value: /* requestData */ RequestData => String): Self = this.set("formatRequestMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatRequestMessage: Self = this.set("formatRequestMessage", js.undefined)
    
    @scala.inline
    def setFormatResponseMessage(value: /* responseData */ ResponseData => String): Self = this.set("formatResponseMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatResponseMessage: Self = this.set("formatResponseMessage", js.undefined)
    
    @scala.inline
    def setIgnorePathVarargs(value: String*): Self = this.set("ignorePath", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePath(value: js.Array[String]): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
    
    @scala.inline
    def setLevelFn(value: (/* status */ Double, /* err */ Error) => String): Self = this.set("levelFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLevelFn: Self = this.set("levelFn", js.undefined)
    
    @scala.inline
    def setUpdateLogFields(value: /* data */ RequestData => RequestData): Self = this.set("updateLogFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateLogFields: Self = this.set("updateLogFields", js.undefined)
    
    @scala.inline
    def setUpdateRequestLogFields(value: /* requestData */ RequestData => RequestData): Self = this.set("updateRequestLogFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateRequestLogFields: Self = this.set("updateRequestLogFields", js.undefined)
    
    @scala.inline
    def setUpdateResponseLogFields(value: /* responseData */ ResponseData => ResponseData): Self = this.set("updateResponseLogFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateResponseLogFields: Self = this.set("updateResponseLogFields", js.undefined)
  }
}
