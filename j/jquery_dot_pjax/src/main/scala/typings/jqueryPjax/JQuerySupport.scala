package typings.jqueryPjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySupport extends js.Object {
  
  /**
    * A boolean value indicates if pjax is supported by the browser.
    */
  var pjax: Boolean = js.native
}
object JQuerySupport {
  
  @scala.inline
  def apply(pjax: Boolean): JQuerySupport = {
    val __obj = js.Dynamic.literal(pjax = pjax.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit class JQuerySupportOps[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
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
    def setPjax(value: Boolean): Self = this.set("pjax", value.asInstanceOf[js.Any])
  }
}
