package typings.maplibreGl.mod

import typings.maplibreGl.anon.ReadonlyStencilMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "StencilMode")
@js.native
open class StencilMode protected () extends StObject {
  def this(
    test: StencilTestGL,
    ref: Double,
    mask: Double,
    fail: StencilOpConstant,
    depthFail: StencilOpConstant,
    pass: StencilOpConstant
  ) = this()
  
  var depthFail: StencilOpConstant = js.native
  
  var fail: StencilOpConstant = js.native
  
  var mask: Double = js.native
  
  var pass: StencilOpConstant = js.native
  
  var ref: Double = js.native
  
  var test: StencilTestGL = js.native
}
/* static members */
object StencilMode {
  
  @JSImport("maplibre-gl", "StencilMode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "StencilMode.disabled")
  @js.native
  def disabled: ReadonlyStencilMode = js.native
  inline def disabled_=(x: ReadonlyStencilMode): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
}
