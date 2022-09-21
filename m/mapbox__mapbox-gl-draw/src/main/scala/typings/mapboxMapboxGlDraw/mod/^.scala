package typings.mapboxMapboxGlDraw.mod

import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.anon.BoxSelect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mapbox/mapbox-gl-draw", JSImport.Namespace)
@js.native
open class ^ ()
  extends StObject
     with MapboxDraw {
  def this(options: BoxSelect) = this()
  
  /* CompleteClass */
  override def onAdd(map: Map): HTMLElement = js.native
  
  /* CompleteClass */
  override def onRemove(map: Map): Unit = js.native
}
@JSImport("@mapbox/mapbox-gl-draw", JSImport.Namespace)
@js.native
object ^ extends StObject
