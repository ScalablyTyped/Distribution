package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait welcomeMessageMode extends js.Object
@JSImport("instabug-reactnative", "welcomeMessageMode")
@js.native
object welcomeMessageMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[welcomeMessageMode with Double] = js.native
  
  @js.native
  sealed trait beta extends welcomeMessageMode
  /* 1 */ @js.native
  object beta extends TopLevel[beta with Double]
  
  @js.native
  sealed trait disabled extends welcomeMessageMode
  /* 2 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  @js.native
  sealed trait live extends welcomeMessageMode
  /* 0 */ @js.native
  object live extends TopLevel[live with Double]
}
