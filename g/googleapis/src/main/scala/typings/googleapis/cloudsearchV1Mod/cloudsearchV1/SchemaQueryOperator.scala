package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of a operator that can be used in a Search/Suggest request.
  */
@js.native
trait SchemaQueryOperator extends js.Object {
  
  /**
    * Display name of the operator
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Potential list of values for the opeatror field. This field is only
    * filled when we can safely enumerate all the possible values of this
    * operator.
    */
  var enumValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates the operator name that can be used to  isolate the property
    * using the greater-than operator.
    */
  var greaterThanOperatorName: js.UndefOr[String] = js.native
  
  /**
    * Can this operator be used to get facets.
    */
  var isFacetable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if multiple values can be set for this property.
    */
  var isRepeatable: js.UndefOr[Boolean] = js.native
  
  /**
    * Will the property associated with this facet be returned as part of
    * search results.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  
  /**
    * Can this operator be used to sort results.
    */
  var isSortable: js.UndefOr[Boolean] = js.native
  
  /**
    * Can get suggestions for this field.
    */
  var isSuggestable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the operator name that can be used to  isolate the property
    * using the less-than operator.
    */
  var lessThanOperatorName: js.UndefOr[String] = js.native
  
  /**
    * The name of the operator.
    */
  var operatorName: js.UndefOr[String] = js.native
  
  /**
    * Type of the operator.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaQueryOperator {
  
  @scala.inline
  def apply(): SchemaQueryOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryOperator]
  }
  
  @scala.inline
  implicit class SchemaQueryOperatorOps[Self <: SchemaQueryOperator] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEnumValuesVarargs(value: String*): Self = this.set("enumValues", js.Array(value :_*))
    
    @scala.inline
    def setEnumValues(value: js.Array[String]): Self = this.set("enumValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumValues: Self = this.set("enumValues", js.undefined)
    
    @scala.inline
    def setGreaterThanOperatorName(value: String): Self = this.set("greaterThanOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreaterThanOperatorName: Self = this.set("greaterThanOperatorName", js.undefined)
    
    @scala.inline
    def setIsFacetable(value: Boolean): Self = this.set("isFacetable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFacetable: Self = this.set("isFacetable", js.undefined)
    
    @scala.inline
    def setIsRepeatable(value: Boolean): Self = this.set("isRepeatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRepeatable: Self = this.set("isRepeatable", js.undefined)
    
    @scala.inline
    def setIsReturnable(value: Boolean): Self = this.set("isReturnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReturnable: Self = this.set("isReturnable", js.undefined)
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSortable: Self = this.set("isSortable", js.undefined)
    
    @scala.inline
    def setIsSuggestable(value: Boolean): Self = this.set("isSuggestable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSuggestable: Self = this.set("isSuggestable", js.undefined)
    
    @scala.inline
    def setLessThanOperatorName(value: String): Self = this.set("lessThanOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessThanOperatorName: Self = this.set("lessThanOperatorName", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
