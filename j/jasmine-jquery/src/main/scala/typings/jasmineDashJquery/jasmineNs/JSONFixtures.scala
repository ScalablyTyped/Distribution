package typings.jasmineDashJquery.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFixtures extends js.Object {
  var fixturesPath: String
  def clearCache(): Unit
  def getFixtureData_(url: String): js.Any
  def load(uls: String*): Unit
  def loadFixtureIntoCache_(relativeUrl: String): Unit
  def proxyCallTo_(methodName: String, passedArguments: js.Any): js.Any
  def read(uls: String*): String
}

object JSONFixtures {
  @scala.inline
  def apply(
    clearCache: () => Unit,
    fixturesPath: String,
    getFixtureData_ : String => js.Any,
    load: /* repeated */ String => Unit,
    loadFixtureIntoCache_ : String => Unit,
    proxyCallTo_ : (String, js.Any) => js.Any,
    read: /* repeated */ String => String
  ): JSONFixtures = {
    val __obj = js.Dynamic.literal(clearCache = js.Any.fromFunction0(clearCache), fixturesPath = fixturesPath, getFixtureData_ = js.Any.fromFunction1(getFixtureData_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read = js.Any.fromFunction1(read))
  
    __obj.asInstanceOf[JSONFixtures]
  }
}

