package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizationMod {
  
  @JSImport("@ionic/core/dist/types/utils/sanitization", "IonicSafeString")
  @js.native
  class IonicSafeString protected () extends StObject {
    def this(value: String) = this()
    
    var value: String = js.native
  }
  
  @JSImport("@ionic/core/dist/types/utils/sanitization", "sanitizeDOMString")
  @js.native
  def sanitizeDOMString(): js.UndefOr[String] = js.native
  @JSImport("@ionic/core/dist/types/utils/sanitization", "sanitizeDOMString")
  @js.native
  def sanitizeDOMString(untrustedString: String): js.UndefOr[String] = js.native
  @JSImport("@ionic/core/dist/types/utils/sanitization", "sanitizeDOMString")
  @js.native
  def sanitizeDOMString(untrustedString: IonicSafeString): js.UndefOr[String] = js.native
}
