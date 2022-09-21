package typings.maplibreGl.mod

import typings.std.WebGLFramebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Framebuffer")
@js.native
open class Framebuffer protected () extends StObject {
  def this(context: Context, width: Double, height: Double, hasDepth: Boolean) = this()
  
  var colorAttachment: ColorAttachment = js.native
  
  var context: Context = js.native
  
  var depthAttachment: DepthAttachment = js.native
  
  def destroy(): scala.Unit = js.native
  
  var framebuffer: WebGLFramebuffer = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
