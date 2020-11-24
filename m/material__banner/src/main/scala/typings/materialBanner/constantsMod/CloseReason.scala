package typings.materialBanner.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloseReason extends js.Object
@JSImport("@material/banner/constants", "CloseReason")
@js.native
object CloseReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloseReason with Double] = js.native
  
  @js.native
  sealed trait PRIMARY extends CloseReason
  /* 0 */ @js.native
  object PRIMARY extends TopLevel[PRIMARY with Double]
  
  @js.native
  sealed trait SECONDARY extends CloseReason
  /* 1 */ @js.native
  object SECONDARY extends TopLevel[SECONDARY with Double]
  
  @js.native
  sealed trait UNSPECIFIED extends CloseReason
  /* 2 */ @js.native
  object UNSPECIFIED extends TopLevel[UNSPECIFIED with Double]
}
