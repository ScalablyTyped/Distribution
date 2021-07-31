package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait base64Variants extends StObject
@JSImport("libsodium-wrappers", "base64_variants")
@js.native
object base64Variants extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[base64Variants & Double] = js.native
  
  @js.native
  sealed trait ORIGINAL
    extends StObject
       with base64Variants
  /* 0 */ val ORIGINAL: typings.libsodiumWrappers.mod.base64Variants.ORIGINAL & Double = js.native
  
  @js.native
  sealed trait ORIGINAL_NO_PADDING
    extends StObject
       with base64Variants
  /* 1 */ val ORIGINAL_NO_PADDING: typings.libsodiumWrappers.mod.base64Variants.ORIGINAL_NO_PADDING & Double = js.native
  
  @js.native
  sealed trait URLSAFE
    extends StObject
       with base64Variants
  /* 2 */ val URLSAFE: typings.libsodiumWrappers.mod.base64Variants.URLSAFE & Double = js.native
  
  @js.native
  sealed trait URLSAFE_NO_PADDING
    extends StObject
       with base64Variants
  /* 3 */ val URLSAFE_NO_PADDING: typings.libsodiumWrappers.mod.base64Variants.URLSAFE_NO_PADDING & Double = js.native
}
