package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(thing: KiiThing, user: KiiUser, isOwner: Boolean): Any
}
object `25` {
  
  inline def apply(failure: js.Error => Any, success: (KiiThing, KiiUser, Boolean) => Any): `25` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiThing, KiiUser, Boolean) => Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
