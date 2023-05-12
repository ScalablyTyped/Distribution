package typings.linguiConf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentalExtractorOptions extends StObject {
  
  /**
    * Entries to start extracting from.
    * Each separate resolved entry would create a separate catalog.
    *
    * Example for MPA application like Next.js
    * ```
    * <rootDir>/pages/ **\/ *.ts
    * <rootDir>/pages/ **\/ *.page.ts
    * ```
    *
    * With this config you would have a separate
    * catalog for every page file in your app.
    */
  var entries: js.Array[String]
  
  /**
    * By default all dependencies from package.json would be ecxluded from analyzing.
    * If something was not properly discovered you can add it here.
    *
    * Note: it automatically matches also sub imports
    *
    * "next" would match "next" and "next/head"
    */
  var excludeDeps: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * svg, jpg and other files which might be imported in application should be exluded from analysis.
    * By default extractor provides a comprehensive list of extensions. If you feel like somthing is missing in this list please fill an issue on GitHub
    *
    * NOTE: changing this param will override default list of extensions.
    */
  var excludeExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Explicitly include some dependency for extraction.
    * For example, you can include all monorepo's packages as
    * ["@mycompany/"]
    */
  var includeDeps: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * output path for extracted catalogs.
    *
    * Supported placeholders for entry: /pages/about/index.page.ts
    *  - {entryName} = index.page
    *  - {locale} = en
    *  - {entryDir} = pages/about/
    *
    * Examples:
    *
    * ```
    * <rootDir>/locales/{entryName}.{locale} -> /locales/index.page/en.po
    * <rootDir>/{entryDir}/locales/{locale} -> /pages/about/locales/en.po
    * ```
    */
  var output: String
  
  var resolveEsbuildOptions: js.UndefOr[js.Function1[/* options */ Any, Any]] = js.undefined
}
object ExperimentalExtractorOptions {
  
  inline def apply(entries: js.Array[String], output: String): ExperimentalExtractorOptions = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentalExtractorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentalExtractorOptions] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setExcludeDeps(value: js.Array[String]): Self = StObject.set(x, "excludeDeps", value.asInstanceOf[js.Any])
    
    inline def setExcludeDepsUndefined: Self = StObject.set(x, "excludeDeps", js.undefined)
    
    inline def setExcludeDepsVarargs(value: String*): Self = StObject.set(x, "excludeDeps", js.Array(value*))
    
    inline def setExcludeExtensions(value: js.Array[String]): Self = StObject.set(x, "excludeExtensions", value.asInstanceOf[js.Any])
    
    inline def setExcludeExtensionsUndefined: Self = StObject.set(x, "excludeExtensions", js.undefined)
    
    inline def setExcludeExtensionsVarargs(value: String*): Self = StObject.set(x, "excludeExtensions", js.Array(value*))
    
    inline def setIncludeDeps(value: js.Array[String]): Self = StObject.set(x, "includeDeps", value.asInstanceOf[js.Any])
    
    inline def setIncludeDepsUndefined: Self = StObject.set(x, "includeDeps", js.undefined)
    
    inline def setIncludeDepsVarargs(value: String*): Self = StObject.set(x, "includeDeps", js.Array(value*))
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setResolveEsbuildOptions(value: /* options */ Any => Any): Self = StObject.set(x, "resolveEsbuildOptions", js.Any.fromFunction1(value))
    
    inline def setResolveEsbuildOptionsUndefined: Self = StObject.set(x, "resolveEsbuildOptions", js.undefined)
  }
}
