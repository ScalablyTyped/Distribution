package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait welcomeMessageMode extends StObject
@JSImport("instabug-reactnative", "welcomeMessageMode")
@js.native
object welcomeMessageMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[welcomeMessageMode & Double] = js.native
  
  @js.native
  sealed trait beta
    extends StObject
       with welcomeMessageMode
  /* 1 */ val beta: typings.instabugReactnative.mod.welcomeMessageMode.beta & Double = js.native
  
  @js.native
  sealed trait disabled
    extends StObject
       with welcomeMessageMode
  /* 2 */ val disabled: typings.instabugReactnative.mod.welcomeMessageMode.disabled & Double = js.native
  
  @js.native
  sealed trait live
    extends StObject
       with welcomeMessageMode
  /* 0 */ val live: typings.instabugReactnative.mod.welcomeMessageMode.live & Double = js.native
}
