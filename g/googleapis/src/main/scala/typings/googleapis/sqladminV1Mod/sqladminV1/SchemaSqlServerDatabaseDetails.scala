package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlServerDatabaseDetails extends StObject {
  
  /**
    * The version of SQL Server with which the database is to be made compatible
    */
  var compatibilityLevel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The recovery model of a SQL Server database
    */
  var recoveryModel: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlServerDatabaseDetails {
  
  inline def apply(): SchemaSqlServerDatabaseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlServerDatabaseDetails]
  }
  
  extension [Self <: SchemaSqlServerDatabaseDetails](x: Self) {
    
    inline def setCompatibilityLevel(value: Double): Self = StObject.set(x, "compatibilityLevel", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityLevelNull: Self = StObject.set(x, "compatibilityLevel", null)
    
    inline def setCompatibilityLevelUndefined: Self = StObject.set(x, "compatibilityLevel", js.undefined)
    
    inline def setRecoveryModel(value: String): Self = StObject.set(x, "recoveryModel", value.asInstanceOf[js.Any])
    
    inline def setRecoveryModelNull: Self = StObject.set(x, "recoveryModel", null)
    
    inline def setRecoveryModelUndefined: Self = StObject.set(x, "recoveryModel", js.undefined)
  }
}
