package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlossaryTermsSet extends StObject {
  
  /**
    * Each term in the set represents a term that can be replaced by the other terms.
    */
  var terms: js.UndefOr[js.Array[SchemaGlossaryTerm]] = js.undefined
}
object SchemaGlossaryTermsSet {
  
  inline def apply(): SchemaGlossaryTermsSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlossaryTermsSet]
  }
  
  extension [Self <: SchemaGlossaryTermsSet](x: Self) {
    
    inline def setTerms(value: js.Array[SchemaGlossaryTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTermsVarargs(value: SchemaGlossaryTerm*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
