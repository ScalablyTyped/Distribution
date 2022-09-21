package typings.maplibreGl.mod

import typings.std.WebGLBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "IndexBuffer")
@js.native
open class IndexBuffer protected () extends StObject {
  def this(context: Context, array: LineIndexArray) = this()
  def this(context: Context, array: LineStripIndexArray) = this()
  def this(context: Context, array: TriangleIndexArray) = this()
  def this(context: Context, array: LineIndexArray, dynamicDraw: Boolean) = this()
  def this(context: Context, array: LineStripIndexArray, dynamicDraw: Boolean) = this()
  def this(context: Context, array: TriangleIndexArray, dynamicDraw: Boolean) = this()
  
  def bind(): scala.Unit = js.native
  
  var buffer: WebGLBuffer = js.native
  
  var context: Context = js.native
  
  def destroy(): scala.Unit = js.native
  
  var dynamicDraw: Boolean = js.native
  
  def updateData(array: StructArray): scala.Unit = js.native
}
