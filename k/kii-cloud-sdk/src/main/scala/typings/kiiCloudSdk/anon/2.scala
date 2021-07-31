package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiUser
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(group: KiiUser): js.Any
}
object `2` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiUser => js.Any): `2` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiUser => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
