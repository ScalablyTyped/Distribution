package typings.maplibreGl.mod

import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "DepthAttachment")
@js.native
open class DepthAttachment protected () extends FramebufferAttachment[WebGLRenderbuffer] {
  def this(context: Context, parent: WebGLFramebuffer) = this()
  
  def set(): scala.Unit = js.native
}
