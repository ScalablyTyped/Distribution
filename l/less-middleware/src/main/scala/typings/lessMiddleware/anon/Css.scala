package typings.lessMiddleware.anon

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css extends js.Object {
  
  /**
    * Function that modifies the compiled css output before being stored.
    */
  var css: js.UndefOr[
    js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
  ] = js.native
}
object Css {
  
  @scala.inline
  def apply(): Css = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssOps[Self <: Css] (val x: Self) extends AnyVal {
    
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
    def setCss(value: (/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String): Self = this.set("css", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
  }
}
