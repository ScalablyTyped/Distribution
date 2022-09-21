package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCisBenchmark extends StObject {
  
  /**
    * The profile level of this CIS benchmark check.
    */
  var profileLevel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The severity level of this CIS benchmark check.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
}
object SchemaCisBenchmark {
  
  inline def apply(): SchemaCisBenchmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCisBenchmark]
  }
  
  extension [Self <: SchemaCisBenchmark](x: Self) {
    
    inline def setProfileLevel(value: Double): Self = StObject.set(x, "profileLevel", value.asInstanceOf[js.Any])
    
    inline def setProfileLevelNull: Self = StObject.set(x, "profileLevel", null)
    
    inline def setProfileLevelUndefined: Self = StObject.set(x, "profileLevel", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
