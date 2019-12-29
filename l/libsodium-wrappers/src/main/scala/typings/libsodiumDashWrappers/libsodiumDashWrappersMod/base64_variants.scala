package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[base64_variants with Double] = js.native
  /* 0 */ @js.native
  object ORIGINAL extends TopLevel[ORIGINAL with Double]
  
  /* 1 */ @js.native
  object ORIGINAL_NO_PADDING extends TopLevel[ORIGINAL_NO_PADDING with Double]
  
  /* 2 */ @js.native
  object URLSAFE extends TopLevel[URLSAFE with Double]
  
  /* 3 */ @js.native
  object URLSAFE_NO_PADDING extends TopLevel[URLSAFE_NO_PADDING with Double]
  
}

