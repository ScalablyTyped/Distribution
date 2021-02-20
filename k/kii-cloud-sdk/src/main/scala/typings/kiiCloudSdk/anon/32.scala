package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `32` extends StObject {
  
  def failure(theUser: KiiUser, anErrorString: String): js.Any = js.native
  
  def success(theAuthenticatedUser: KiiUser): js.Any = js.native
}
object `32` {
  
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: KiiUser => js.Any): `32` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit class `32MutableBuilder`[Self <: `32`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiUser, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: KiiUser => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
