package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParameter extends js.Object {
  
  /** [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query. */
  var name: js.UndefOr[String] = js.native
  
  /** [Required] The type of this parameter. */
  var parameterType: js.UndefOr[QueryParameterType] = js.native
  
  /** [Required] The value of this parameter. */
  var parameterValue: js.UndefOr[QueryParameterValue] = js.native
}
object QueryParameter {
  
  @scala.inline
  def apply(): QueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameter]
  }
  
  @scala.inline
  implicit class QueryParameterOps[Self <: QueryParameter] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParameterType(value: QueryParameterType): Self = this.set("parameterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterType: Self = this.set("parameterType", js.undefined)
    
    @scala.inline
    def setParameterValue(value: QueryParameterValue): Self = this.set("parameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterValue: Self = this.set("parameterValue", js.undefined)
  }
}
