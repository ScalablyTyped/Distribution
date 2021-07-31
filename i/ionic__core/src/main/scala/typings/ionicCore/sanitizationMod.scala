package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizationMod {
  
  @JSImport("@ionic/core/dist/types/utils/sanitization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/sanitization", "IonicSafeString")
  @js.native
  class IonicSafeString protected () extends StObject {
    def this(value: String) = this()
    
    var value: String = js.native
  }
  
  @scala.inline
  def sanitizeDOMString(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDOMString")().asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def sanitizeDOMString(untrustedString: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDOMString")(untrustedString.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def sanitizeDOMString(untrustedString: IonicSafeString): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDOMString")(untrustedString.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
