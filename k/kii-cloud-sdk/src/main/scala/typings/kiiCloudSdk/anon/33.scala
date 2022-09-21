package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  def failure(theUser: KiiUser, anErrorString: String): Any
  
  def success(theUser: KiiUser, groupList: js.Array[KiiGroup]): Any
}
object `33` {
  
  inline def apply(failure: (KiiUser, String) => Any, success: (KiiUser, js.Array[KiiGroup]) => Any): `33` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setFailure(value: (KiiUser, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: (KiiUser, js.Array[KiiGroup]) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
