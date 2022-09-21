package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(subscription: KiiPushSubscription, topic: KiiBucket): Any
}
object `20` {
  
  inline def apply(failure: js.Error => Any, success: (KiiPushSubscription, KiiBucket) => Any): `20` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiPushSubscription, KiiBucket) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
