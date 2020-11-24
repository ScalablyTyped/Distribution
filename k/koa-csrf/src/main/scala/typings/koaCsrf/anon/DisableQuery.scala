package typings.koaCsrf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableQuery extends js.Object {
  
  var disableQuery: js.UndefOr[Boolean] = js.native
  
  var excludedMethods: js.UndefOr[js.Array[String]] = js.native
  
  var invalidSessionSecretMessage: js.UndefOr[String] = js.native
  
  var invalidSessionSecretStatusCode: js.UndefOr[Double] = js.native
  
  var invalidTokenMessage: js.UndefOr[String] = js.native
  
  var invalidTokenStatusCode: js.UndefOr[Double] = js.native
}
object DisableQuery {
  
  @scala.inline
  def apply(): DisableQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableQuery]
  }
  
  @scala.inline
  implicit class DisableQueryOps[Self <: DisableQuery] (val x: Self) extends AnyVal {
    
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
    def setDisableQuery(value: Boolean): Self = this.set("disableQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableQuery: Self = this.set("disableQuery", js.undefined)
    
    @scala.inline
    def setExcludedMethodsVarargs(value: String*): Self = this.set("excludedMethods", js.Array(value :_*))
    
    @scala.inline
    def setExcludedMethods(value: js.Array[String]): Self = this.set("excludedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedMethods: Self = this.set("excludedMethods", js.undefined)
    
    @scala.inline
    def setInvalidSessionSecretMessage(value: String): Self = this.set("invalidSessionSecretMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidSessionSecretMessage: Self = this.set("invalidSessionSecretMessage", js.undefined)
    
    @scala.inline
    def setInvalidSessionSecretStatusCode(value: Double): Self = this.set("invalidSessionSecretStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidSessionSecretStatusCode: Self = this.set("invalidSessionSecretStatusCode", js.undefined)
    
    @scala.inline
    def setInvalidTokenMessage(value: String): Self = this.set("invalidTokenMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidTokenMessage: Self = this.set("invalidTokenMessage", js.undefined)
    
    @scala.inline
    def setInvalidTokenStatusCode(value: Double): Self = this.set("invalidTokenStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidTokenStatusCode: Self = this.set("invalidTokenStatusCode", js.undefined)
  }
}
