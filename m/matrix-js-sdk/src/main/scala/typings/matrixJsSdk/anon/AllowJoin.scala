package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowJoin extends StObject {
  
  var allowJoin: Boolean
  
  // True to allow guests to join this room. This implicitly gives guests write access. If false or not given, guests are explicitly forbidden from joining the room.
  var allowRead: Boolean
}
object AllowJoin {
  
  inline def apply(allowJoin: Boolean, allowRead: Boolean): AllowJoin = {
    val __obj = js.Dynamic.literal(allowJoin = allowJoin.asInstanceOf[js.Any], allowRead = allowRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowJoin]
  }
  
  extension [Self <: AllowJoin](x: Self) {
    
    inline def setAllowJoin(value: Boolean): Self = StObject.set(x, "allowJoin", value.asInstanceOf[js.Any])
    
    inline def setAllowRead(value: Boolean): Self = StObject.set(x, "allowRead", value.asInstanceOf[js.Any])
  }
}
