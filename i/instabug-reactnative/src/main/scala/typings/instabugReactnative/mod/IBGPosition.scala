package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IBGPosition extends StObject
@JSImport("instabug-reactnative", "IBGPosition")
@js.native
object IBGPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IBGPosition with Double] = js.native
  
  @js.native
  sealed trait bottomLeft extends IBGPosition
  /* 2 */ val bottomLeft: typings.instabugReactnative.mod.IBGPosition.bottomLeft with Double = js.native
  
  @js.native
  sealed trait bottomRight extends IBGPosition
  /* 0 */ val bottomRight: typings.instabugReactnative.mod.IBGPosition.bottomRight with Double = js.native
  
  @js.native
  sealed trait topLeft extends IBGPosition
  /* 3 */ val topLeft: typings.instabugReactnative.mod.IBGPosition.topLeft with Double = js.native
  
  @js.native
  sealed trait topRight extends IBGPosition
  /* 1 */ val topRight: typings.instabugReactnative.mod.IBGPosition.topRight with Double = js.native
}
