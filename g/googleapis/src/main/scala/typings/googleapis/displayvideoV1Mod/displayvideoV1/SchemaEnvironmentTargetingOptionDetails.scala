package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironmentTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The serving environment.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnvironmentTargetingOptionDetails {
  
  inline def apply(): SchemaEnvironmentTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentTargetingOptionDetails]
  }
  
  extension [Self <: SchemaEnvironmentTargetingOptionDetails](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
