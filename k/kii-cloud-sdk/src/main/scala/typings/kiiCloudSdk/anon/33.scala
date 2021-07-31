package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  
  def success(theUser: KiiUser, groupList: js.Array[KiiGroup]): js.Any
}
object `33` {
  
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: (KiiUser, js.Array[KiiGroup]) => js.Any): `33` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`33`]
  }
  
  @scala.inline
  implicit class `33MutableBuilder`[Self <: `33`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiUser, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: (KiiUser, js.Array[KiiGroup]) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
