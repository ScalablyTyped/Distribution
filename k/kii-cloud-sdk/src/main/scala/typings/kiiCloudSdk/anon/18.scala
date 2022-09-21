package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiMqttEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(response: KiiMqttEndpoint): Any
}
object `18` {
  
  inline def apply(failure: js.Error => Any, success: KiiMqttEndpoint => Any): `18` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: KiiMqttEndpoint => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
