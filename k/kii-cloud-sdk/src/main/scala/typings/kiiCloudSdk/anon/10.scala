package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): js.Any
  
  def success(theSavedGroup: KiiGroup): js.Any
}
object `10` {
  
  inline def apply(
    failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any,
    success: KiiGroup => js.Any
  ): `10` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setFailure(value: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction4(value))
    
    inline def setSuccess(value: KiiGroup => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
