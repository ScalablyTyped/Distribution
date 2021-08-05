package typings.kiiCloudSdk.anon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(existed: Boolean): js.Any
}
object `29` {
  
  inline def apply(failure: Error => js.Any, success: Boolean => js.Any): `29` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: Boolean => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
