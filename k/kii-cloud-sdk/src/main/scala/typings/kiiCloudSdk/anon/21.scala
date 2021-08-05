package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(subscription: KiiPushSubscription, topic: KiiTopic): js.Any
}
object `21` {
  
  inline def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiTopic) => js.Any): `21` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiPushSubscription, KiiTopic) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
