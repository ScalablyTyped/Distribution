package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatenateExpression extends js.Object {
  
  /**
    * The delimiter placed between dimension names. Delimiters are often single characters such as "|" or "," but can be longer strings. If a dimension value contains the delimiter, both
    * will be present in response with no distinction. For example if dimension 1 value = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the response will contain
    * "US,FR,JP".
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /** Names of dimensions. The names must refer back to names in the dimensions field of the request. */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.native
}
object ConcatenateExpression {
  
  @scala.inline
  def apply(): ConcatenateExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcatenateExpression]
  }
  
  @scala.inline
  implicit class ConcatenateExpressionOps[Self <: ConcatenateExpression] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDimensionNamesVarargs(value: String*): Self = this.set("dimensionNames", js.Array(value :_*))
    
    @scala.inline
    def setDimensionNames(value: js.Array[String]): Self = this.set("dimensionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionNames: Self = this.set("dimensionNames", js.undefined)
  }
}
