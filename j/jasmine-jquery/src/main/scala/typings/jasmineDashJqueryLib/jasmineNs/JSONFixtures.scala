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
    clearCache: js.Function0[scala.Unit],
    fixturesPath: java.lang.String,
    getFixtureData_ : js.Function1[java.lang.String, js.Any],
    load: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    loadFixtureIntoCache_ : js.Function1[java.lang.String, scala.Unit],
    proxyCallTo_ : js.Function2[java.lang.String, js.Any, js.Any],
    read: js.Function1[/* repeated */ java.lang.String, java.lang.String]
  ): JSONFixtures = {
    val __obj = js.Dynamic.literal(clearCache = clearCache, fixturesPath = fixturesPath, getFixtureData_ = getFixtureData_, load = load, loadFixtureIntoCache_ = loadFixtureIntoCache_, proxyCallTo_ = proxyCallTo_, read = read)
  
    __obj.asInstanceOf[JSONFixtures]
  }
}

