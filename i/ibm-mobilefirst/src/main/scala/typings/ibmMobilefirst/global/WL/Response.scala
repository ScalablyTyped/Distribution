package typings.ibmMobilefirst.global.WL

import org.scalablytyped.runtime.StringDictionary
import typings.ibmMobilefirst.WL.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Response")
@js.native
class Response ()
  extends typings.ibmMobilefirst.WL.Response {
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var errorMsg: String = js.native
  /* CompleteClass */
  override var headerJSON: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var invocationContext: js.Any = js.native
   // JSON Object
  /* CompleteClass */
  override var readyState: Double = js.native
  /* CompleteClass */
  override var request: js.Any = js.native
  /* CompleteClass */
  override var responseJSON: StringDictionary[js.Any] = js.native
   // JSON Object
  /* CompleteClass */
  override var responseText: String = js.native
  /* CompleteClass */
  override var responseXML: String = js.native
  /* CompleteClass */
  override var status: Double = js.native
  /* CompleteClass */
  override var statusText: String = js.native
  /* CompleteClass */
  override def getAllHeaders(): Headers = js.native
  /* CompleteClass */
  override def getHeader(name: js.Any): String = js.native
  /* CompleteClass */
  override def getHeaderNames(): js.Array[String] = js.native
}

