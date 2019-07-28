package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait base64_variants extends js.Object

@JSImport("libsodium-wrappers", "base64_variants")
@js.native
object base64_variants extends js.Object {
  @js.native
  sealed trait ORIGINAL extends base64_variants
  
  @js.native
  sealed trait ORIGINAL_NO_PADDING extends base64_variants
  
  @js.native
  sealed trait URLSAFE extends base64_variants
  
  @js.native
  sealed trait URLSAFE_NO_PADDING extends base64_variants
  
  /* 0 */ val ORIGINAL: typings.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants.ORIGINAL with Double = js.native
  /* 1 */ val ORIGINAL_NO_PADDING: typings.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants.ORIGINAL_NO_PADDING with Double = js.native
  /* 2 */ val URLSAFE: typings.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants.URLSAFE with Double = js.native
  /* 3 */ val URLSAFE_NO_PADDING: typings.libsodiumDashWrappers.libsodiumDashWrappersMod.base64_variants.URLSAFE_NO_PADDING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[base64_variants with Double] = js.native
}

