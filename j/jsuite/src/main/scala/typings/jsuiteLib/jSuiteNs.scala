package typings
package jsuiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jSuite")
@js.native
object jSuiteNs extends js.Object {
  def asyncLookupField(config: js.Any, callback: js.Any): scala.Unit = js.native
  def asyncSubmitField(config: js.Any): jqueryLib.JQueryXHR = js.native
  def audit(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def clearSublist(transaction: suitescriptLib.nlobjRecord, listType: java.lang.String): scala.Unit = js.native
  def debug(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def emergency(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def error(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def getCompanyPreference(paramName: java.lang.String): js.Any = js.native
  def getDeploymentId(): js.Any = js.native
  def getRoleCenter(): js.Any = js.native
  def getScriptId(): js.Any = js.native
  def getScriptParameter(paramName: java.lang.String): js.Any = js.native
  def getUser(): js.Any = js.native
  def getVersion(): java.lang.String = js.native
  def isNumber(n: js.Any): scala.Boolean = js.native
  def isProduction(): js.Any = js.native
  def lookupField(dataIn: js.Any): java.lang.String = js.native
  def roundNum(num: scala.Double, length: scala.Double): scala.Double = js.native
  def runSearch(): js.Any = js.native
  def runSearch(config: jsuiteLib.Iconfig): js.Any = js.native
  def setLogging(toggle: scala.Boolean): scala.Unit = js.native
  def submitField(dataIn: js.Any): js.Any = js.native
}

