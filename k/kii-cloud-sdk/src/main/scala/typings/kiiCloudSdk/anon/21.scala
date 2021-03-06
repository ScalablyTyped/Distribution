package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `21` extends StObject {
  
  def failure(error: Error): js.Any = js.native
  
  def success(subscription: KiiPushSubscription, topic: KiiTopic): js.Any = js.native
}
object `21` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiPushSubscription, KiiTopic) => js.Any): `21` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (KiiPushSubscription, KiiTopic) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
