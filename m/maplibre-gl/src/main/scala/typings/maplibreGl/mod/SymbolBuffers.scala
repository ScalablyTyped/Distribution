package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "SymbolBuffers")
@js.native
open class SymbolBuffers protected () extends StObject {
  def this(programConfigurations: ProgramConfigurationSet[SymbolStyleLayer]) = this()
  
  var collisionVertexArray: CollisionVertexArray = js.native
  
  var collisionVertexBuffer: VertexBuffer = js.native
  
  def destroy(): scala.Unit = js.native
  
  var dynamicLayoutVertexArray: SymbolDynamicLayoutArray = js.native
  
  var dynamicLayoutVertexBuffer: VertexBuffer = js.native
  
  var indexArray: TriangleIndexArray = js.native
  
  var indexBuffer: IndexBuffer = js.native
  
  def isEmpty(): Boolean = js.native
  
  var layoutVertexArray: SymbolLayoutArray = js.native
  
  var layoutVertexBuffer: VertexBuffer = js.native
  
  var opacityVertexArray: SymbolOpacityArray = js.native
  
  var opacityVertexBuffer: VertexBuffer = js.native
  
  var placedSymbolArray: PlacedSymbolArray = js.native
  
  var programConfigurations: ProgramConfigurationSet[SymbolStyleLayer] = js.native
  
  var segments: SegmentVector = js.native
  
  def upload(context: Context, dynamicIndexBuffer: Boolean): scala.Unit = js.native
  def upload(context: Context, dynamicIndexBuffer: Boolean, upload: Boolean): scala.Unit = js.native
  def upload(context: Context, dynamicIndexBuffer: Boolean, upload: Boolean, update: Boolean): scala.Unit = js.native
  def upload(context: Context, dynamicIndexBuffer: Boolean, upload: scala.Unit, update: Boolean): scala.Unit = js.native
}
