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
  var pairs: js.Array[Pair]
}
object IEventCollision {
  
  inline def apply[T](name: String, pairs: js.Array[Pair], source: T, timestamp: Double): IEventCollision[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventCollision[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEventCollision[?], T] (val x: Self & IEventCollision[T]) extends AnyVal {
    
    inline def setPairs(value: js.Array[Pair]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    inline def setPairsVarargs(value: Pair*): Self = StObject.set(x, "pairs", js.Array(value*))
  }
}
