package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumPropertyOptions extends js.Object {
  
  /** If set, describes how the enum should be used as a search operator. */
  var operatorOptions: js.UndefOr[EnumOperatorOptions] = js.native
  
  /**
    * Used to specify the ordered ranking for the enumeration that determines how the integer values provided in the possible EnumValuePairs are used to rank results. If specified,
    * integer values must be provided for all possible EnumValuePair values given for this property. Can only be used if isRepeatable is false.
    */
  var orderedRanking: js.UndefOr[String] = js.native
  
  /**
    * The list of possible values for the enumeration property. All EnumValuePairs must provide a string value. If you specify an integer value for one EnumValuePair, then all possible
    * EnumValuePairs must provide an integer value. Both the string value and integer value must be unique over all possible values. Once set, possible values cannot be removed or
    * modified. If you supply an ordered ranking and think you might insert additional enum values in the future, leave gaps in the initial integer values to allow adding a value in
    * between previously registered values. The maximum number of elements is 100.
    */
  var possibleValues: js.UndefOr[js.Array[EnumValuePair]] = js.native
}
object EnumPropertyOptions {
  
  @scala.inline
  def apply(): EnumPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnumPropertyOptions]
  }
  
  @scala.inline
  implicit class EnumPropertyOptionsOps[Self <: EnumPropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setOperatorOptions(value: EnumOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
    
    @scala.inline
    def setOrderedRanking(value: String): Self = this.set("orderedRanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderedRanking: Self = this.set("orderedRanking", js.undefined)
    
    @scala.inline
    def setPossibleValuesVarargs(value: EnumValuePair*): Self = this.set("possibleValues", js.Array(value :_*))
    
    @scala.inline
    def setPossibleValues(value: js.Array[EnumValuePair]): Self = this.set("possibleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePossibleValues: Self = this.set("possibleValues", js.undefined)
  }
}
