package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(subscription: KiiPushSubscription, topic: KiiBucket, isSubscribed: Boolean): Any
}
object `22` {
  
  inline def apply(failure: js.Error => Any, success: (KiiPushSubscription, KiiBucket, Boolean) => Any): `22` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiPushSubscription, KiiBucket, Boolean) => Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
