package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthUtilsFileReadingHelpersMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/utils/file-reading-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def constructFilepath(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constructFilepath")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fileExistsAtPath(filepath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsAtPath")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def readCrTokenFile(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readCrTokenFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readCredentialsFile(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readCredentialsFile")().asInstanceOf[Any]
}
