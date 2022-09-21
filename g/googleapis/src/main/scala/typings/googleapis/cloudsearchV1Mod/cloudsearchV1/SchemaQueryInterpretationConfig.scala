package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryInterpretationConfig extends StObject {
  
  /**
    * Set this flag to disable supplemental results retrieval, setting a flag here will not retrieve supplemental results for queries associated with a given search application. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for supplemental results.
    */
  var forceDisableSupplementalResults: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enable this flag to turn off all internal optimizations like natural language (NL) interpretation of queries, supplemental results retrieval, and usage of synonyms including custom ones. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for verbatim mode.
    */
  var forceVerbatimMode: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaQueryInterpretationConfig {
  
  inline def apply(): SchemaQueryInterpretationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInterpretationConfig]
  }
  
  extension [Self <: SchemaQueryInterpretationConfig](x: Self) {
    
    inline def setForceDisableSupplementalResults(value: Boolean): Self = StObject.set(x, "forceDisableSupplementalResults", value.asInstanceOf[js.Any])
    
    inline def setForceDisableSupplementalResultsNull: Self = StObject.set(x, "forceDisableSupplementalResults", null)
    
    inline def setForceDisableSupplementalResultsUndefined: Self = StObject.set(x, "forceDisableSupplementalResults", js.undefined)
    
    inline def setForceVerbatimMode(value: Boolean): Self = StObject.set(x, "forceVerbatimMode", value.asInstanceOf[js.Any])
    
    inline def setForceVerbatimModeNull: Self = StObject.set(x, "forceVerbatimMode", null)
    
    inline def setForceVerbatimModeUndefined: Self = StObject.set(x, "forceVerbatimMode", js.undefined)
  }
}
