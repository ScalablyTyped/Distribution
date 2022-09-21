package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "UniformMatrix4f")
@js.native
open class UniformMatrix4f protected ()
  extends StObject
     with Uniform[mat4] {
  def this(context: Context, location: WebGLUniformLocation) = this()
  
  /* CompleteClass */
  var current: mat4 = js.native
  
  /* CompleteClass */
  var gl: WebGLRenderingContext = js.native
  
  /* CompleteClass */
  var location: WebGLUniformLocation = js.native
  
  /* CompleteClass */
  override def set(v: mat4): scala.Unit = js.native
}
