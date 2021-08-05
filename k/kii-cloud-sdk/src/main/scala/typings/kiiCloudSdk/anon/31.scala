package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31`[T] extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(topic: KiiTopic, message: T): js.Any
}
object `31` {
  
  inline def apply[T](failure: Error => js.Any, success: (KiiTopic, T) => js.Any): `31`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`31`[T]]
  }
  
  extension [Self <: `31`[?], T](x: Self & `31`[T]) {
    
    inline def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiTopic, T) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
