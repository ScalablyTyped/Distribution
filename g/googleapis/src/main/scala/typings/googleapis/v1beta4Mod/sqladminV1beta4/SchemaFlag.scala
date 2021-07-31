package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A flag resource.
  */
trait SchemaFlag extends StObject {
  
  /**
    * For STRING flags, a list of strings that the value can be set to.
    */
  var allowedStringValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The database version this flag applies to. Can be MYSQL_5_5, MYSQL_5_6,
    * or MYSQL_5_7. MYSQL_5_7 is applicable only to Second Generation
    * instances.
    */
  var appliesTo: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * True if the flag is only released in Beta.
    */
  var inBeta: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is always sql#flag.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * For INTEGER flags, the maximum allowed value.
    */
  var maxValue: js.UndefOr[String] = js.undefined
  
  /**
    * For INTEGER flags, the minimum allowed value.
    */
  var minValue: js.UndefOr[String] = js.undefined
  
  /**
    * This is the name of the flag. Flag names always use underscores, not
    * hyphens, e.g. max_allowed_packet
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether changing this flag will trigger a database restart.
    * Only applicable to Second Generation instances.
    */
  var requiresRestart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of the flag. Flags are typed to being BOOLEAN, STRING, INTEGER
    * or NONE. NONE is used for flags which do not take a value, such as
    * skip_grant_tables.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaFlag {
  
  @scala.inline
  def apply(): SchemaFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlag]
  }
  
  @scala.inline
  implicit class SchemaFlagMutableBuilder[Self <: SchemaFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedStringValues(value: js.Array[String]): Self = StObject.set(x, "allowedStringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedStringValuesUndefined: Self = StObject.set(x, "allowedStringValues", js.undefined)
    
    @scala.inline
    def setAllowedStringValuesVarargs(value: String*): Self = StObject.set(x, "allowedStringValues", js.Array(value :_*))
    
    @scala.inline
    def setAppliesTo(value: js.Array[String]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    @scala.inline
    def setAppliesToVarargs(value: String*): Self = StObject.set(x, "appliesTo", js.Array(value :_*))
    
    @scala.inline
    def setInBeta(value: Boolean): Self = StObject.set(x, "inBeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInBetaUndefined: Self = StObject.set(x, "inBeta", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequiresRestart(value: Boolean): Self = StObject.set(x, "requiresRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresRestartUndefined: Self = StObject.set(x, "requiresRestart", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
