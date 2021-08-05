package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeTo extends StObject {
  
  var relativeTo: String
}
object RelativeTo {
  
  inline def apply(relativeTo: String): RelativeTo = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTo]
  }
  
  extension [Self <: RelativeTo](x: Self) {
    
    inline def setRelativeTo(value: String): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
  }
}
