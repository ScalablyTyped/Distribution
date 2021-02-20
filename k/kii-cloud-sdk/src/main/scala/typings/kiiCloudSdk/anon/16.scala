package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends StObject {
  
  def failure(error: Error): js.Any = js.native
  
  def success(response: KiiGcmInstallationResponse): js.Any = js.native
}
object `16` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiGcmInstallationResponse => js.Any): `16` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiGcmInstallationResponse => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
