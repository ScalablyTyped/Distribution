package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolExitResult extends StObject {
  
  var forceExited: Boolean
}
object PoolExitResult {
  
  inline def apply(forceExited: Boolean): PoolExitResult = {
    val __obj = js.Dynamic.literal(forceExited = forceExited.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolExitResult]
  }
  
  extension [Self <: PoolExitResult](x: Self) {
    
    inline def setForceExited(value: Boolean): Self = StObject.set(x, "forceExited", value.asInstanceOf[js.Any])
  }
}
