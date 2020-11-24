package typings.k6.anon

import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.native
  
  var selector: js.UndefOr[String] = js.native
}
object Params {
  
  @scala.inline
  def apply[RT /* <: js.UndefOr[ResponseType] */](): Params[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params[RT]]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params[_], RT /* <: js.UndefOr[ResponseType] */] (val x: Self with Params[RT]) extends AnyVal {
    
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
    def setParams(value: RefinedParams[RT]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setParamsNull: Self = this.set("params", null)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
