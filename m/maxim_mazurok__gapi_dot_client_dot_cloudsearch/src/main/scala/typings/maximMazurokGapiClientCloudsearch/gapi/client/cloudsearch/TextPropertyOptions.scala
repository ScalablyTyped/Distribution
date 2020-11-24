package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextPropertyOptions extends js.Object {
  
  /** If set, describes how the property should be used as a search operator. */
  var operatorOptions: js.UndefOr[TextOperatorOptions] = js.native
  
  /** Indicates the search quality importance of the tokens within the field when used for retrieval. */
  var retrievalImportance: js.UndefOr[RetrievalImportance] = js.native
}
object TextPropertyOptions {
  
  @scala.inline
  def apply(): TextPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropertyOptions]
  }
  
  @scala.inline
  implicit class TextPropertyOptionsOps[Self <: TextPropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setOperatorOptions(value: TextOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
    
    @scala.inline
    def setRetrievalImportance(value: RetrievalImportance): Self = this.set("retrievalImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrievalImportance: Self = this.set("retrievalImportance", js.undefined)
  }
}
