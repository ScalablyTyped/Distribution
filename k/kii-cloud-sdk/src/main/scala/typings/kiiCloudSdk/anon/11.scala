package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  
  def success(theGroup: KiiGroup, theOwner: KiiUser): js.Any
}
object `11` {
  
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: (KiiGroup, KiiUser) => js.Any): `11` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiGroup, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: (KiiGroup, KiiUser) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
