package typings
package jasmineDashJqueryLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StyleFixtures extends js.Object {
  var fixturesPath: java.lang.String
  def appendLoad(uls: java.lang.String*): scala.Unit
  def appendSet(html: java.lang.String): scala.Unit
  def cleanUp(): scala.Unit
  def clearCache(): scala.Unit
  def `createStyle_`(html: java.lang.String): scala.Unit
  def `getFixtureHtml_`(url: java.lang.String): java.lang.String
  def load(uls: java.lang.String*): scala.Unit
  def `loadFixtureIntoCache_`(relativeUrl: java.lang.String): scala.Unit
  def `makeFixtureUrl_`(relativeUrl: java.lang.String): java.lang.String
  def preload(uls: java.lang.String*): scala.Unit
  def `proxyCallTo_`(methodName: java.lang.String, passedArguments: js.Any): js.Any
  def `read_`(uls: java.lang.String*): java.lang.String
  def set(html: java.lang.String): java.lang.String
}

