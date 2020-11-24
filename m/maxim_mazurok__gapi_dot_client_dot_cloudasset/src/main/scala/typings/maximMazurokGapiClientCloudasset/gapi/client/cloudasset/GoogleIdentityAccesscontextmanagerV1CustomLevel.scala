package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleIdentityAccesscontextmanagerV1CustomLevel extends js.Object {
  
  /** Required. A Cloud CEL expression evaluating to a boolean. */
  var expr: js.UndefOr[Expr] = js.native
}
object GoogleIdentityAccesscontextmanagerV1CustomLevel {
  
  @scala.inline
  def apply(): GoogleIdentityAccesscontextmanagerV1CustomLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1CustomLevel]
  }
  
  @scala.inline
  implicit class GoogleIdentityAccesscontextmanagerV1CustomLevelOps[Self <: GoogleIdentityAccesscontextmanagerV1CustomLevel] (val x: Self) extends AnyVal {
    
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
    def setExpr(value: Expr): Self = this.set("expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpr: Self = this.set("expr", js.undefined)
  }
}
