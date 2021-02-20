package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventTimestamped[T] extends IEvent[T] {
  
  /**
    * The engine.timing.timestamp of the event
    */
  var timestamp: Double = js.native
}
object IEventTimestamped {
  
  @scala.inline
  def apply[T](name: String, source: T, timestamp: Double): IEventTimestamped[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventTimestamped[T]]
  }
  
  @scala.inline
  implicit class IEventTimestampedMutableBuilder[Self <: IEventTimestamped[_], T] (val x: Self with IEventTimestamped[T]) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
