package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHint extends StObject {
  
  /**
    * Required. The human readable name of this attestation authority, for example "qa".
    */
  var humanReadableName: js.UndefOr[String | Null] = js.undefined
}
object SchemaHint {
  
  inline def apply(): SchemaHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHint]
  }
  
  extension [Self <: SchemaHint](x: Self) {
    
    inline def setHumanReadableName(value: String): Self = StObject.set(x, "humanReadableName", value.asInstanceOf[js.Any])
    
    inline def setHumanReadableNameNull: Self = StObject.set(x, "humanReadableName", null)
    
    inline def setHumanReadableNameUndefined: Self = StObject.set(x, "humanReadableName", js.undefined)
  }
}
