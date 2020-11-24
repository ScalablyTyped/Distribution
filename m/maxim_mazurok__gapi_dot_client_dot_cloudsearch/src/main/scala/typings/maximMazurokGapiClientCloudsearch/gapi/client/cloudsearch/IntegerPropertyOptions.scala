package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerPropertyOptions extends js.Object {
  
  /**
    * The maximum value of the property. The minimum and maximum values for the property are used to rank results according to the ordered ranking. Indexing requests with values greater
    * than the maximum are accepted and ranked with the same weight as items indexed with the maximum value.
    */
  var maximumValue: js.UndefOr[String] = js.native
  
  /**
    * The minimum value of the property. The minimum and maximum values for the property are used to rank results according to the ordered ranking. Indexing requests with values less than
    * the minimum are accepted and ranked with the same weight as items indexed with the minimum value.
    */
  var minimumValue: js.UndefOr[String] = js.native
  
  /** If set, describes how the integer should be used as a search operator. */
  var operatorOptions: js.UndefOr[IntegerOperatorOptions] = js.native
  
  /** Used to specify the ordered ranking for the integer. Can only be used if isRepeatable is false. */
  var orderedRanking: js.UndefOr[String] = js.native
}
object IntegerPropertyOptions {
  
  @scala.inline
  def apply(): IntegerPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerPropertyOptions]
  }
  
  @scala.inline
  implicit class IntegerPropertyOptionsOps[Self <: IntegerPropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setMaximumValue(value: String): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: String): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    
    @scala.inline
    def setOperatorOptions(value: IntegerOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
    
    @scala.inline
    def setOrderedRanking(value: String): Self = this.set("orderedRanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderedRanking: Self = this.set("orderedRanking", js.undefined)
  }
}
