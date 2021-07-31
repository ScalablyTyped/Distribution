package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  def failure(theSrcObject: KiiObject, theTgtObjectUri: String, anErrorString: String): js.Any
  
  def success(theSrcObject: KiiObject, theTgtObjectUri: String): js.Any
}
object `13` {
  
  @scala.inline
  def apply(failure: (KiiObject, String, String) => js.Any, success: (KiiObject, String) => js.Any): `13` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiObject, String, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccess(value: (KiiObject, String) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
