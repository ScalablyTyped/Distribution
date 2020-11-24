package typings.koaBouncer.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareOption extends js.Object {
  
  var getBody: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
  
  var getParams: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
  
  var getQuery: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
}
object MiddlewareOption {
  
  @scala.inline
  def apply(): MiddlewareOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareOption]
  }
  
  @scala.inline
  implicit class MiddlewareOptionOps[Self <: MiddlewareOption] (val x: Self) extends AnyVal {
    
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
    def setGetBody(value: /* ctx */ Context => _): Self = this.set("getBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetBody: Self = this.set("getBody", js.undefined)
    
    @scala.inline
    def setGetParams(value: /* ctx */ Context => _): Self = this.set("getParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetParams: Self = this.set("getParams", js.undefined)
    
    @scala.inline
    def setGetQuery(value: /* ctx */ Context => _): Self = this.set("getQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetQuery: Self = this.set("getQuery", js.undefined)
  }
}
