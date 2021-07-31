package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventCollision[T]
  extends StObject
     with IEventTimestamped[T] {
  
  /**
    * The collision pair
    */
  var pairs: js.Array[IPair]
}
object IEventCollision {
  
  @scala.inline
  def apply[T](name: String, pairs: js.Array[IPair], source: T, timestamp: Double): IEventCollision[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventCollision[T]]
  }
  
  @scala.inline
  implicit class IEventCollisionMutableBuilder[Self <: IEventCollision[?], T] (val x: Self & IEventCollision[T]) extends AnyVal {
    
    @scala.inline
    def setPairs(value: js.Array[IPair]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPairsVarargs(value: IPair*): Self = StObject.set(x, "pairs", js.Array(value :_*))
  }
}
