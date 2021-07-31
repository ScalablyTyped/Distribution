package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlPropertyOptions extends StObject {
  
  /** If set, describes how the property should be used as a search operator. */
  var operatorOptions: js.UndefOr[HtmlOperatorOptions] = js.undefined
  
  /** Indicates the search quality importance of the tokens within the field when used for retrieval. Can only be set to DEFAULT or NONE. */
  var retrievalImportance: js.UndefOr[RetrievalImportance] = js.undefined
}
object HtmlPropertyOptions {
  
  @scala.inline
  def apply(): HtmlPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlPropertyOptions]
  }
  
  @scala.inline
  implicit class HtmlPropertyOptionsMutableBuilder[Self <: HtmlPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: HtmlOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    @scala.inline
    def setRetrievalImportance(value: RetrievalImportance): Self = StObject.set(x, "retrievalImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalImportanceUndefined: Self = StObject.set(x, "retrievalImportance", js.undefined)
  }
}
