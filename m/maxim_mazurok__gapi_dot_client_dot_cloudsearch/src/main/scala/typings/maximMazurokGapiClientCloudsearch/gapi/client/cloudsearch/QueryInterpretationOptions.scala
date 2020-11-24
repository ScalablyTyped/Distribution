package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInterpretationOptions extends js.Object {
  
  /**
    * Flag to disable natural language (NL) interpretation of queries. Default is false, Set to true to disable natural language interpretation. NL interpretation only applies to
    * predefined datasources.
    */
  var disableNlInterpretation: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this flag to turn off all internal optimizations like natural language (NL) interpretation of queries, supplemental result retrieval, and usage of synonyms including custom
    * ones. Nl interpretation will be disabled if either one of the two flags is true.
    */
  var enableVerbatimMode: js.UndefOr[Boolean] = js.native
}
object QueryInterpretationOptions {
  
  @scala.inline
  def apply(): QueryInterpretationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInterpretationOptions]
  }
  
  @scala.inline
  implicit class QueryInterpretationOptionsOps[Self <: QueryInterpretationOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableNlInterpretation(value: Boolean): Self = this.set("disableNlInterpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNlInterpretation: Self = this.set("disableNlInterpretation", js.undefined)
    
    @scala.inline
    def setEnableVerbatimMode(value: Boolean): Self = this.set("enableVerbatimMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableVerbatimMode: Self = this.set("enableVerbatimMode", js.undefined)
  }
}
