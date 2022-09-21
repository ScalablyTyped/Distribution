package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "JointOpacityState")
@js.native
open class JointOpacityState protected () extends StObject {
  def this(prevState: JointOpacityState, increment: Double, placedText: Boolean, placedIcon: Boolean) = this()
  def this(
    prevState: JointOpacityState,
    increment: Double,
    placedText: Boolean,
    placedIcon: Boolean,
    skipFade: Boolean
  ) = this()
  
  var icon: OpacityState = js.native
  
  def isHidden(): Boolean = js.native
  
  var text: OpacityState = js.native
}
