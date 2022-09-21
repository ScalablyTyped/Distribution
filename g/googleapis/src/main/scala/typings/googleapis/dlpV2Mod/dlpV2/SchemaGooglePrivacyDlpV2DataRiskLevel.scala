package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DataRiskLevel extends StObject {
  
  /**
    * The score applied to the resource.
    */
  var score: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2DataRiskLevel {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DataRiskLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DataRiskLevel]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DataRiskLevel](x: Self) {
    
    inline def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
