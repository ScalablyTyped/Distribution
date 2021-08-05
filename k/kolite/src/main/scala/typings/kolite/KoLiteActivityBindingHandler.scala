package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler * / any */ trait KoLiteActivityBindingHandler extends StObject {
  
  var defaultOptions: KoLiteActivityDefaultOptions
}
object KoLiteActivityBindingHandler {
  
  inline def apply(defaultOptions: KoLiteActivityDefaultOptions): KoLiteActivityBindingHandler = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoLiteActivityBindingHandler]
  }
  
  extension [Self <: KoLiteActivityBindingHandler](x: Self) {
    
    inline def setDefaultOptions(value: KoLiteActivityDefaultOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
  }
}
