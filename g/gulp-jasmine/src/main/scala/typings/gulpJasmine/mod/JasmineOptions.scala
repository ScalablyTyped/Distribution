package typings.gulpJasmine.mod

import typings.jasmine.jasmine.CustomReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineOptions extends js.Object {
  
  /**
    * Passes the config to Jasmine's loadConfig method.
    */
  var config: js.UndefOr[js.Object] = js.native
  
  /**
    * Stops the stream on failed tests.
    * @default true
    */
  var errorOnFail: js.UndefOr[Boolean] = js.native
  
  /**
    * Include stack traces in failures in default reporter.
    * @default false
    */
  var includeStackTrace: js.UndefOr[Boolean] = js.native
  
  /**
    * Reporter(s) to use.
    */
  var reporter: js.UndefOr[CustomReporter | js.Array[CustomReporter]] = js.native
  
  /**
    * Time to wait in milliseconds before a test automatically fails.
    * @default 5000
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    *  Display spec names in default reporter.
    */
  var verbose: js.UndefOr[Boolean] = js.native
}
object JasmineOptions {
  
  @scala.inline
  def apply(): JasmineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineOptions]
  }
  
  @scala.inline
  implicit class JasmineOptionsOps[Self <: JasmineOptions] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: js.Object): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setErrorOnFail(value: Boolean): Self = this.set("errorOnFail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorOnFail: Self = this.set("errorOnFail", js.undefined)
    
    @scala.inline
    def setIncludeStackTrace(value: Boolean): Self = this.set("includeStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeStackTrace: Self = this.set("includeStackTrace", js.undefined)
    
    @scala.inline
    def setReporterVarargs(value: CustomReporter*): Self = this.set("reporter", js.Array(value :_*))
    
    @scala.inline
    def setReporter(value: CustomReporter | js.Array[CustomReporter]): Self = this.set("reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
