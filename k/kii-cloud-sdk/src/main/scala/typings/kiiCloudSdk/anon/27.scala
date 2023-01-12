package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(thing: KiiThing, group: KiiUser): Any
}
object `27` {
  
  inline def apply(failure: js.Error => Any, success: (KiiThing, KiiUser) => Any): `27` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiThing, KiiUser) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
