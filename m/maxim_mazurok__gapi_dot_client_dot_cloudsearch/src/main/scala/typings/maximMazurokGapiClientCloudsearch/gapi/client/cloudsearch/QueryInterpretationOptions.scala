package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInterpretationOptions extends StObject {
  
  /**
    * Flag to disable natural language (NL) interpretation of queries. Default is false, Set to true to disable natural language interpretation. NL interpretation only applies to
    * predefined datasources.
    */
  var disableNlInterpretation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable this flag to turn off all internal optimizations like natural language (NL) interpretation of queries, supplemental result retrieval, and usage of synonyms including custom
    * ones. Nl interpretation will be disabled if either one of the two flags is true.
    */
  var enableVerbatimMode: js.UndefOr[Boolean] = js.undefined
}
object QueryInterpretationOptions {
  
  @scala.inline
  def apply(): QueryInterpretationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInterpretationOptions]
  }
  
  @scala.inline
  implicit class QueryInterpretationOptionsMutableBuilder[Self <: QueryInterpretationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableNlInterpretation(value: Boolean): Self = StObject.set(x, "disableNlInterpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNlInterpretationUndefined: Self = StObject.set(x, "disableNlInterpretation", js.undefined)
    
    @scala.inline
    def setEnableVerbatimMode(value: Boolean): Self = StObject.set(x, "enableVerbatimMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVerbatimModeUndefined: Self = StObject.set(x, "enableVerbatimMode", js.undefined)
  }
}
