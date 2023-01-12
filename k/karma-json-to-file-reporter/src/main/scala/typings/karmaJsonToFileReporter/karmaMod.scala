package typings.karmaJsonToFileReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * see {@link https://www.npmjs.com/package/karma-json-to-file-reporter#config}
      */
    var jsonToFileReporter: js.UndefOr[JsonToFileReporterOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setJsonToFileReporter(value: JsonToFileReporterOptions): Self = StObject.set(x, "jsonToFileReporter", value.asInstanceOf[js.Any])
      
      inline def setJsonToFileReporterUndefined: Self = StObject.set(x, "jsonToFileReporter", js.undefined)
    }
  }
  
  /**
    * JSON messages logged via console.log(_) will be filtered
    * and saved to local json file you specified in config.
    */
  trait JsonToFileReporterOptions extends StObject {
    
    /**
      * File name pattern. You can use wildcards:
      * `*timestamp*` - for current karma run timestamp.
      * `*index*` - for log entry index: 1, 2, 3, etc.
      * @default 'logFile_start-timestamp.json'
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * Filter for json objects. This option can be:
      * - string - filter JSONs by field on the root level
      * - predicate function
      */
    var filter: js.UndefOr[String | (js.Function1[/* obj */ js.Object, Boolean])] = js.undefined
    
    /** Path for your json output file. By default it will save your files in the root of your project. */
    var outputPath: js.UndefOr[String] = js.undefined
    
    /**
      * Set it true to overwrite files if it already exists. If false, log entries will be added to the end
      */
    var overwrite: js.UndefOr[Boolean] = js.undefined
  }
  object JsonToFileReporterOptions {
    
    inline def apply(): JsonToFileReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonToFileReporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonToFileReporterOptions] (val x: Self) extends AnyVal {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFilter(value: String | (js.Function1[/* obj */ js.Object, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* obj */ js.Object => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
}
