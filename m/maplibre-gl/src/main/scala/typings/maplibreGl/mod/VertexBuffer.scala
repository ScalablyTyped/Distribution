package typings.maplibreGl.mod

import typings.std.WebGLBuffer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "VertexBuffer")
@js.native
open class VertexBuffer protected () extends StObject {
  /**
  	 * @param dynamicDraw Whether this buffer will be repeatedly updated.
  	 * @private
  	 */
  def this(context: Context, array: StructArray, attributes: js.Array[StructArrayMember]) = this()
  def this(
    context: Context,
    array: StructArray,
    attributes: js.Array[StructArrayMember],
    dynamicDraw: Boolean
  ) = this()
  
  var attributes: js.Array[StructArrayMember] = js.native
  
  def bind(): scala.Unit = js.native
  
  var buffer: WebGLBuffer = js.native
  
  var context: Context = js.native
  
  /**
  	 * Destroy the GL buffer bound to the given WebGL context
  	 */
  def destroy(): scala.Unit = js.native
  
  var dynamicDraw: Boolean = js.native
  
  def enableAttributes(gl: WebGLRenderingContext, program: Program[Any]): scala.Unit = js.native
  
  var itemSize: Double = js.native
  
  var length: Double = js.native
  
  /**
  	 * Set the attribute pointers in a WebGL context
  	 * @param gl The WebGL context
  	 * @param program The active WebGL program
  	 * @param vertexOffset Index of the starting vertex of the segment
  	 */
  def setVertexAttribPointers(gl: WebGLRenderingContext, program: Program[Any]): scala.Unit = js.native
  def setVertexAttribPointers(gl: WebGLRenderingContext, program: Program[Any], vertexOffset: Double): scala.Unit = js.native
  
  def updateData(array: StructArray): scala.Unit = js.native
}
