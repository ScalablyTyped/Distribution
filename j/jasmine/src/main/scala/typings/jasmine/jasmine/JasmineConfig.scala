package typings.jasmine.jasmine

import typings.jasmine.jasmineStrings.`import`
import typings.jasmine.jasmineStrings.require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineConfig extends StObject {
  
  /**
    * Whether to fail specs that contain no expectations.
    * @default false
    */
  var failSpecWithNoExpectations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of helper file paths or globs that match helper files. Each path or
    * glob will be evaluated relative to the spec directory. Helpers are loaded before specs.
    */
  var helpers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies how to load files with names ending in .js. Valid values are
    * "require" and "import". "import" should be safe in all cases, and is
    * required if your project contains ES modules with filenames ending in .js.
    * @default "require"
    */
  var jsLoader: js.UndefOr[require | `import`] = js.undefined
  
  /**
    * Whether to run specs in a random order.
    */
  var random: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of module names to load via require() at the start of execution.
    */
  var requires: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The directory that spec files are contained in, relative to the project base directory.
    */
  var spec_dir: js.UndefOr[String] = js.undefined
  
  /**
    * An array of spec file paths or globs that match helper files. Each path
    * or glob will be evaluated relative to the spec directory.
    */
  var spec_files: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to stop suite execution on the first spec failure.
    */
  var stopOnSpecFailure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to stop each spec on the first expectation failure.
    */
  var stopSpecOnExpectationFailure: js.UndefOr[Boolean] = js.undefined
}
object JasmineConfig {
  
  inline def apply(): JasmineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JasmineConfig] (val x: Self) extends AnyVal {
    
    inline def setFailSpecWithNoExpectations(value: Boolean): Self = StObject.set(x, "failSpecWithNoExpectations", value.asInstanceOf[js.Any])
    
    inline def setFailSpecWithNoExpectationsUndefined: Self = StObject.set(x, "failSpecWithNoExpectations", js.undefined)
    
    inline def setHelpers(value: js.Array[String]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    inline def setHelpersVarargs(value: String*): Self = StObject.set(x, "helpers", js.Array(value*))
    
    inline def setJsLoader(value: require | `import`): Self = StObject.set(x, "jsLoader", value.asInstanceOf[js.Any])
    
    inline def setJsLoaderUndefined: Self = StObject.set(x, "jsLoader", js.undefined)
    
    inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value*))
    
    inline def setSpec_dir(value: String): Self = StObject.set(x, "spec_dir", value.asInstanceOf[js.Any])
    
    inline def setSpec_dirUndefined: Self = StObject.set(x, "spec_dir", js.undefined)
    
    inline def setSpec_files(value: js.Array[String]): Self = StObject.set(x, "spec_files", value.asInstanceOf[js.Any])
    
    inline def setSpec_filesUndefined: Self = StObject.set(x, "spec_files", js.undefined)
    
    inline def setSpec_filesVarargs(value: String*): Self = StObject.set(x, "spec_files", js.Array(value*))
    
    inline def setStopOnSpecFailure(value: Boolean): Self = StObject.set(x, "stopOnSpecFailure", value.asInstanceOf[js.Any])
    
    inline def setStopOnSpecFailureUndefined: Self = StObject.set(x, "stopOnSpecFailure", js.undefined)
    
    inline def setStopSpecOnExpectationFailure(value: Boolean): Self = StObject.set(x, "stopSpecOnExpectationFailure", value.asInstanceOf[js.Any])
    
    inline def setStopSpecOnExpectationFailureUndefined: Self = StObject.set(x, "stopSpecOnExpectationFailure", js.undefined)
  }
}
