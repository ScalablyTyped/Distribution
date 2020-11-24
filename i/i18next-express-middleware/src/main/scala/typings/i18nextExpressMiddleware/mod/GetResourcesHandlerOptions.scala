package typings.i18nextExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcesHandlerOptions extends js.Object {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var lngParam: js.UndefOr[String] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var nsParam: js.UndefOr[String] = js.native
}
object GetResourcesHandlerOptions {
  
  @scala.inline
  def apply(): GetResourcesHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesHandlerOptions]
  }
  
  @scala.inline
  implicit class GetResourcesHandlerOptionsOps[Self <: GetResourcesHandlerOptions] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setLngParam(value: String): Self = this.set("lngParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLngParam: Self = this.set("lngParam", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setNsParam(value: String): Self = this.set("nsParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNsParam: Self = this.set("nsParam", js.undefined)
  }
}
