package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/utils/sanitization", JSImport.Namespace)
@js.native
object sanitizationMod extends js.Object {
  
  def sanitizeDOMString(): js.UndefOr[String] = js.native
  def sanitizeDOMString(untrustedString: String): js.UndefOr[String] = js.native
  def sanitizeDOMString(untrustedString: IonicSafeString): js.UndefOr[String] = js.native
  
  @js.native
  class IonicSafeString protected () extends js.Object {
    def this(value: String) = this()
    
    var value: String = js.native
  }
}
