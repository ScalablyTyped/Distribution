package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(subscription: KiiPushSubscription, topic: KiiBucket, isSubscribed: Boolean): js.Any
}
object `22` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiBucket, Boolean) => js.Any): `22` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit class `22MutableBuilder`[Self <: `22`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (KiiPushSubscription, KiiBucket, Boolean) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
