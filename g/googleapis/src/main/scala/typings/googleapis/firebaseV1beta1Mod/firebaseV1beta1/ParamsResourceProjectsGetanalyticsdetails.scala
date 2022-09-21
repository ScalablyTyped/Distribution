package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetanalyticsdetails
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the FirebaseProject, in the format: projects/ PROJECT_IDENTIFIER/analyticsDetails Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetanalyticsdetails {
  
  inline def apply(): ParamsResourceProjectsGetanalyticsdetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetanalyticsdetails]
  }
  
  extension [Self <: ParamsResourceProjectsGetanalyticsdetails](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
