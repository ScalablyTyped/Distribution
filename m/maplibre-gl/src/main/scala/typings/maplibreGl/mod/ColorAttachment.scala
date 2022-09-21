package typings.maplibreGl.mod

import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ColorAttachment")
@js.native
open class ColorAttachment protected () extends FramebufferAttachment[WebGLTexture] {
  def this(context: Context, parent: WebGLFramebuffer) = this()
  
  def set(): scala.Unit = js.native
  
  def setDirty(): scala.Unit = js.native
}
