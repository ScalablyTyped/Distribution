package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A polymorphic targeting value used as part of Shared Targeting.
  */
@js.native
trait SchemaTargetingValue extends StObject {
  
  /**
    * The creative size value to include/exclude. Filled in when key =
    * GOOG_CREATIVE_SIZE
    */
  var creativeSizeValue: js.UndefOr[SchemaCreativeSize] = js.native
  
  /**
    * The daypart targeting to include / exclude. Filled in when the key is
    * GOOG_DAYPART_TARGETING. The definition of this targeting is derived from
    * the structure used by Ad Manager.
    */
  var dayPartTargetingValue: js.UndefOr[SchemaDayPartTargeting] = js.native
  
  /**
    * The long value to include/exclude.
    */
  var longValue: js.UndefOr[String] = js.native
  
  /**
    * The string value to include/exclude.
    */
  var stringValue: js.UndefOr[String] = js.native
}
object SchemaTargetingValue {
  
  @scala.inline
  def apply(): SchemaTargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValue]
  }
  
  @scala.inline
  implicit class SchemaTargetingValueMutableBuilder[Self <: SchemaTargetingValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeSizeValue(value: SchemaCreativeSize): Self = StObject.set(x, "creativeSizeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeValueUndefined: Self = StObject.set(x, "creativeSizeValue", js.undefined)
    
    @scala.inline
    def setDayPartTargetingValue(value: SchemaDayPartTargeting): Self = StObject.set(x, "dayPartTargetingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPartTargetingValueUndefined: Self = StObject.set(x, "dayPartTargetingValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: String): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
