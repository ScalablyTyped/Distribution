package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomReporter extends js.Object {
  
  var jasmineDone: js.UndefOr[js.Function1[/* runDetails */ RunDetails, Unit]] = js.native
  
  var jasmineStarted: js.UndefOr[js.Function1[/* suiteInfo */ SuiteInfo, Unit]] = js.native
  
  var specDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.native
  
  var specStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.native
  
  var suiteDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.native
  
  var suiteStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.native
}
object CustomReporter {
  
  @scala.inline
  def apply(): CustomReporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomReporter]
  }
  
  @scala.inline
  implicit class CustomReporterOps[Self <: CustomReporter] (val x: Self) extends AnyVal {
    
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
    def setJasmineDone(value: /* runDetails */ RunDetails => Unit): Self = this.set("jasmineDone", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteJasmineDone: Self = this.set("jasmineDone", js.undefined)
    
    @scala.inline
    def setJasmineStarted(value: /* suiteInfo */ SuiteInfo => Unit): Self = this.set("jasmineStarted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteJasmineStarted: Self = this.set("jasmineStarted", js.undefined)
    
    @scala.inline
    def setSpecDone(value: /* result */ CustomReporterResult => Unit): Self = this.set("specDone", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSpecDone: Self = this.set("specDone", js.undefined)
    
    @scala.inline
    def setSpecStarted(value: /* result */ CustomReporterResult => Unit): Self = this.set("specStarted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSpecStarted: Self = this.set("specStarted", js.undefined)
    
    @scala.inline
    def setSuiteDone(value: /* result */ CustomReporterResult => Unit): Self = this.set("suiteDone", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuiteDone: Self = this.set("suiteDone", js.undefined)
    
    @scala.inline
    def setSuiteStarted(value: /* result */ CustomReporterResult => Unit): Self = this.set("suiteStarted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuiteStarted: Self = this.set("suiteStarted", js.undefined)
  }
}
