package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(thing: KiiThing): js.Any
}
object `1` {
  
  inline def apply(failure: Error => js.Any, success: KiiThing => js.Any): `1` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: KiiThing => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
