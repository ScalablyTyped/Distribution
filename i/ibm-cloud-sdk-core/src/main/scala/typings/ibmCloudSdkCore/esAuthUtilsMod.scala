package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.Authenticator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthUtilsMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atLeastOne(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("atLeastOne")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def atMostOne(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("atMostOne")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checkCredentials(obj: Any, credsToCheck: js.Array[String]): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCredentials")(obj.asInstanceOf[js.Any], credsToCheck.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def computeBasicAuthHeader(username: String, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBasicAuthHeader")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def constructFilepath(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constructFilepath")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fileExistsAtPath(filepath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsAtPath")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getAuthenticatorFromEnvironment(serviceName: String): Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthenticatorFromEnvironment")(serviceName.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  inline def getCurrentTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentTime")().asInstanceOf[Double]
  
  inline def onlyOne(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("onlyOne")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def readCrTokenFile(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readCrTokenFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readCredentialsFile(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readCredentialsFile")().asInstanceOf[Any]
  
  inline def readExternalSources(serviceName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readExternalSources")(serviceName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def removeSuffix(str: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSuffix")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def validateInput(options: Any, requiredOptions: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInput")(options.asInstanceOf[js.Any], requiredOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
