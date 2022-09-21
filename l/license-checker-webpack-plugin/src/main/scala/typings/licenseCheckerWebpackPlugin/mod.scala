package typings.licenseCheckerWebpackPlugin

import typings.licenseCheckerWebpackPlugin.anon.PartialDependency
import typings.licenseCheckerWebpackPlugin.anon.PartialOptions
import typings.std.Record
import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("license-checker-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LicenseCheckerWebpackPlugin {
    def this(options: PartialOptions) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  trait Dependency extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var licenseName: String
    
    var licenseText: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var repository: js.UndefOr[String] = js.undefined
    
    var version: String
  }
  object Dependency {
    
    inline def apply(licenseName: String, name: String, version: String): Dependency = {
      val __obj = js.Dynamic.literal(licenseName = licenseName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependency]
    }
    
    extension [Self <: Dependency](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setLicenseName(value: String): Self = StObject.set(x, "licenseName", value.asInstanceOf[js.Any])
      
      inline def setLicenseText(value: String): Self = StObject.set(x, "licenseText", value.asInstanceOf[js.Any])
      
      inline def setLicenseTextUndefined: Self = StObject.set(x, "licenseText", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait LicenseCheckerWebpackPlugin
    extends StObject
       with WebpackPluginInstance
  object LicenseCheckerWebpackPlugin {
    
    inline def apply(apply: Compiler => Unit): LicenseCheckerWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[LicenseCheckerWebpackPlugin]
    }
  }
  
  trait Options extends StObject {
    
    /**
      * SPDX expression with allowed licenses.
      *
      * @default "(Apache-2.0 OR BSD-2-Clause OR BSD-3-Clause OR MIT)"
      */
    var allow: String
    
    /**
      * Whether to emit errors instead of warnings.
      *
      * @default false
      */
    var emitError: Boolean
    
    /**
      * Regular expression that matches the file paths of dependencies to check.
      */
    var filter: js.RegExp
    
    /**
      * Array of dependencies to ignore, in the format `["<dependency name>@<version range>"]`.
      * For example, `["assignment@^2.0.0"]`.
      *
      * @default []
      */
    var ignore: js.Array[String]
    
    /**
      * Name of the third-party notices file with all licensing information.
      *
      * @default "ThirdPartyNotices.txt"
      */
    var outputFilename: String
    
    /**
      * Path to a `.ejs` template, or function that will generate the contents
      * of the third-party notices file.
      */
    var outputWriter: String | OutputWriter
    
    /**
      * Object of dependencies to override, in the format `{"<dependency name>@<version range>": { ... }}`.
      * For example, `{"assignment@^2.0.0": { licenseName: "MIT" }}`.
      *
      * @default {}
      */
    var `override`: Record[String, PartialDependency]
  }
  object Options {
    
    inline def apply(
      allow: String,
      emitError: Boolean,
      filter: js.RegExp,
      ignore: js.Array[String],
      outputFilename: String,
      outputWriter: String | OutputWriter,
      `override`: Record[String, PartialDependency]
    ): Options = {
      val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], emitError = emitError.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], outputFilename = outputFilename.asInstanceOf[js.Any], outputWriter = outputWriter.asInstanceOf[js.Any])
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setOutputFilename(value: String): Self = StObject.set(x, "outputFilename", value.asInstanceOf[js.Any])
      
      inline def setOutputWriter(value: String | OutputWriter): Self = StObject.set(x, "outputWriter", value.asInstanceOf[js.Any])
      
      inline def setOutputWriterFunction1(value: /* args */ OutputWriterArgs => String): Self = StObject.set(x, "outputWriter", js.Any.fromFunction1(value))
      
      inline def setOverride(value: Record[String, PartialDependency]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    }
  }
  
  type OutputWriter = js.Function1[/* args */ OutputWriterArgs, String]
  
  trait OutputWriterArgs extends StObject {
    
    var dependencies: js.Array[Dependency]
  }
  object OutputWriterArgs {
    
    inline def apply(dependencies: js.Array[Dependency]): OutputWriterArgs = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputWriterArgs]
    }
    
    extension [Self <: OutputWriterArgs](x: Self) {
      
      inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    }
  }
}
