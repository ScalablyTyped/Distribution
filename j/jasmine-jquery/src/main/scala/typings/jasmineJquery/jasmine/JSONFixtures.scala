package typings.jasmineJquery.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONFixtures extends js.Object {
  var fixturesPath: String = js.native
  def clearCache(): Unit = js.native
  def getFixtureData_(url: String): js.Any = js.native
  def load(uls: String*): Unit = js.native
  def loadFixtureIntoCache_(relativeUrl: String): Unit = js.native
  def proxyCallTo_(methodName: String, passedArguments: js.Any): js.Any = js.native
  def read(uls: String*): String = js.native
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
    val __obj = js.Dynamic.literal(clearCache = js.Any.fromFunction0(clearCache), fixturesPath = fixturesPath.asInstanceOf[js.Any], getFixtureData_ = js.Any.fromFunction1(getFixtureData_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[JSONFixtures]
  }
  @scala.inline
  implicit class JSONFixturesOps[Self <: JSONFixtures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearCache(value: () => Unit): Self = this.set("clearCache", js.Any.fromFunction0(value))
    @scala.inline
    def setFixturesPath(value: String): Self = this.set("fixturesPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFixtureData_(value: String => js.Any): Self = this.set("getFixtureData_", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: /* repeated */ String => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadFixtureIntoCache_(value: String => Unit): Self = this.set("loadFixtureIntoCache_", js.Any.fromFunction1(value))
    @scala.inline
    def setProxyCallTo_(value: (String, js.Any) => js.Any): Self = this.set("proxyCallTo_", js.Any.fromFunction2(value))
    @scala.inline
    def setRead(value: /* repeated */ String => String): Self = this.set("read", js.Any.fromFunction1(value))
  }
  
}

