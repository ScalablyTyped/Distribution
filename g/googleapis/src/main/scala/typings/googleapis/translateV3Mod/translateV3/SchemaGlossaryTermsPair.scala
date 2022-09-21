package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlossaryTermsPair extends StObject {
  
  /**
    * The source term is the term that will get match in the text,
    */
  var sourceTerm: js.UndefOr[SchemaGlossaryTerm] = js.undefined
  
  /**
    * The term that will replace the match source term.
    */
  var targetTerm: js.UndefOr[SchemaGlossaryTerm] = js.undefined
}
object SchemaGlossaryTermsPair {
  
  inline def apply(): SchemaGlossaryTermsPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlossaryTermsPair]
  }
  
  extension [Self <: SchemaGlossaryTermsPair](x: Self) {
    
    inline def setSourceTerm(value: SchemaGlossaryTerm): Self = StObject.set(x, "sourceTerm", value.asInstanceOf[js.Any])
    
    inline def setSourceTermUndefined: Self = StObject.set(x, "sourceTerm", js.undefined)
    
    inline def setTargetTerm(value: SchemaGlossaryTerm): Self = StObject.set(x, "targetTerm", value.asInstanceOf[js.Any])
    
    inline def setTargetTermUndefined: Self = StObject.set(x, "targetTerm", js.undefined)
  }
}
