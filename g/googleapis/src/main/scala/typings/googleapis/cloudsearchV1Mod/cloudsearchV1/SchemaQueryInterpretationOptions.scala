package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to interpret user query.
  */
trait SchemaQueryInterpretationOptions extends StObject {
  
  /**
    * Flag to disable natural language (NL) interpretation of queries. Default
    * is false, Set to true to disable natural language interpretation. NL
    * interpretation only applies to predefined datasources.
    */
  var disableNlInterpretation: js.UndefOr[Boolean] = js.undefined
}
object SchemaQueryInterpretationOptions {
  
  inline def apply(): SchemaQueryInterpretationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInterpretationOptions]
  }
  
  extension [Self <: SchemaQueryInterpretationOptions](x: Self) {
    
    inline def setDisableNlInterpretation(value: Boolean): Self = StObject.set(x, "disableNlInterpretation", value.asInstanceOf[js.Any])
    
    inline def setDisableNlInterpretationUndefined: Self = StObject.set(x, "disableNlInterpretation", js.undefined)
  }
}
