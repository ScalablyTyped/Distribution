package typings.gulpFileInclude

import org.scalablytyped.runtime.StringDictionary
import typings.gulpFileInclude.gulpFileIncludeStrings.`@file`
import typings.gulpFileInclude.gulpFileIncludeStrings.`@root`
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(prefix: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(prefix.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-file-include", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Can be "@file" or "@root" or some base path.
      * default: "@file"
      */
    var basepath: js.UndefOr[`@file` | `@root` | String] = js.undefined
    
    /**
      * Effectively a context for variables used in 'if' statements.
      */
    var context: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Filters basically look like functions that get passed into '@@include'.
      * When one of these functions is called, something of that name is looked
      * up in this object and called to get the contents of that include.
      */
    var filters: js.UndefOr[StringDictionary[js.Function1[/* arg */ Any, String]]] = js.undefined
    
    /**
      * default: false
      */
    var indent: js.UndefOr[Boolean] = js.undefined
    
    /** default: "@@" */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** default: "" */
    var suffix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasepath(value: `@file` | `@root` | String): Self = StObject.set(x, "basepath", value.asInstanceOf[js.Any])
      
      inline def setBasepathUndefined: Self = StObject.set(x, "basepath", js.undefined)
      
      inline def setContext(value: StringDictionary[Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFilters(value: StringDictionary[js.Function1[/* arg */ Any, String]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
