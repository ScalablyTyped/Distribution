package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "VertexArrayObject")
@js.native
open class VertexArrayObject () extends StObject {
  
  def bind(
    context: Context,
    program: Program[Any],
    layoutVertexBuffer: VertexBuffer,
    paintVertexBuffers: js.Array[VertexBuffer],
    indexBuffer: js.UndefOr[IndexBuffer | Null],
    vertexOffset: js.UndefOr[Double | Null],
    dynamicVertexBuffer: js.UndefOr[VertexBuffer | Null],
    dynamicVertexBuffer2: js.UndefOr[VertexBuffer | Null],
    dynamicVertexBuffer3: js.UndefOr[VertexBuffer | Null]
  ): scala.Unit = js.native
  
  var boundDynamicVertexBuffer: VertexBuffer = js.native
  
  var boundDynamicVertexBuffer2: VertexBuffer = js.native
  
  var boundDynamicVertexBuffer3: VertexBuffer = js.native
  
  var boundIndexBuffer: IndexBuffer = js.native
  
  var boundLayoutVertexBuffer: VertexBuffer = js.native
  
  var boundPaintVertexBuffers: js.Array[VertexBuffer] = js.native
  
  var boundProgram: Program[Any] = js.native
  
  var boundVertexOffset: Double = js.native
  
  var context: Context = js.native
  
  def destroy(): scala.Unit = js.native
  
  def freshBind(
    program: Program[Any],
    layoutVertexBuffer: VertexBuffer,
    paintVertexBuffers: js.Array[VertexBuffer],
    indexBuffer: js.UndefOr[IndexBuffer | Null],
    vertexOffset: js.UndefOr[Double | Null],
    dynamicVertexBuffer: js.UndefOr[VertexBuffer | Null],
    dynamicVertexBuffer2: js.UndefOr[VertexBuffer | Null],
    dynamicVertexBuffer3: js.UndefOr[VertexBuffer | Null]
  ): scala.Unit = js.native
  
  var vao: Any = js.native
}
