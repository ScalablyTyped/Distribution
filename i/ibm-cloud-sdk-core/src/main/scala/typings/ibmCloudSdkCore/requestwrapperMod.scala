package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestwrapperMod {
  
  @JSImport("ibm-cloud-sdk-core/lib/requestwrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatError(axiosError: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(axiosError.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def sendRequest(parameters: js.Any, _callback: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(parameters.asInstanceOf[js.Any], _callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
