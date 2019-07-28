package typings.i18n.ExpressNs

import typings.i18n.i18nAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends i18nAPI {
  var language: String = js.native
  var languages: js.Array[String] = js.native
  var region: String = js.native
  var regions: js.Array[String] = js.native
}

