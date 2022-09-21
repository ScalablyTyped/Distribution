package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryInterpretationOptions extends StObject {
  
  /**
    * Flag to disable natural language (NL) interpretation of queries. Default is false, Set to true to disable natural language interpretation. NL interpretation only applies to predefined datasources.
    */
  var disableNlInterpretation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Use this flag to disable supplemental results for a query. Supplemental results setting chosen at SearchApplication level will take precedence if set to True.
    */
  var disableSupplementalResults: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enable this flag to turn off all internal optimizations like natural language (NL) interpretation of queries, supplemental result retrieval, and usage of synonyms including custom ones. Nl interpretation will be disabled if either one of the two flags is true.
    */
  var enableVerbatimMode: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaQueryInterpretationOptions {
  
  inline def apply(): SchemaQueryInterpretationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInterpretationOptions]
  }
  
  extension [Self <: SchemaQueryInterpretationOptions](x: Self) {
    
    inline def setDisableNlInterpretation(value: Boolean): Self = StObject.set(x, "disableNlInterpretation", value.asInstanceOf[js.Any])
    
    inline def setDisableNlInterpretationNull: Self = StObject.set(x, "disableNlInterpretation", null)
    
    inline def setDisableNlInterpretationUndefined: Self = StObject.set(x, "disableNlInterpretation", js.undefined)
    
    inline def setDisableSupplementalResults(value: Boolean): Self = StObject.set(x, "disableSupplementalResults", value.asInstanceOf[js.Any])
    
    inline def setDisableSupplementalResultsNull: Self = StObject.set(x, "disableSupplementalResults", null)
    
    inline def setDisableSupplementalResultsUndefined: Self = StObject.set(x, "disableSupplementalResults", js.undefined)
    
    inline def setEnableVerbatimMode(value: Boolean): Self = StObject.set(x, "enableVerbatimMode", value.asInstanceOf[js.Any])
    
    inline def setEnableVerbatimModeNull: Self = StObject.set(x, "enableVerbatimMode", null)
    
    inline def setEnableVerbatimModeUndefined: Self = StObject.set(x, "enableVerbatimMode", js.undefined)
  }
}
