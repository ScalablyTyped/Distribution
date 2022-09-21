package typings.licenseCheckerWebpackPlugin

import typings.licenseCheckerWebpackPlugin.mod.OutputWriter
import typings.licenseCheckerWebpackPlugin.mod.OutputWriterArgs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Dependency> */
  trait PartialDependency extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var licenseName: js.UndefOr[String] = js.undefined
    
    var licenseText: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var repository: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object PartialDependency {
    
    inline def apply(): PartialDependency = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDependency]
    }
    
    extension [Self <: PartialDependency](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setLicenseName(value: String): Self = StObject.set(x, "licenseName", value.asInstanceOf[js.Any])
      
      inline def setLicenseNameUndefined: Self = StObject.set(x, "licenseName", js.undefined)
      
      inline def setLicenseText(value: String): Self = StObject.set(x, "licenseText", value.asInstanceOf[js.Any])
      
      inline def setLicenseTextUndefined: Self = StObject.set(x, "licenseText", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Options> */
  trait PartialOptions extends StObject {
    
    var allow: js.UndefOr[String] = js.undefined
    
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[js.RegExp] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var outputFilename: js.UndefOr[String] = js.undefined
    
    var outputWriter: js.UndefOr[String | OutputWriter] = js.undefined
    
    var `override`: js.UndefOr[Record[String, PartialDependency]] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      inline def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      inline def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setOutputFilename(value: String): Self = StObject.set(x, "outputFilename", value.asInstanceOf[js.Any])
      
      inline def setOutputFilenameUndefined: Self = StObject.set(x, "outputFilename", js.undefined)
      
      inline def setOutputWriter(value: String | OutputWriter): Self = StObject.set(x, "outputWriter", value.asInstanceOf[js.Any])
      
      inline def setOutputWriterFunction1(value: /* args */ OutputWriterArgs => String): Self = StObject.set(x, "outputWriter", js.Any.fromFunction1(value))
      
      inline def setOutputWriterUndefined: Self = StObject.set(x, "outputWriter", js.undefined)
      
      inline def setOverride(value: Record[String, PartialDependency]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
}
