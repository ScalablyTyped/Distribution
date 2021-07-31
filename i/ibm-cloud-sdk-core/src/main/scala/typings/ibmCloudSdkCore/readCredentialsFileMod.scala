package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readCredentialsFileMod {
  
  @JSImport("ibm-cloud-sdk-core/lib/read-credentials-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def constructFilepath(filepath: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constructFilepath")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def fileExistsAtPath(filepath: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsAtPath")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def readCredentialsFile(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readCredentialsFile")().asInstanceOf[js.Any]
}
