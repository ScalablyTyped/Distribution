package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A path that was removed in a combine operation.
  */
trait IPathRemoved
  extends StObject
     with IPath {
  
  /**
    * Reason the path was removed.
    */
  var reason: String
  
  /**
    * Original routekey of the path, to identify where it came from.
    */
  var routeKey: String
}
object IPathRemoved {
  
  inline def apply(origin: IPoint, reason: String, routeKey: String, `type`: String): IPathRemoved = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathRemoved]
  }
  
  extension [Self <: IPathRemoved](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
  }
}
