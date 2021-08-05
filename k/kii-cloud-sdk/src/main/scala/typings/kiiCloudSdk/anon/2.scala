package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiUser
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(group: KiiUser): js.Any
}
object `2` {
  
  inline def apply(failure: Error => js.Any, success: KiiUser => js.Any): `2` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: KiiUser => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
