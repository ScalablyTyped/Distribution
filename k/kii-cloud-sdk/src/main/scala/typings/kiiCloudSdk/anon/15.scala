package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  def failure(obj: KiiObject, anErrorString: String): js.Any
  
  def success(obj: KiiObject, publishedUrl: String): js.Any
}
object `15` {
  
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, String) => js.Any): `15` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiObject, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: (KiiObject, String) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
