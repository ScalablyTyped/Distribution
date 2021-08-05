package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  def failure(error: String, statusCode: Double): js.Any
  
  def success(adminContext: KiiAppAdminContext): js.Any
}
object `34` {
  
  inline def apply(failure: (String, Double) => js.Any, success: KiiAppAdminContext => js.Any): `34` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setFailure(value: (String, Double) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: KiiAppAdminContext => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
