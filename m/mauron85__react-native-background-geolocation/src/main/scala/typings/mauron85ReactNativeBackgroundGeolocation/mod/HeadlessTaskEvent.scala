package typings.mauron85ReactNativeBackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadlessTaskEvent extends StObject {
  
  /** Name of the event [ "location", "stationary", "activity" ] */
  var name: HeadlessTaskEventName
  
  /** Event parameters. */
  var params: Any
}
object HeadlessTaskEvent {
  
  inline def apply(name: HeadlessTaskEventName, params: Any): HeadlessTaskEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadlessTaskEvent]
  }
  
  extension [Self <: HeadlessTaskEvent](x: Self) {
    
    inline def setName(value: HeadlessTaskEventName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
