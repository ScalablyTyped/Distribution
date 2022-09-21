package typings.maplibreGl.mod

import typings.maplibreGl.anon.ReadonlyCullFaceMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CullFaceMode")
@js.native
open class CullFaceMode protected () extends StObject {
  def this(enable: Boolean, mode: CullFaceModeType, frontFace: FrontFaceType) = this()
  
  var enable: Boolean = js.native
  
  var frontFace: FrontFaceType = js.native
  
  var mode: CullFaceModeType = js.native
}
/* static members */
object CullFaceMode {
  
  @JSImport("maplibre-gl", "CullFaceMode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "CullFaceMode.backCCW")
  @js.native
  def backCCW: ReadonlyCullFaceMode = js.native
  inline def backCCW_=(x: ReadonlyCullFaceMode): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backCCW")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "CullFaceMode.disabled")
  @js.native
  def disabled: ReadonlyCullFaceMode = js.native
  inline def disabled_=(x: ReadonlyCullFaceMode): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
}
