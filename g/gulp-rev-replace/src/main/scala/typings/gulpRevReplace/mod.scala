package typings.gulpRevReplace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(options: Options): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("gulp-rev-replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var canonicalUris: js.UndefOr[Boolean] = js.undefined
    
    var manifest: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
      ] = js.undefined
    
    var modifyReved: js.UndefOr[js.Function] = js.undefined
    
    var modifyUnreved: js.UndefOr[js.Function] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var replaceInExtensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCanonicalUris(value: Boolean): Self = StObject.set(x, "canonicalUris", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUrisUndefined: Self = StObject.set(x, "canonicalUris", js.undefined)
      
      inline def setManifest(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
      ): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setModifyReved(value: js.Function): Self = StObject.set(x, "modifyReved", value.asInstanceOf[js.Any])
      
      inline def setModifyRevedUndefined: Self = StObject.set(x, "modifyReved", js.undefined)
      
      inline def setModifyUnreved(value: js.Function): Self = StObject.set(x, "modifyUnreved", value.asInstanceOf[js.Any])
      
      inline def setModifyUnrevedUndefined: Self = StObject.set(x, "modifyUnreved", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReplaceInExtensions(value: js.Array[String]): Self = StObject.set(x, "replaceInExtensions", value.asInstanceOf[js.Any])
      
      inline def setReplaceInExtensionsUndefined: Self = StObject.set(x, "replaceInExtensions", js.undefined)
      
      inline def setReplaceInExtensionsVarargs(value: String*): Self = StObject.set(x, "replaceInExtensions", js.Array(value*))
    }
  }
}
