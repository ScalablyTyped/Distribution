package typings.isNameTaken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("is-name-taken/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTaken(name: String): js.Promise[String | Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaken")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Boolean]]
  inline def isTaken(name: String, options: Options): js.Promise[String | Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isTaken")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Boolean]]
  
  inline def isValid(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoadOptions * / any */ trait Options extends StObject {
    
    /**
      * Setting optimistic to true will skip syncing latest packages from NPM.
      * This is faster, but may lead to inconsistencies with recently published packages.
      */
    var optimistic: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptimistic(value: Boolean): Self = StObject.set(x, "optimistic", value.asInstanceOf[js.Any])
      
      inline def setOptimisticUndefined: Self = StObject.set(x, "optimistic", js.undefined)
    }
  }
}
