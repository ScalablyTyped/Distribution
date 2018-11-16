package typings
package jasmineDashJqueryLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSONFixtures extends js.Object {
  var fixturesPath: java.lang.String
  def clearCache(): scala.Unit
  def `getFixtureData_`(url: java.lang.String): js.Any
  def load(uls: java.lang.String*): scala.Unit
  def `loadFixtureIntoCache_`(relativeUrl: java.lang.String): scala.Unit
  def `proxyCallTo_`(methodName: java.lang.String, passedArguments: js.Any): js.Any
  def read(uls: java.lang.String*): java.lang.String
}

