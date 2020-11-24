package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinedParams[RT /* <: js.UndefOr[ResponseType] */] extends Params {
  
  @JSName("responseType")
  var responseType_RefinedParams: js.UndefOr[RT] = js.native
}
object RefinedParams {
  
  @scala.inline
  def apply[RT /* <: js.UndefOr[ResponseType] */](): RefinedParams[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefinedParams[RT]]
  }
  
  @scala.inline
  implicit class RefinedParamsOps[Self <: RefinedParams[_], RT /* <: js.UndefOr[ResponseType] */] (val x: Self with RefinedParams[RT]) extends AnyVal {
    
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
    def setResponseType(value: RT): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
  }
}
