package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Value of the dimension.
  */
@js.native
trait SchemaDimensionDimensionValue extends StObject {
  
  /**
    * Id of the dimension.
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * Name of the dimension mainly for debugging purposes, except for the case
    * of CREATIVE_SIZE. For CREATIVE_SIZE, strings are used instead of ids.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Percent of total impressions for a dimension type. e.g. {dimension_type:
    * &#39;GENDER&#39;, [{dimension_value: {id: 1, name: &#39;MALE&#39;,
    * percentage: 60}}]} Gender MALE is 60% of all impressions which have
    * gender.
    */
  var percentage: js.UndefOr[Double] = js.native
}
object SchemaDimensionDimensionValue {
  
  @scala.inline
  def apply(): SchemaDimensionDimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionDimensionValue]
  }
  
  @scala.inline
  implicit class SchemaDimensionDimensionValueMutableBuilder[Self <: SchemaDimensionDimensionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
