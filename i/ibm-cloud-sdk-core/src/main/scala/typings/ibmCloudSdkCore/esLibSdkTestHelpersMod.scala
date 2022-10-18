package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLibSdkTestHelpersMod {
  
  @JSImport("ibm-cloud-sdk-core/es/lib/sdk-test-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkForSuccessfulExecution(createRequestMock: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkForSuccessfulExecution")(createRequestMock.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkMediaHeaders(createRequestMock: Any, accept: String, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMediaHeaders")(createRequestMock.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkUrlAndMethod(options: Any, url: String, method: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUrlAndMethod")(options.asInstanceOf[js.Any], url.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkUserHeader(createRequestMock: Any, userHeaderName: String, userHeaderValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUserHeader")(createRequestMock.asInstanceOf[js.Any], userHeaderName.asInstanceOf[js.Any], userHeaderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectToBePromise(sdkPromise: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("expectToBePromise")(sdkPromise.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getOptions(createRequestMock: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(createRequestMock.asInstanceOf[js.Any]).asInstanceOf[Any]
}
