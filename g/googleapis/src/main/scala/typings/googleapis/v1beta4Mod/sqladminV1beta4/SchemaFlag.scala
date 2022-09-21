package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFlag extends StObject {
  
  /**
    * Use this field if only certain integers are accepted. Can be combined with min_value and max_value to add additional values.
    */
  var allowedIntValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * For `STRING` flags, a list of strings that the value can be set to.
    */
  var allowedStringValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The database version this flag applies to. Can be MySQL instances: `MYSQL_8_0`, `MYSQL_8_0_18`, `MYSQL_8_0_26`, `MYSQL_5_7`, or `MYSQL_5_6`. PostgreSQL instances: `POSTGRES_9_6`, `POSTGRES_10`, `POSTGRES_11` or `POSTGRES_12`. SQL Server instances: `SQLSERVER_2017_STANDARD`, `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`, `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or `SQLSERVER_2019_WEB`. See [the complete list](/sql/docs/mysql/admin-api/rest/v1/SqlDatabaseVersion).
    */
  var appliesTo: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether or not the flag is considered in beta.
    */
  var inBeta: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This is always `sql#flag`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For `INTEGER` flags, the maximum allowed value.
    */
  var maxValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For `INTEGER` flags, the minimum allowed value.
    */
  var minValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is the name of the flag. Flag names always use underscores, not hyphens, for example: `max_allowed_packet`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether changing this flag will trigger a database restart. Only applicable to Second Generation instances.
    */
  var requiresRestart: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The type of the flag. Flags are typed to being `BOOLEAN`, `STRING`, `INTEGER` or `NONE`. `NONE` is used for flags which do not take a value, such as `skip_grant_tables`.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaFlag {
  
  inline def apply(): SchemaFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlag]
  }
  
  extension [Self <: SchemaFlag](x: Self) {
    
    inline def setAllowedIntValues(value: js.Array[String]): Self = StObject.set(x, "allowedIntValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedIntValuesNull: Self = StObject.set(x, "allowedIntValues", null)
    
    inline def setAllowedIntValuesUndefined: Self = StObject.set(x, "allowedIntValues", js.undefined)
    
    inline def setAllowedIntValuesVarargs(value: String*): Self = StObject.set(x, "allowedIntValues", js.Array(value*))
    
    inline def setAllowedStringValues(value: js.Array[String]): Self = StObject.set(x, "allowedStringValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedStringValuesNull: Self = StObject.set(x, "allowedStringValues", null)
    
    inline def setAllowedStringValuesUndefined: Self = StObject.set(x, "allowedStringValues", js.undefined)
    
    inline def setAllowedStringValuesVarargs(value: String*): Self = StObject.set(x, "allowedStringValues", js.Array(value*))
    
    inline def setAppliesTo(value: js.Array[String]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToNull: Self = StObject.set(x, "appliesTo", null)
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: String*): Self = StObject.set(x, "appliesTo", js.Array(value*))
    
    inline def setInBeta(value: Boolean): Self = StObject.set(x, "inBeta", value.asInstanceOf[js.Any])
    
    inline def setInBetaNull: Self = StObject.set(x, "inBeta", null)
    
    inline def setInBetaUndefined: Self = StObject.set(x, "inBeta", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueNull: Self = StObject.set(x, "maxValue", null)
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequiresRestart(value: Boolean): Self = StObject.set(x, "requiresRestart", value.asInstanceOf[js.Any])
    
    inline def setRequiresRestartNull: Self = StObject.set(x, "requiresRestart", null)
    
    inline def setRequiresRestartUndefined: Self = StObject.set(x, "requiresRestart", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
