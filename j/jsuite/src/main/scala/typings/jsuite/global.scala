package typings.jsuite

import typings.jquery.JQueryXHR
import typings.suitescript.nlobjRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jSuite {
    
    @JSGlobal("jSuite")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def asyncLookupField(config: js.Any, callback: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncLookupField")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def asyncSubmitField(config: js.Any): JQueryXHR = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncSubmitField")(config.asInstanceOf[js.Any]).asInstanceOf[JQueryXHR]
    
    @scala.inline
    def audit(title: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("audit")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def clearSublist(transaction: nlobjRecord, listType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearSublist")(transaction.asInstanceOf[js.Any], listType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def debug(title: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def emergency(title: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emergency")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def error(title: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def getCompanyPreference(paramName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompanyPreference")(paramName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getDeploymentId(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeploymentId")().asInstanceOf[js.Any]
    
    @scala.inline
    def getRoleCenter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoleCenter")().asInstanceOf[js.Any]
    
    @scala.inline
    def getScriptId(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getScriptId")().asInstanceOf[js.Any]
    
    @scala.inline
    def getScriptParameter(paramName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getScriptParameter")(paramName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUser(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")().asInstanceOf[js.Any]
    
    @scala.inline
    def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
    
    @scala.inline
    def isNumber(n: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isProduction(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isProduction")().asInstanceOf[js.Any]
    
    @scala.inline
    def lookupField(dataIn: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupField")(dataIn.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def roundNum(num: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundNum")(num.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def runSearch(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runSearch")().asInstanceOf[js.Any]
    @scala.inline
    def runSearch(config: Iconfig): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runSearch")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def setLogging(toggle: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogging")(toggle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def submitField(dataIn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("submitField")(dataIn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
