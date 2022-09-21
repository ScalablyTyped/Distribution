package typings.karmaCoverage

import org.scalablytyped.runtime.StringDictionary
import typings.istanbul.mod.Store
import typings.karmaCoverage.anon.KarmaCoverageReporterrepo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait CheckTresholds extends StObject {
    
    var each: js.UndefOr[Tresholds] = js.undefined
    
    var global: js.UndefOr[Tresholds] = js.undefined
  }
  object CheckTresholds {
    
    inline def apply(): CheckTresholds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckTresholds]
    }
    
    extension [Self <: CheckTresholds](x: Self) {
      
      inline def setEach(value: Tresholds): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setGlobal(value: Tresholds): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    }
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * {@link https://github.com/karma-runner/karma-coverage/blob/v1.1.2/docs/configuration.md }
      */
    var coverageReporter: js.UndefOr[KarmaCoverageReporterrepo] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setCoverageReporter(value: KarmaCoverageReporterrepo): Self = StObject.set(x, "coverageReporter", value.asInstanceOf[js.Any])
      
      inline def setCoverageReporterUndefined: Self = StObject.set(x, "coverageReporter", js.undefined)
    }
  }
  
  trait KarmaCoverageReporter
    extends StObject
       with /* moreSettings */ StringDictionary[Any] {
    
    /** This will be used to configure minimum threshold enforcement for coverage results */
    var check: js.UndefOr[CheckTresholds] = js.undefined
    
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
    var instrumenter: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var instrumenterOptions: js.UndefOr[Record[String, Record[String, Any]]] = js.undefined
    
    var instrumenters: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** You can use multiple reporters, by providing array of options */
    var reporters: js.UndefOr[js.Array[Reporter]] = js.undefined
    
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
    var watermarks: js.UndefOr[Watermarks] = js.undefined
  }
  object KarmaCoverageReporter {
    
    inline def apply(): KarmaCoverageReporter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KarmaCoverageReporter]
    }
    
    extension [Self <: KarmaCoverageReporter](x: Self) {
      
      inline def setCheck(value: CheckTresholds): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setIncludeAllSources(value: Boolean): Self = StObject.set(x, "includeAllSources", value.asInstanceOf[js.Any])
      
      inline def setIncludeAllSourcesUndefined: Self = StObject.set(x, "includeAllSources", js.undefined)
      
      inline def setInstrumenter(value: StringDictionary[String]): Self = StObject.set(x, "instrumenter", value.asInstanceOf[js.Any])
      
      inline def setInstrumenterOptions(value: Record[String, Record[String, Any]]): Self = StObject.set(x, "instrumenterOptions", value.asInstanceOf[js.Any])
      
      inline def setInstrumenterOptionsUndefined: Self = StObject.set(x, "instrumenterOptions", js.undefined)
      
      inline def setInstrumenterUndefined: Self = StObject.set(x, "instrumenter", js.undefined)
      
      inline def setInstrumenters(value: Record[String, Any]): Self = StObject.set(x, "instrumenters", value.asInstanceOf[js.Any])
      
      inline def setInstrumentersUndefined: Self = StObject.set(x, "instrumenters", js.undefined)
      
      inline def setReporters(value: js.Array[Reporter]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: Reporter*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setSourceStore(value: Store): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      inline def setSourceStoreUndefined: Self = StObject.set(x, "sourceStore", js.undefined)
      
      inline def setSubdir(value: String | (js.Function1[/* browser */ String, String])): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      inline def setSubdirFunction1(value: /* browser */ String => String): Self = StObject.set(x, "subdir", js.Any.fromFunction1(value))
      
      inline def setSubdirUndefined: Self = StObject.set(x, "subdir", js.undefined)
      
      inline def setType(value: ReporterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseJSExtensionForCoffeeScript(value: Boolean): Self = StObject.set(x, "useJSExtensionForCoffeeScript", value.asInstanceOf[js.Any])
      
      inline def setUseJSExtensionForCoffeeScriptUndefined: Self = StObject.set(x, "useJSExtensionForCoffeeScript", js.undefined)
      
      inline def setWatermarks(value: Watermarks): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
      
      inline def setWatermarksUndefined: Self = StObject.set(x, "watermarks", js.undefined)
    }
  }
  
  trait Reporter extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.undefined
    
    var `type`: ReporterType
  }
  object Reporter {
    
    inline def apply(`type`: ReporterType): Reporter = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reporter]
    }
    
    extension [Self <: Reporter](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setSubdir(value: String | (js.Function1[/* browser */ String, String])): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      inline def setSubdirFunction1(value: /* browser */ String => String): Self = StObject.set(x, "subdir", js.Any.fromFunction1(value))
      
      inline def setSubdirUndefined: Self = StObject.set(x, "subdir", js.undefined)
      
      inline def setType(value: ReporterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** Reporter type */
  /* Rewritten from type alias, can be one of: 
    - typings.karmaCoverage.karmaCoverageStrings.html
    - typings.karmaCoverage.karmaCoverageStrings.lcov
    - typings.karmaCoverage.karmaCoverageStrings.lcovonly
    - typings.karmaCoverage.karmaCoverageStrings.text
    - typings.karmaCoverage.karmaCoverageStrings.`text-summary`
    - typings.karmaCoverage.karmaCoverageStrings.cobertura
    - typings.karmaCoverage.karmaCoverageStrings.teamcity
    - typings.karmaCoverage.karmaCoverageStrings.json
    - typings.karmaCoverage.karmaCoverageStrings.`json-summary`
    - typings.karmaCoverage.karmaCoverageStrings.`in-memory`
    - typings.karmaCoverage.karmaCoverageStrings.none
  */
  trait ReporterType extends StObject
  object ReporterType {
    
    inline def cobertura: typings.karmaCoverage.karmaCoverageStrings.cobertura = "cobertura".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.cobertura]
    
    inline def html: typings.karmaCoverage.karmaCoverageStrings.html = "html".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.html]
    
    inline def `in-memory`: typings.karmaCoverage.karmaCoverageStrings.`in-memory` = "in-memory".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.`in-memory`]
    
    inline def json: typings.karmaCoverage.karmaCoverageStrings.json = "json".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.json]
    
    inline def `json-summary`: typings.karmaCoverage.karmaCoverageStrings.`json-summary` = "json-summary".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.`json-summary`]
    
    inline def lcov: typings.karmaCoverage.karmaCoverageStrings.lcov = "lcov".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.lcov]
    
    inline def lcovonly: typings.karmaCoverage.karmaCoverageStrings.lcovonly = "lcovonly".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.lcovonly]
    
    inline def none: typings.karmaCoverage.karmaCoverageStrings.none = "none".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.none]
    
    inline def teamcity: typings.karmaCoverage.karmaCoverageStrings.teamcity = "teamcity".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.teamcity]
    
    inline def text: typings.karmaCoverage.karmaCoverageStrings.text = "text".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.text]
    
    inline def `text-summary`: typings.karmaCoverage.karmaCoverageStrings.`text-summary` = "text-summary".asInstanceOf[typings.karmaCoverage.karmaCoverageStrings.`text-summary`]
  }
  
  trait Tresholds extends StObject {
    
    var branches: js.UndefOr[Double] = js.undefined
    
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
    
    var functions: js.UndefOr[Double] = js.undefined
    
    var lines: js.UndefOr[Double] = js.undefined
    
    var overrides: js.UndefOr[Record[String, Tresholds]] = js.undefined
    
    var statements: js.UndefOr[Double] = js.undefined
  }
  object Tresholds {
    
    inline def apply(): Tresholds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tresholds]
    }
    
    extension [Self <: Tresholds](x: Self) {
      
      inline def setBranches(value: Double): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
      
      inline def setFunctions(value: Double): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setOverrides(value: Record[String, Tresholds]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStatements(value: Double): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    }
  }
  
  trait Watermarks extends StObject {
    
    var branches: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var functions: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var lines: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var statements: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Watermarks {
    
    inline def apply(): Watermarks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Watermarks]
    }
    
    extension [Self <: Watermarks](x: Self) {
      
      inline def setBranches(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setFunctions(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setLines(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setStatements(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    }
  }
}
