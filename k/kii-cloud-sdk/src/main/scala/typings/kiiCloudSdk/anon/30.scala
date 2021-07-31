package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(topic: KiiTopic): js.Any
}
object `30` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiTopic => js.Any): `30` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit class `30MutableBuilder`[Self <: `30`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiTopic => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
