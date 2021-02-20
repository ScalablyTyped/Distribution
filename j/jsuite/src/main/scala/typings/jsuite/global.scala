package typings.jsuite

import typings.jquery.JQueryXHR
import typings.suitescript.nlobjRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jSuite {
    
    @JSGlobal("jSuite.asyncLookupField")
    @js.native
    def asyncLookupField(config: js.Any, callback: js.Any): Unit = js.native
    
    @JSGlobal("jSuite.asyncSubmitField")
    @js.native
    def asyncSubmitField(config: js.Any): JQueryXHR = js.native
    
    @JSGlobal("jSuite.audit")
    @js.native
    def audit(title: String, message: String): Unit = js.native
    
    @JSGlobal("jSuite.clearSublist")
    @js.native
    def clearSublist(transaction: nlobjRecord, listType: String): Unit = js.native
    
    @JSGlobal("jSuite.debug")
    @js.native
    def debug(title: String, message: String): Unit = js.native
    
    @JSGlobal("jSuite.emergency")
    @js.native
    def emergency(title: String, message: String): Unit = js.native
    
    @JSGlobal("jSuite.error")
    @js.native
    def error(title: String, message: String): Unit = js.native
    
    @JSGlobal("jSuite.getCompanyPreference")
    @js.native
    def getCompanyPreference(paramName: String): js.Any = js.native
    
    @JSGlobal("jSuite.getDeploymentId")
    @js.native
    def getDeploymentId(): js.Any = js.native
    
    @JSGlobal("jSuite.getRoleCenter")
    @js.native
    def getRoleCenter(): js.Any = js.native
    
    @JSGlobal("jSuite.getScriptId")
    @js.native
    def getScriptId(): js.Any = js.native
    
    @JSGlobal("jSuite.getScriptParameter")
    @js.native
    def getScriptParameter(paramName: String): js.Any = js.native
    
    @JSGlobal("jSuite.getUser")
    @js.native
    def getUser(): js.Any = js.native
    
    @JSGlobal("jSuite.getVersion")
    @js.native
    def getVersion(): String = js.native
    
    @JSGlobal("jSuite.isNumber")
    @js.native
    def isNumber(n: js.Any): Boolean = js.native
    
    @JSGlobal("jSuite.isProduction")
    @js.native
    def isProduction(): js.Any = js.native
    
    @JSGlobal("jSuite.lookupField")
    @js.native
    def lookupField(dataIn: js.Any): String = js.native
    
    @JSGlobal("jSuite.roundNum")
    @js.native
    def roundNum(num: Double, length: Double): Double = js.native
    
    @JSGlobal("jSuite.runSearch")
    @js.native
    def runSearch(): js.Any = js.native
    @JSGlobal("jSuite.runSearch")
    @js.native
    def runSearch(config: Iconfig): js.Any = js.native
    
    @JSGlobal("jSuite.setLogging")
    @js.native
    def setLogging(toggle: Boolean): Unit = js.native
    
    @JSGlobal("jSuite.submitField")
    @js.native
    def submitField(dataIn: js.Any): js.Any = js.native
  }
}
