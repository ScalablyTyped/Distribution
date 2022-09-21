package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAlertChart extends StObject {
  
  /**
    * Required. The resource name of the alert policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID]
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAlertChart {
  
  inline def apply(): SchemaAlertChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlertChart]
  }
  
  extension [Self <: SchemaAlertChart](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
