package typings.kiiCloudSdk.anon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(): js.Any
}
object `19` {
  
  inline def apply(failure: Error => js.Any, success: () => js.Any): `19` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: () => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
  }
}
