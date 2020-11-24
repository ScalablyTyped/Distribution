package typings.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrecompileOptions extends CompileOptions {
  
  var destName: js.UndefOr[String] = js.native
  
  var srcName: js.UndefOr[String] = js.native
}
object PrecompileOptions {
  
  @scala.inline
  def apply(): PrecompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecompileOptions]
  }
  
  @scala.inline
  implicit class PrecompileOptionsOps[Self <: PrecompileOptions] (val x: Self) extends AnyVal {
    
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
    def setDestName(value: String): Self = this.set("destName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestName: Self = this.set("destName", js.undefined)
    
    @scala.inline
    def setSrcName(value: String): Self = this.set("srcName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcName: Self = this.set("srcName", js.undefined)
  }
}
