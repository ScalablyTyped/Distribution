package typings.libp2pDelegatedContentRouting.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions * / any */ trait DHTProvideOptions extends StObject {
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object DHTProvideOptions {
  
  inline def apply(): DHTProvideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DHTProvideOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DHTProvideOptions] (val x: Self) extends AnyVal {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
