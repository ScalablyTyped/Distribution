package typings.jpm.sdkUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataURL extends js.Object {
  var base64: String
  var data: String
  var mimeType: String
  var parameters: js.Object
}

@JSImport("sdk/url", "DataURL")
@js.native
object DataURL extends js.Object {
  def apply(uri: String): DataURL = js.native
}

