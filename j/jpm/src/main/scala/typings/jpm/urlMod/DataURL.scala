package typings.jpm.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataURL extends js.Object {
  var base64: String = js.native
  var data: String = js.native
  var mimeType: String = js.native
  var parameters: js.Object = js.native
}

@JSImport("sdk/url", "DataURL")
@js.native
object DataURL extends js.Object {
  def apply(uri: String): DataURL = js.native
}

