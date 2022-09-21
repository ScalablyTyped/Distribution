package typings.maplibreGl.mod

import typings.maplibreGl.anon.ReadonlyDepthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "DepthMode")
@js.native
open class DepthMode protected () extends StObject {
  def this(depthFunc: DepthFuncType, depthMask: DepthMaskType, depthRange: DepthRangeType) = this()
  
  var func: DepthFuncType = js.native
  
  var mask: DepthMaskType = js.native
  
  var range: DepthRangeType = js.native
}
/* static members */
object DepthMode {
  
  @JSImport("maplibre-gl", "DepthMode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "DepthMode.ReadOnly")
  @js.native
  def ReadOnly: Boolean = js.native
  inline def ReadOnly_=(x: Boolean): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "DepthMode.ReadWrite")
  @js.native
  def ReadWrite: Boolean = js.native
  inline def ReadWrite_=(x: Boolean): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadWrite")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "DepthMode.disabled")
  @js.native
  def disabled: ReadonlyDepthMode = js.native
  inline def disabled_=(x: ReadonlyDepthMode): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
}
