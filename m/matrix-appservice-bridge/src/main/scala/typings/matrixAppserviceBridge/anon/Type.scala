package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.none
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.per_room
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * `true` to only feed through the next event after the request object in the previous
    * call succeeds or fails. It is **vital** that you consistently resolve/reject the
    * request if this is 'true', else you will not get any further events from this queue.
    * To aid debugging this, consider setting a delayed listener on the request factory.
    *
    * If `false`, the mere invocation of onEvent is enough to trigger the next event in the queue.
    * You probably want to set this to `true` if your {@link Bridge~onEvent} is
    * performing async operations where ordering matters (e.g. messages).
    *
    * Default: false.
    * */
  var perRequest: Boolean
  
  /**
    * The type of queue to use when feeding through to {@link Bridge~onEvent}.
    * - If `none`, events are fed through as soon as contextual info is obtained, which may result
    * in out of order events but stops HOL blocking.
    * - If `single`, onEvent calls will be in order but may be slower due to HOL blocking.
    * - If `per_room`, a queue per room ID is made which reduces the impact of HOL blocking to be scoped to a room.
    *
    * Default: `single`.
    */
  var `type`: none | single | per_room
}
object Type {
  
  @scala.inline
  def apply(perRequest: Boolean, `type`: none | single | per_room): Type = {
    val __obj = js.Dynamic.literal(perRequest = perRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerRequest(value: Boolean): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: none | single | per_room): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
