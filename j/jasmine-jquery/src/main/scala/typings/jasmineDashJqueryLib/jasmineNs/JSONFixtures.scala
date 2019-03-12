package typings
package jasmineDashJqueryLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFixtures extends js.Object {
  var fixturesPath: java.lang.String
  def clearCache(): scala.Unit
  def getFixtureData_(url: java.lang.String): js.Any
  def load(uls: java.lang.String*): scala.Unit
  def loadFixtureIntoCache_(relativeUrl: java.lang.String): scala.Unit
  def proxyCallTo_(methodName: java.lang.String, passedArguments: js.Any): js.Any
  def read(uls: java.lang.String*): java.lang.String
}

object JSONFixtures {
  @scala.inline
  def apply(
    clearCache: () => scala.Unit,
    fixturesPath: java.lang.String,
    getFixtureData_ : java.lang.String => js.Any,
    load: /* repeated */ java.lang.String => scala.Unit,
    loadFixtureIntoCache_ : java.lang.String => scala.Unit,
    proxyCallTo_ : (java.lang.String, js.Any) => js.Any,
    read: /* repeated */ java.lang.String => java.lang.String
  ): JSONFixtures = {
    val __obj = js.Dynamic.literal(clearCache = js.Any.fromFunction0(clearCache), fixturesPath = fixturesPath, getFixtureData_ = js.Any.fromFunction1(getFixtureData_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read = js.Any.fromFunction1(read))
  
    __obj.asInstanceOf[JSONFixtures]
  }
}

