package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureSuccess extends StObject {
  
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): Any
  
  def success(adminContext: KiiAppAdminContext): Any
}
object FailureSuccess {
  
  inline def apply(
    failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => Any,
    success: KiiAppAdminContext => Any
  ): FailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[FailureSuccess]
  }
  
  extension [Self <: FailureSuccess](x: Self) {
    
    inline def setFailure(value: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction4(value))
    
    inline def setSuccess(value: KiiAppAdminContext => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
