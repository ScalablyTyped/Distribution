package typings.karmaCoverage

import org.scalablytyped.runtime.StringDictionary
import typings.istanbul.mod.Store
import typings.karmaCoverage.mod.KarmaCoverageReporter
import typings.karmaCoverage.mod.Reporter
import typings.karmaCoverage.mod.ReporterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined karma-coverage.karma.KarmaCoverageReporter & {  reporters :std.Array<karma-coverage.karma.KarmaCoverageReporter> | undefined} */
  trait KarmaCoverageReporterrepo
    extends StObject
       with /* moreSettings */ StringDictionary[js.Any] {
    
    /** This will be used to configure minimum threshold enforcement for coverage results */
    var check: js.UndefOr[js.Any] = js.undefined
    
    /** This will be used to output coverage reports. When you set a relative path, the directory is resolved against the basePath. */
    var dir: js.UndefOr[String] = js.undefined
    
    /** If you use one of these reporters, `cobertura`, `lcovonly`, `teamcity`, `text` or `text-summary`, you may set the file option to specify the output file */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * You can opt to include all sources files, as indicated by the coverage preprocessor,
      * in your code coverage data, even if there are no tests covering them
      */
    var includeAllSources: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Karma-coverage can infers the instrumenter regarding of the file extension.
      * It is possible to override this behavior and point out an instrumenter
      * for the files matching a specific pattern.
      */
    var instrumenter: js.UndefOr[js.Any] = js.undefined
    
    /** You can use multiple reporters, by providing array of options */
    var reporters: js.UndefOr[js.Array[Reporter]] & js.UndefOr[js.Array[KarmaCoverageReporter]]
    
    /** You can opt to specify a source store allowing for external coverage collectors access to the instrumented code. */
    var sourceStore: js.UndefOr[Store] = js.undefined
    
    /** This will be used in complement of the coverageReporter.dir option to generate the full output directory path */
    var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.undefined
    
    /** Specify a reporter type */
    var `type`: js.UndefOr[ReporterType] = js.undefined
    
    /**
      * If set to true, then CoffeeScript files instrumented with Ibrik will use
      * the .js extension for the transpiled source (without this option,
      * the JavaScript files will keep the original .coffee extension)
      */
    var useJSExtensionForCoffeeScript: js.UndefOr[Boolean] = js.undefined
    
    /** This will be used to set the coverage threshold colors */
    var watermarks: js.UndefOr[js.Any] = js.undefined
  }
  object KarmaCoverageReporterrepo {
    
    @scala.inline
    def apply(reporters: js.UndefOr[js.Array[Reporter]] & js.UndefOr[js.Array[KarmaCoverageReporter]]): KarmaCoverageReporterrepo = {
      val __obj = js.Dynamic.literal(reporters = reporters.asInstanceOf[js.Any])
      __obj.asInstanceOf[KarmaCoverageReporterrepo]
    }
    
    @scala.inline
    implicit class KarmaCoverageReporterrepoMutableBuilder[Self <: KarmaCoverageReporterrepo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: js.Any): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setIncludeAllSources(value: Boolean): Self = StObject.set(x, "includeAllSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAllSourcesUndefined: Self = StObject.set(x, "includeAllSources", js.undefined)
      
      @scala.inline
      def setInstrumenter(value: js.Any): Self = StObject.set(x, "instrumenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstrumenterUndefined: Self = StObject.set(x, "instrumenter", js.undefined)
      
      @scala.inline
      def setReporters(value: js.UndefOr[js.Array[Reporter]] & js.UndefOr[js.Array[KarmaCoverageReporter]]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStore(value: Store): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStoreUndefined: Self = StObject.set(x, "sourceStore", js.undefined)
      
      @scala.inline
      def setSubdir(value: String | (js.Function1[/* browser */ String, String])): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirFunction1(value: /* browser */ String => String): Self = StObject.set(x, "subdir", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubdirUndefined: Self = StObject.set(x, "subdir", js.undefined)
      
      @scala.inline
      def setType(value: ReporterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUseJSExtensionForCoffeeScript(value: Boolean): Self = StObject.set(x, "useJSExtensionForCoffeeScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseJSExtensionForCoffeeScriptUndefined: Self = StObject.set(x, "useJSExtensionForCoffeeScript", js.undefined)
      
      @scala.inline
      def setWatermarks(value: js.Any): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarksUndefined: Self = StObject.set(x, "watermarks", js.undefined)
    }
  }
}
