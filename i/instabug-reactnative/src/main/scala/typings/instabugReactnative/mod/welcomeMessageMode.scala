package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait welcomeMessageMode extends js.Object

@JSImport("instabug-reactnative", "welcomeMessageMode")
@js.native
object welcomeMessageMode extends js.Object {
  @js.native
  sealed trait beta extends welcomeMessageMode
  
  @js.native
  sealed trait disabled extends welcomeMessageMode
  
  @js.native
  sealed trait live extends welcomeMessageMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[welcomeMessageMode with Double] = js.native
  /* 1 */ @js.native
  object beta extends TopLevel[beta with Double]
  
  /* 2 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 0 */ @js.native
  object live extends TopLevel[live with Double]
  
}

