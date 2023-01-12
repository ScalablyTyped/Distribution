package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MochaSetupOptions extends StObject {
  
  // bail on the first test failure
  var bail: js.UndefOr[Boolean] = js.undefined
  
  //array of accepted globals
  var globals: js.UndefOr[js.Array[Any]] = js.undefined
  
  // grep string or regexp to filter tests with
  var grep: js.UndefOr[Any] = js.undefined
  
  // ignore global leaks
  var ignoreLeaks: js.UndefOr[Boolean] = js.undefined
  
  // reporter instance (function or string), defaults to `mocha.reporters.Spec`
  var reporter: js.UndefOr[Any] = js.undefined
  
  //milliseconds to wait before considering a test slow
  var slow: js.UndefOr[Double] = js.undefined
  
  // timeout in milliseconds
  var timeout: js.UndefOr[Double] = js.undefined
  
  // ui name "bdd", "tdd", "exports" etc
  var ui: js.UndefOr[String] = js.undefined
}
object MochaSetupOptions {
  
  inline def apply(): MochaSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaSetupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MochaSetupOptions] (val x: Self) extends AnyVal {
    
    inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    inline def setGlobals(value: js.Array[Any]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setGlobalsVarargs(value: Any*): Self = StObject.set(x, "globals", js.Array(value*))
    
    inline def setGrep(value: Any): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
    
    inline def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
    
    inline def setIgnoreLeaks(value: Boolean): Self = StObject.set(x, "ignoreLeaks", value.asInstanceOf[js.Any])
    
    inline def setIgnoreLeaksUndefined: Self = StObject.set(x, "ignoreLeaks", js.undefined)
    
    inline def setReporter(value: Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    
    inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
