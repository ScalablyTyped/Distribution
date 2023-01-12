package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31`[T] extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(topic: KiiTopic, message: T): Any
}
object `31` {
  
  inline def apply[T](failure: js.Error => Any, success: (KiiTopic, T) => Any): `31`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`31`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`[?], T] (val x: Self & `31`[T]) extends AnyVal {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiTopic, T) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
