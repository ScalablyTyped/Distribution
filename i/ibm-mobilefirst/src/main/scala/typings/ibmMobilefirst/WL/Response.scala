package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends ResponseBase {
  def getAllHeaders(): Headers
  def getHeader(name: js.Any): String
  def getHeaderNames(): js.Array[String]
}

object Response {
  @scala.inline
  def apply(
    errorCode: Double,
    errorMsg: String,
    getAllHeaders: () => Headers,
    getHeader: js.Any => String,
    getHeaderNames: () => js.Array[String],
    headerJSON: StringDictionary[js.Any],
    invocationContext: js.Any,
    readyState: Double,
    request: js.Any,
    responseJSON: StringDictionary[js.Any],
    responseText: String,
    responseXML: String,
    status: Double,
    statusText: String
  ): Response = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], getAllHeaders = js.Any.fromFunction0(getAllHeaders), getHeader = js.Any.fromFunction1(getHeader), getHeaderNames = js.Any.fromFunction0(getHeaderNames), headerJSON = headerJSON.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], responseJSON = responseJSON.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

