package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomReporter extends StObject {
  
  var jasmineDone: js.UndefOr[js.Function1[/* runDetails */ RunDetails, Unit]] = js.undefined
  
  var jasmineStarted: js.UndefOr[js.Function1[/* suiteInfo */ SuiteInfo, Unit]] = js.undefined
  
  var specDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  
  var specStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  
  var suiteDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  
  var suiteStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
}
object CustomReporter {
  
  inline def apply(): CustomReporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomReporter]
  }
  
  extension [Self <: CustomReporter](x: Self) {
    
    inline def setJasmineDone(value: /* runDetails */ RunDetails => Unit): Self = StObject.set(x, "jasmineDone", js.Any.fromFunction1(value))
    
    inline def setJasmineDoneUndefined: Self = StObject.set(x, "jasmineDone", js.undefined)
    
    inline def setJasmineStarted(value: /* suiteInfo */ SuiteInfo => Unit): Self = StObject.set(x, "jasmineStarted", js.Any.fromFunction1(value))
    
    inline def setJasmineStartedUndefined: Self = StObject.set(x, "jasmineStarted", js.undefined)
    
    inline def setSpecDone(value: /* result */ CustomReporterResult => Unit): Self = StObject.set(x, "specDone", js.Any.fromFunction1(value))
    
    inline def setSpecDoneUndefined: Self = StObject.set(x, "specDone", js.undefined)
    
    inline def setSpecStarted(value: /* result */ CustomReporterResult => Unit): Self = StObject.set(x, "specStarted", js.Any.fromFunction1(value))
    
    inline def setSpecStartedUndefined: Self = StObject.set(x, "specStarted", js.undefined)
    
    inline def setSuiteDone(value: /* result */ CustomReporterResult => Unit): Self = StObject.set(x, "suiteDone", js.Any.fromFunction1(value))
    
    inline def setSuiteDoneUndefined: Self = StObject.set(x, "suiteDone", js.undefined)
    
    inline def setSuiteStarted(value: /* result */ CustomReporterResult => Unit): Self = StObject.set(x, "suiteStarted", js.Any.fromFunction1(value))
    
    inline def setSuiteStartedUndefined: Self = StObject.set(x, "suiteStarted", js.undefined)
  }
}
