package typings.licenseCheckerWebpackPlugin

import typings.licenseCheckerWebpackPlugin.mod.OutputWriter
import typings.licenseCheckerWebpackPlugin.mod.OutputWriterArgs
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Dependency> */
  @js.native
  trait PartialDependency extends StObject {
    
    var licenseName: js.UndefOr[String] = js.native
    
    var licenseText: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var repository: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object PartialDependency {
    
    @scala.inline
    def apply(): PartialDependency = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDependency]
    }
    
    @scala.inline
    implicit class PartialDependencyMutableBuilder[Self <: PartialDependency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicenseName(value: String): Self = StObject.set(x, "licenseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseNameUndefined: Self = StObject.set(x, "licenseName", js.undefined)
      
      @scala.inline
      def setLicenseText(value: String): Self = StObject.set(x, "licenseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseTextUndefined: Self = StObject.set(x, "licenseText", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var allow: js.UndefOr[String] = js.native
    
    var emitError: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[RegExp] = js.native
    
    var ignore: js.UndefOr[js.Array[String]] = js.native
    
    var outputFilename: js.UndefOr[String] = js.native
    
    var outputWriter: js.UndefOr[String | OutputWriter] = js.native
    
    var `override`: js.UndefOr[Record[String, PartialDependency]] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      @scala.inline
      def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      @scala.inline
      def setFilter(value: RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setOutputFilename(value: String): Self = StObject.set(x, "outputFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFilenameUndefined: Self = StObject.set(x, "outputFilename", js.undefined)
      
      @scala.inline
      def setOutputWriter(value: String | OutputWriter): Self = StObject.set(x, "outputWriter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputWriterFunction1(value: /* args */ OutputWriterArgs => String): Self = StObject.set(x, "outputWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutputWriterUndefined: Self = StObject.set(x, "outputWriter", js.undefined)
      
      @scala.inline
      def setOverride(value: Record[String, PartialDependency]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
}
