package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MochaSetupOptions extends StObject {
  
  // bail on the first test failure
  var bail: js.UndefOr[Boolean] = js.native
  
  //array of accepted globals
  var globals: js.UndefOr[js.Array[_]] = js.native
  
  // grep string or regexp to filter tests with
  var grep: js.UndefOr[js.Any] = js.native
  
  // ignore global leaks
  var ignoreLeaks: js.UndefOr[Boolean] = js.native
  
  // reporter instance (function or string), defaults to `mocha.reporters.Spec`
  var reporter: js.UndefOr[js.Any] = js.native
  
  //milliseconds to wait before considering a test slow
  var slow: js.UndefOr[Double] = js.native
  
  // timeout in milliseconds
  var timeout: js.UndefOr[Double] = js.native
  
  // ui name "bdd", "tdd", "exports" etc
  var ui: js.UndefOr[String] = js.native
}
object MochaSetupOptions {
  
  @scala.inline
  def apply(): MochaSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaSetupOptions]
  }
  
  @scala.inline
  implicit class MochaSetupOptionsMutableBuilder[Self <: MochaSetupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    @scala.inline
    def setGlobals(value: js.Array[_]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    @scala.inline
    def setGlobalsVarargs(value: js.Any*): Self = StObject.set(x, "globals", js.Array(value :_*))
    
    @scala.inline
    def setGrep(value: js.Any): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
    
    @scala.inline
    def setIgnoreLeaks(value: Boolean): Self = StObject.set(x, "ignoreLeaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreLeaksUndefined: Self = StObject.set(x, "ignoreLeaks", js.undefined)
    
    @scala.inline
    def setReporter(value: js.Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    @scala.inline
    def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
