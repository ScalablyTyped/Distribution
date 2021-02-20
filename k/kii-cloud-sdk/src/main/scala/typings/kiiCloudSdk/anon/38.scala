package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `38` extends StObject {
  
  def failure(anErrorString: String): js.Any = js.native
  
  def success(theMatchedUser: KiiUser): js.Any = js.native
}
object `38` {
  
  @scala.inline
  def apply(failure: String => js.Any, success: KiiUser => js.Any): `38` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`38`]
  }
  
  @scala.inline
  implicit class `38MutableBuilder`[Self <: `38`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: String => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiUser => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
