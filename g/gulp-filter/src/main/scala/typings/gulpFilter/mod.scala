package typings.gulpFilter

import typings.minimatch.mod.IOptions
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pattern: String): Filter = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Filter]
  inline def apply(pattern: String, options: Options): Filter = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Filter]
  inline def apply(pattern: js.Array[String]): Filter = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Filter]
  inline def apply(pattern: js.Array[String], options: Options): Filter = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Filter]
  inline def apply(pattern: FileFunction): Filter = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Filter]
  inline def apply(pattern: FileFunction, options: Options): Filter = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Filter]
  
  @JSImport("gulp-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FileFunction = js.Function1[/* file */ File, Boolean]
  
  // A transform stream with a .restore object
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream * / any */ trait Filter extends StObject {
    
    var restore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  }
  object Filter {
    
    inline def apply(
      restore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
    ): Filter = {
      val __obj = js.Dynamic.literal(restore = restore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setRestore(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
      ): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with IOptions {
    
    var passthrough: js.UndefOr[Boolean] = js.undefined
    
    var restore: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      inline def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    }
  }
}
