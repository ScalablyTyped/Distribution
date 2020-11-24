package typings.karmaCoverage.anon

import org.scalablytyped.runtime.StringDictionary
import typings.istanbul.mod.Store
import typings.karmaCoverage.mod.KarmaCoverageReporter
import typings.karmaCoverage.mod.Reporter
import typings.karmaCoverage.mod.ReporterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined karma-coverage.karma.KarmaCoverageReporter & {  reporters :std.Array<karma-coverage.karma.KarmaCoverageReporter> | undefined} */
@js.native
trait KarmaCoverageReporterrepo
  extends /* moreSettings */ StringDictionary[js.Any] {
  
  /** This will be used to configure minimum threshold enforcement for coverage results */
  var check: js.UndefOr[js.Any] = js.native
  
  /** This will be used to output coverage reports. When you set a relative path, the directory is resolved against the basePath. */
  var dir: js.UndefOr[String] = js.native
  
  /** If you use one of these reporters, `cobertura`, `lcovonly`, `teamcity`, `text` or `text-summary`, you may set the file option to specify the output file */
  var file: js.UndefOr[String] = js.native
  
  /**
    * You can opt to include all sources files, as indicated by the coverage preprocessor,
    * in your code coverage data, even if there are no tests covering them
    */
  var includeAllSources: js.UndefOr[Boolean] = js.native
  
  /**
    * Karma-coverage can infers the instrumenter regarding of the file extension.
    * It is possible to override this behavior and point out an instrumenter
    * for the files matching a specific pattern.
    */
  var instrumenter: js.UndefOr[js.Any] = js.native
  
  /** You can use multiple reporters, by providing array of options */
  var reporters: js.UndefOr[js.Array[Reporter]] with js.UndefOr[js.Array[KarmaCoverageReporter]] = js.native
  
  /** You can opt to specify a source store allowing for external coverage collectors access to the instrumented code. */
  var sourceStore: js.UndefOr[Store] = js.native
  
  /** This will be used in complement of the coverageReporter.dir option to generate the full output directory path */
  var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.native
  
  /** Specify a reporter type */
  var `type`: js.UndefOr[ReporterType] = js.native
  
  /**
    * If set to true, then CoffeeScript files instrumented with Ibrik will use
    * the .js extension for the transpiled source (without this option,
    * the JavaScript files will keep the original .coffee extension)
    */
  var useJSExtensionForCoffeeScript: js.UndefOr[Boolean] = js.native
  
  /** This will be used to set the coverage threshold colors */
  var watermarks: js.UndefOr[js.Any] = js.native
}
object KarmaCoverageReporterrepo {
  
  @scala.inline
  def apply(reporters: js.UndefOr[js.Array[Reporter]] with js.UndefOr[js.Array[KarmaCoverageReporter]]): KarmaCoverageReporterrepo = {
    val __obj = js.Dynamic.literal(reporters = reporters.asInstanceOf[js.Any])
    __obj.asInstanceOf[KarmaCoverageReporterrepo]
  }
  
  @scala.inline
  implicit class KarmaCoverageReporterrepoOps[Self <: KarmaCoverageReporterrepo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReporters(value: js.UndefOr[js.Array[Reporter]] with js.UndefOr[js.Array[KarmaCoverageReporter]]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck(value: js.Any): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setIncludeAllSources(value: Boolean): Self = this.set("includeAllSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAllSources: Self = this.set("includeAllSources", js.undefined)
    
    @scala.inline
    def setInstrumenter(value: js.Any): Self = this.set("instrumenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstrumenter: Self = this.set("instrumenter", js.undefined)
    
    @scala.inline
    def setSourceStore(value: Store): Self = this.set("sourceStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceStore: Self = this.set("sourceStore", js.undefined)
    
    @scala.inline
    def setSubdirFunction1(value: /* browser */ String => String): Self = this.set("subdir", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubdir(value: String | (js.Function1[/* browser */ String, String])): Self = this.set("subdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdir: Self = this.set("subdir", js.undefined)
    
    @scala.inline
    def setType(value: ReporterType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseJSExtensionForCoffeeScript(value: Boolean): Self = this.set("useJSExtensionForCoffeeScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseJSExtensionForCoffeeScript: Self = this.set("useJSExtensionForCoffeeScript", js.undefined)
    
    @scala.inline
    def setWatermarks(value: js.Any): Self = this.set("watermarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatermarks: Self = this.set("watermarks", js.undefined)
  }
}
