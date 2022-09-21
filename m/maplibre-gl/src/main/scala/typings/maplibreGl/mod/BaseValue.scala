package typings.maplibreGl.mod

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "BaseValue")
@js.native
open class BaseValue[T] protected ()
  extends StObject
     with IValue[T] {
  def this(context: Context) = this()
  
  /* CompleteClass */
  var default: T = js.native
  
  /* CompleteClass */
  var current: T = js.native
  
  /* CompleteClass */
  var dirty: Boolean = js.native
  
  /* CompleteClass */
  override def get(): T = js.native
  
  def getDefault(): T = js.native
  
  var gl: WebGLRenderingContext = js.native
  
  /* CompleteClass */
  override def set(value: T): scala.Unit = js.native
  
  /* CompleteClass */
  override def setDefault(): scala.Unit = js.native
}
