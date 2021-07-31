package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.kiiCloudSdk.KiiCloud.KiiUser
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  def failure(error: Error): js.Any
  
  def success(thing: KiiThing, user: KiiUser, isOwner: Boolean): js.Any
}
object `25` {
  
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiUser, Boolean) => js.Any): `25` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (KiiThing, KiiUser, Boolean) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
