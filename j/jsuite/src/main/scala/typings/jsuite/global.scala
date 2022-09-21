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
    
    inline def asyncLookupField(config: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncLookupField")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def asyncSubmitField(config: Any): JQueryXHR = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncSubmitField")(config.asInstanceOf[js.Any]).asInstanceOf[JQueryXHR]
    
    inline def audit(title: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("audit")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clearSublist(transaction: nlobjRecord, listType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearSublist")(transaction.asInstanceOf[js.Any], listType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def debug(title: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def emergency(title: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emergency")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def error(title: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getCompanyPreference(paramName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompanyPreference")(paramName.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getDeploymentId(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeploymentId")().asInstanceOf[Any]
    
    inline def getRoleCenter(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoleCenter")().asInstanceOf[Any]
    
    inline def getScriptId(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getScriptId")().asInstanceOf[Any]
    
    inline def getScriptParameter(paramName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getScriptParameter")(paramName.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUser(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")().asInstanceOf[Any]
    
    inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
    
    inline def isNumber(n: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isProduction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isProduction")().asInstanceOf[Any]
    
    inline def lookupField(dataIn: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupField")(dataIn.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def roundNum(num: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundNum")(num.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def runSearch(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runSearch")().asInstanceOf[Any]
    inline def runSearch(config: Iconfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runSearch")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def setLogging(toggle: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogging")(toggle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def submitField(dataIn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("submitField")(dataIn.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
