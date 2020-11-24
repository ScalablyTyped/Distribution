package typings.grumblerScripts.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackConfigOptions extends js.Object {
  
  var alias: js.UndefOr[StringDictionary[String]] = js.native
  
  var analyze: js.UndefOr[Boolean] = js.native
  
  var babelConfig: js.UndefOr[String] = js.native
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var dynamic: js.UndefOr[Boolean] = js.native
  
  var entry: js.UndefOr[String | js.Array[String]] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var libraryTarget: js.UndefOr[String] = js.native
  
  var minify: js.UndefOr[Boolean] = js.native
  
  var modulename: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[js.Object] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var sourcemaps: js.UndefOr[Boolean] = js.native
  
  var test: js.UndefOr[Boolean] = js.native
  
  var vars: js.UndefOr[js.Object] = js.native
  
  var web: js.UndefOr[Boolean] = js.native
}
object WebpackConfigOptions {
  
  @scala.inline
  def apply(): WebpackConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackConfigOptions]
  }
  
  @scala.inline
  implicit class WebpackConfigOptionsOps[Self <: WebpackConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: StringDictionary[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAnalyze(value: Boolean): Self = this.set("analyze", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyze: Self = this.set("analyze", js.undefined)
    
    @scala.inline
    def setBabelConfig(value: String): Self = this.set("babelConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelConfig: Self = this.set("babelConfig", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: String*): Self = this.set("entry", js.Array(value :_*))
    
    @scala.inline
    def setEntry(value: String | js.Array[String]): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setLibraryTarget(value: String): Self = this.set("libraryTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryTarget: Self = this.set("libraryTarget", js.undefined)
    
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    
    @scala.inline
    def setModulename(value: String): Self = this.set("modulename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulename: Self = this.set("modulename", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSourcemaps(value: Boolean): Self = this.set("sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcemaps: Self = this.set("sourcemaps", js.undefined)
    
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setVars(value: js.Object): Self = this.set("vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
    
    @scala.inline
    def setWeb(value: Boolean): Self = this.set("web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
  }
}
