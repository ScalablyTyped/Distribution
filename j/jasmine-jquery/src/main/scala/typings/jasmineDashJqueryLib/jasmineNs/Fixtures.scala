package typings
package jasmineDashJqueryLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fixtures extends js.Object {
  var containerId: java.lang.String = js.native
  var fixturesPath: java.lang.String = js.native
  def `addToContainer_`(html: java.lang.String): scala.Unit = js.native
  def appendLoad(uls: java.lang.String*): scala.Unit = js.native
  def appendSet(html: java.lang.String): scala.Unit = js.native
  def cleanUp(): scala.Unit = js.native
  def clearCache(): scala.Unit = js.native
  def `createContainer_`(html: java.lang.String): java.lang.String = js.native
  def `getFixtureHtml_`(url: java.lang.String): java.lang.String = js.native
  def load(uls: java.lang.String*): scala.Unit = js.native
  def `loadFixtureIntoCache_`(relativeUrl: java.lang.String): scala.Unit = js.native
  def `makeFixtureUrl_`(relativeUrl: java.lang.String): java.lang.String = js.native
  def preload(uls: java.lang.String*): scala.Unit = js.native
  def `proxyCallTo_`(methodName: java.lang.String, passedArguments: js.Any): js.Any = js.native
  def read(uls: java.lang.String*): java.lang.String = js.native
  def sandbox(): java.lang.String = js.native
  def sandbox(attributes: js.Any): java.lang.String = js.native
  def set(html: java.lang.String): java.lang.String = js.native
}

