package typings.jqueryGridster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridsterCollision extends StObject {
  
  def on_overlap(data: GridsterCollisionData): Unit
  
  def on_overlap_start(data: GridsterCollisionData): Unit
  
  def on_overlap_stop(data: GridsterCollisionData): Unit
}
object GridsterCollision {
  
  inline def apply(
    on_overlap: GridsterCollisionData => Unit,
    on_overlap_start: GridsterCollisionData => Unit,
    on_overlap_stop: GridsterCollisionData => Unit
  ): GridsterCollision = {
    val __obj = js.Dynamic.literal(on_overlap = js.Any.fromFunction1(on_overlap), on_overlap_start = js.Any.fromFunction1(on_overlap_start), on_overlap_stop = js.Any.fromFunction1(on_overlap_stop))
    __obj.asInstanceOf[GridsterCollision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridsterCollision] (val x: Self) extends AnyVal {
    
    inline def setOn_overlap(value: GridsterCollisionData => Unit): Self = StObject.set(x, "on_overlap", js.Any.fromFunction1(value))
    
    inline def setOn_overlap_start(value: GridsterCollisionData => Unit): Self = StObject.set(x, "on_overlap_start", js.Any.fromFunction1(value))
    
    inline def setOn_overlap_stop(value: GridsterCollisionData => Unit): Self = StObject.set(x, "on_overlap_stop", js.Any.fromFunction1(value))
  }
}
