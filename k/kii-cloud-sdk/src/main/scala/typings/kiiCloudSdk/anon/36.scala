package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiSocialNetworkName
import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  def failure(user: KiiUser, network: KiiSocialNetworkName, anErrorString: String): js.Any
  
  def success(user: KiiUser, network: KiiSocialNetworkName): js.Any
}
object `36` {
  
  inline def apply(
    failure: (KiiUser, KiiSocialNetworkName, String) => js.Any,
    success: (KiiUser, KiiSocialNetworkName) => js.Any
  ): `36` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`36`]
  }
  
  extension [Self <: `36`](x: Self) {
    
    inline def setFailure(value: (KiiUser, KiiSocialNetworkName, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction3(value))
    
    inline def setSuccess(value: (KiiUser, KiiSocialNetworkName) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
