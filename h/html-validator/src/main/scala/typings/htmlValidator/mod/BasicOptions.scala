package typings.htmlValidator.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicOptions extends js.Object {
  
  var headers: js.UndefOr[Record[String, String]] = js.native
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  
  var isFragment: js.UndefOr[Boolean] = js.native
  
  var isLocal: js.UndefOr[Boolean] = js.native
  
  var validator: js.UndefOr[js.Object] = js.native
}
object BasicOptions {
  
  @scala.inline
  def apply(): BasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicOptions]
  }
  
  @scala.inline
  implicit class BasicOptionsOps[Self <: BasicOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIsFragment(value: Boolean): Self = this.set("isFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFragment: Self = this.set("isFragment", js.undefined)
    
    @scala.inline
    def setIsLocal(value: Boolean): Self = this.set("isLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLocal: Self = this.set("isLocal", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Object): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
}
