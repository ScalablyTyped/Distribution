package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait base64Variants extends js.Object
@JSImport("libsodium-wrappers", "base64_variants")
@js.native
object base64Variants extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[base64Variants with Double] = js.native
  
  @js.native
  sealed trait ORIGINAL extends base64Variants
  /* 0 */ @js.native
  object ORIGINAL extends TopLevel[ORIGINAL with Double]
  
  @js.native
  sealed trait ORIGINAL_NO_PADDING extends base64Variants
  /* 1 */ @js.native
  object ORIGINAL_NO_PADDING extends TopLevel[ORIGINAL_NO_PADDING with Double]
  
  @js.native
  sealed trait URLSAFE extends base64Variants
  /* 2 */ @js.native
  object URLSAFE extends TopLevel[URLSAFE with Double]
  
  @js.native
  sealed trait URLSAFE_NO_PADDING extends base64Variants
  /* 3 */ @js.native
  object URLSAFE_NO_PADDING extends TopLevel[URLSAFE_NO_PADDING with Double]
}
