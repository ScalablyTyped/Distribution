package typings.maplibreGl.mod

import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Uniform1i")
@js.native
open class Uniform1i protected ()
  extends StObject
     with Uniform[Double] {
  def this(context: Context, location: WebGLUniformLocation) = this()
  
  /* CompleteClass */
  var current: Double = js.native
  
  /* CompleteClass */
  var gl: WebGLRenderingContext = js.native
  
  /* CompleteClass */
  var location: WebGLUniformLocation = js.native
  
  /* CompleteClass */
  override def set(v: Double): scala.Unit = js.native
}
