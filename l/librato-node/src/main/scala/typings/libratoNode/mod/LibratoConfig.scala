package typings.libratoNode.mod

import typings.libratoNode.libratoNodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibratoConfig extends js.Object {
  
  var email: String = js.native
  
  var period: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var requestOptions: js.UndefOr[LibratoRequestOptions] = js.native
  
  var simulate: js.UndefOr[`false`] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var token: String = js.native
}
object LibratoConfig {
  
  @scala.inline
  def apply(email: String, token: String): LibratoConfig = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibratoConfig]
  }
  
  @scala.inline
  implicit class LibratoConfigOps[Self <: LibratoConfig] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: LibratoRequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    
    @scala.inline
    def setSimulate(value: `false`): Self = this.set("simulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulate: Self = this.set("simulate", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
