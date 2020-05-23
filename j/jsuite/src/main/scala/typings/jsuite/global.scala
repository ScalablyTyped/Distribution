package typings.jsuite

import typings.jquery.JQueryXHR
import typings.suitescript.nlobjRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object jSuite extends js.Object {
    def asyncLookupField(config: js.Any, callback: js.Any): Unit = js.native
    def asyncSubmitField(config: js.Any): JQueryXHR = js.native
    def audit(title: String, message: String): Unit = js.native
    def clearSublist(transaction: nlobjRecord, listType: String): Unit = js.native
    def debug(title: String, message: String): Unit = js.native
    def emergency(title: String, message: String): Unit = js.native
    def error(title: String, message: String): Unit = js.native
    def getCompanyPreference(paramName: String): js.Any = js.native
    def getDeploymentId(): js.Any = js.native
    def getRoleCenter(): js.Any = js.native
    def getScriptId(): js.Any = js.native
    def getScriptParameter(paramName: String): js.Any = js.native
    def getUser(): js.Any = js.native
    def getVersion(): String = js.native
    def isNumber(n: js.Any): Boolean = js.native
    def isProduction(): js.Any = js.native
    def lookupField(dataIn: js.Any): String = js.native
    def roundNum(num: Double, length: Double): Double = js.native
    def runSearch(): js.Any = js.native
    def runSearch(config: Iconfig): js.Any = js.native
    def setLogging(toggle: Boolean): Unit = js.native
    def submitField(dataIn: js.Any): js.Any = js.native
  }
  
}

