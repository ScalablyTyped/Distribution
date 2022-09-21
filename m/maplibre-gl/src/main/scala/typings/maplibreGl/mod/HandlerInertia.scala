package typings.maplibreGl.mod

import typings.maplibreGl.anon.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "HandlerInertia")
@js.native
open class HandlerInertia protected () extends StObject {
  def this(map: Map) = this()
  
  def _drainInertiaBuffer(): scala.Unit = js.native
  
  var _inertiaBuffer: js.Array[Settings] = js.native
  
  var _map: Map = js.native
  
  def _onMoveEnd(): Any = js.native
  def _onMoveEnd(panInertiaOptions: DragPanOptions): Any = js.native
  
  def clear(): scala.Unit = js.native
  
  def record(settings: Any): scala.Unit = js.native
}
