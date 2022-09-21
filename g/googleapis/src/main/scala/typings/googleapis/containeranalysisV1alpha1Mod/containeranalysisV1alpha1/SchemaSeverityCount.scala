package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeverityCount extends StObject {
  
  /**
    * The number of occurrences with the severity.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The severity of the occurrences.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
}
object SchemaSeverityCount {
  
  inline def apply(): SchemaSeverityCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeverityCount]
  }
  
  extension [Self <: SchemaSeverityCount](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
