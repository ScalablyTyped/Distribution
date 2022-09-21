package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiThingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(thingContext: KiiThingContext): Any
}
object `35` {
  
  inline def apply(failure: js.Error => Any, success: KiiThingContext => Any): `35` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: KiiThingContext => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
