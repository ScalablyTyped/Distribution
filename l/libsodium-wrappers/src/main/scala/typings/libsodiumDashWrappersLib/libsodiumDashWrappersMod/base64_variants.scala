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
  
  /* 0 */ val ORIGINAL: ORIGINAL with scala.Double = js.native
  /* 1 */ val ORIGINAL_NO_PADDING: ORIGINAL_NO_PADDING with scala.Double = js.native
  /* 2 */ val URLSAFE: URLSAFE with scala.Double = js.native
  /* 3 */ val URLSAFE_NO_PADDING: URLSAFE_NO_PADDING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    libsodiumDashWrappersLib.libsodiumDashWrappersMod.base64_variants with scala.Double
  ] = js.native
}

