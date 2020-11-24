package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Value of the dimension.
  */
@js.native
trait SchemaDimensionDimensionValue extends js.Object {
  
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
  implicit class SchemaDimensionDimensionValueOps[Self <: SchemaDimensionDimensionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
  }
}
