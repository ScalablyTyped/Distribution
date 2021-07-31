package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(group: KiiGroup): js.Any
}
object `3` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiGroup => js.Any): `3` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiGroup => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
