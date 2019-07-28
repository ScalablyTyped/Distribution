package typings.jasmineDashJquery

import typings.jasmineDashJquery.jasmineNs.JQueryEventSpy
import typings.jasmineDashJquery.jasmineNs.JSONFixtures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def appendLoadFixtures(uls: String*): Unit = js.native
  def appendLoadStyleFixtures(uls: String*): Unit = js.native
  def appendSetFixtures(html: String): Unit = js.native
  def appendSetStyleFixtures(html: String): Unit = js.native
  def getJSONFixture(url: String): js.Any = js.native
  def loadFixtures(uls: String*): Unit = js.native
  def loadJSONFixtures(uls: String*): JSONFixtures = js.native
  def loadStyleFixtures(uls: String*): Unit = js.native
  def preloadFixtures(uls: String*): Unit = js.native
  def preloadStyleFixtures(uls: String*): Unit = js.native
  def readFixtures(uls: String*): String = js.native
  def sandbox(): String = js.native
  def sandbox(attributes: js.Any): String = js.native
  def setFixtures(html: String): String = js.native
  def setStyleFixtures(html: String): Unit = js.native
  def spyOnEvent(selector: String, eventName: String): JQueryEventSpy = js.native
}

