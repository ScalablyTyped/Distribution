package typings.maplibreGl.mod

import typings.glMatrix.mod.vec4
import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Uniform4f")
@js.native
open class Uniform4f protected ()
  extends StObject
     with Uniform[vec4] {
  def this(context: Context, location: WebGLUniformLocation) = this()
  
  /* CompleteClass */
  var current: vec4 = js.native
  
  /* CompleteClass */
  var gl: WebGLRenderingContext = js.native
  
  /* CompleteClass */
  var location: WebGLUniformLocation = js.native
  
  /* CompleteClass */
  override def set(v: vec4): scala.Unit = js.native
}
