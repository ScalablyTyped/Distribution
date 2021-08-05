package typings.jestTypes.anon

import typings.jestTypes.circusMod.Exception
import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.jestTypesStrings.error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with SyncEvent {
  
  var error: Exception
  
  var name: error_
}
object Error {
  
  inline def apply(error: Exception): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "error")
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Exception): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setName(value: error_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
