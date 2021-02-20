package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleIdentityAccesscontextmanagerV1CustomLevel extends StObject {
  
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
  implicit class GoogleIdentityAccesscontextmanagerV1CustomLevelMutableBuilder[Self <: GoogleIdentityAccesscontextmanagerV1CustomLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
  }
}
