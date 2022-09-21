package typings.maplibreGl.mod

import typings.std.WebGLFramebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "FramebufferAttachment")
@js.native
open class FramebufferAttachment[T] protected () extends BaseValue[T] {
  def this(context: Context, parent: WebGLFramebuffer) = this()
  
  var context: Context = js.native
  
  var parent: WebGLFramebuffer = js.native
}
