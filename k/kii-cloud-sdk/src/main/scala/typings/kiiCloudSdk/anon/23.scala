package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(subscription: KiiPushSubscription, topic: KiiTopic, isSubscribed: Boolean): js.Any
}
object `23` {
  
  inline def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiTopic, Boolean) => js.Any): `23` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiPushSubscription, KiiTopic, Boolean) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
