package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiThingContext
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `35` extends StObject {
  
  def failure(error: Error): js.Any = js.native
  
  def success(thingContext: KiiThingContext): js.Any = js.native
}
object `35` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiThingContext => js.Any): `35` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit class `35MutableBuilder`[Self <: `35`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: KiiThingContext => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
