package typings.grpc.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyOptions extends StObject {
  
  /**
    * If set, this callback will be invoked after the usual hostname verification
    * has been performed on the peer certificate.
    */
  var checkServerIdentity: js.UndefOr[CheckServerIdentityCallback] = js.native
}
object VerifyOptions {
  
  @scala.inline
  def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  
  @scala.inline
  implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckServerIdentity(value: (/* hostname */ String, /* cert */ Certificate) => js.UndefOr[Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
  }
}
