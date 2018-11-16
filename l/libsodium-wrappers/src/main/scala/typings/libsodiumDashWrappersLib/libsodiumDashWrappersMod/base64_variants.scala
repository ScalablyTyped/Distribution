package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait base64_variants extends js.Object

@JSImport("libsodium-wrappers", "base64_variants")
@js.native
object base64_variants extends js.Object {
  @js.native
  sealed trait ORIGINAL
    extends libsodiumDashWrappersLib.libsodiumDashWrappersMod.base64_variants
  
  @js.native
  sealed trait ORIGINAL_NO_PADDING
    extends libsodiumDashWrappersLib.libsodiumDashWrappersMod.base64_variants
  
  @js.native
  sealed trait URLSAFE
    extends libsodiumDashWrappersLib.libsodiumDashWrappersMod.base64_variants
  
  @js.native
  sealed trait URLSAFE_NO_PADDING
    extends libsodiumDashWrappersLib.libsodiumDashWrappersMod.base64_variants
  
  val ORIGINAL: ORIGINAL with java.lang.String = js.native
  val ORIGINAL_NO_PADDING: ORIGINAL_NO_PADDING with java.lang.String = js.native
  val URLSAFE: URLSAFE with java.lang.String = js.native
  val URLSAFE_NO_PADDING: URLSAFE_NO_PADDING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    libsodiumDashWrappersLib.libsodiumDashWrappersMod.base64_variants with java.lang.String
  ] = js.native
}

