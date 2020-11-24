package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait colorTheme extends js.Object
@JSImport("instabug-reactnative", "colorTheme")
@js.native
object colorTheme extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[colorTheme with Double] = js.native
  
  @js.native
  sealed trait dark extends colorTheme
  /* 1 */ @js.native
  object dark extends TopLevel[dark with Double]
  
  @js.native
  sealed trait light extends colorTheme
  /* 0 */ @js.native
  object light extends TopLevel[light with Double]
}
