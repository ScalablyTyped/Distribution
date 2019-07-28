package typings.jasmineDashJquery.jasmineNs

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object ^ extends js.Object {
  var JQuery: JasmineJQuery = js.native
  def getFixtures(): Fixtures = js.native
  def getJSONFixtures(): JSONFixtures = js.native
  def getStyleFixtures(): StyleFixtures = js.native
  def spiedEventsKey(selector: JQuery[HTMLElement], eventName: String): String = js.native
}

