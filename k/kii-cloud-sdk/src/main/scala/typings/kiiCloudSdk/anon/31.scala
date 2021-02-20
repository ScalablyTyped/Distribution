package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `31`[T] extends StObject {
  
  def failure(error: Error): js.Any = js.native
  
  def success(topic: KiiTopic, message: T): js.Any = js.native
}
object `31` {
  
  @scala.inline
  def apply[T](failure: Error => js.Any, success: (KiiTopic, T) => js.Any): `31`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`31`[T]]
  }
  
  @scala.inline
  implicit class `31MutableBuilder`[Self <: `31`[_], T] (val x: Self with `31`[T]) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (KiiTopic, T) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
