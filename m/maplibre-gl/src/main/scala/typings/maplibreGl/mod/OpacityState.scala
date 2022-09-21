package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "OpacityState")
@js.native
open class OpacityState protected () extends StObject {
  def this(prevState: OpacityState, increment: Double, placed: Boolean) = this()
  def this(prevState: OpacityState, increment: Double, placed: Boolean, skipFade: Boolean) = this()
  
  def isHidden(): Boolean = js.native
  
  var opacity: Double = js.native
  
  var placed: Boolean = js.native
}
