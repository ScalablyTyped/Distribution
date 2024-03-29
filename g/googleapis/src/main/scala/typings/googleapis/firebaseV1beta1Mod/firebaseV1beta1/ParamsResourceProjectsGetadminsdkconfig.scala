package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetadminsdkconfig
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the FirebaseProject, in the format: projects/ PROJECT_IDENTIFIER/adminSdkConfig Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetadminsdkconfig {
  
  inline def apply(): ParamsResourceProjectsGetadminsdkconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetadminsdkconfig]
  }
  
  extension [Self <: ParamsResourceProjectsGetadminsdkconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
