package typings.jasmineJquery.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fixtures extends js.Object {
  var containerId: String = js.native
  var fixturesPath: String = js.native
  def addToContainer_(html: String): Unit = js.native
  def appendLoad(uls: String*): Unit = js.native
  def appendSet(html: String): Unit = js.native
  def cleanUp(): Unit = js.native
  def clearCache(): Unit = js.native
  def createContainer_(html: String): String = js.native
  def getFixtureHtml_(url: String): String = js.native
  def load(uls: String*): Unit = js.native
  def loadFixtureIntoCache_(relativeUrl: String): Unit = js.native
  def makeFixtureUrl_(relativeUrl: String): String = js.native
  def preload(uls: String*): Unit = js.native
  def proxyCallTo_(methodName: String, passedArguments: js.Any): js.Any = js.native
  def read(uls: String*): String = js.native
  def sandbox(): String = js.native
  def sandbox(attributes: js.Any): String = js.native
  def set(html: String): String = js.native
}

