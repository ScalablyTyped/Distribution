package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlPropertyOptions extends js.Object {
  
  /** If set, describes how the property should be used as a search operator. */
  var operatorOptions: js.UndefOr[HtmlOperatorOptions] = js.native
  
  /** Indicates the search quality importance of the tokens within the field when used for retrieval. Can only be set to DEFAULT or NONE. */
  var retrievalImportance: js.UndefOr[RetrievalImportance] = js.native
}
object HtmlPropertyOptions {
  
  @scala.inline
  def apply(): HtmlPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlPropertyOptions]
  }
  
  @scala.inline
  implicit class HtmlPropertyOptionsOps[Self <: HtmlPropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setOperatorOptions(value: HtmlOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
    
    @scala.inline
    def setRetrievalImportance(value: RetrievalImportance): Self = this.set("retrievalImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrievalImportance: Self = this.set("retrievalImportance", js.undefined)
  }
}
