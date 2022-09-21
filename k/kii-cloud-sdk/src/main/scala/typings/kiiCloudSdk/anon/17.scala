package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiMqttInstallationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(response: KiiMqttInstallationResponse): Any
}
object `17` {
  
  inline def apply(failure: js.Error => Any, success: KiiMqttInstallationResponse => Any): `17` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: KiiMqttInstallationResponse => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
