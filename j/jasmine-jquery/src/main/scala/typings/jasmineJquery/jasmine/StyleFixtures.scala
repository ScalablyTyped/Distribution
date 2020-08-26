package typings.jasmineJquery.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleFixtures extends js.Object {
  var fixturesPath: String = js.native
  def appendLoad(uls: String*): Unit = js.native
  def appendSet(html: String): Unit = js.native
  def cleanUp(): Unit = js.native
  def clearCache(): Unit = js.native
  def createStyle_(html: String): Unit = js.native
  def getFixtureHtml_(url: String): String = js.native
  def load(uls: String*): Unit = js.native
  def loadFixtureIntoCache_(relativeUrl: String): Unit = js.native
  def makeFixtureUrl_(relativeUrl: String): String = js.native
  def preload(uls: String*): Unit = js.native
  def proxyCallTo_(methodName: String, passedArguments: js.Any): js.Any = js.native
  def read_(uls: String*): String = js.native
  def set(html: String): String = js.native
}

object StyleFixtures {
  @scala.inline
  def apply(
    appendLoad: /* repeated */ String => Unit,
    appendSet: String => Unit,
    cleanUp: () => Unit,
    clearCache: () => Unit,
    createStyle_ : String => Unit,
    fixturesPath: String,
    getFixtureHtml_ : String => String,
    load: /* repeated */ String => Unit,
    loadFixtureIntoCache_ : String => Unit,
    makeFixtureUrl_ : String => String,
    preload: /* repeated */ String => Unit,
    proxyCallTo_ : (String, js.Any) => js.Any,
    read_ : /* repeated */ String => String,
    set: String => String
  ): StyleFixtures = {
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), createStyle_ = js.Any.fromFunction1(createStyle_), fixturesPath = fixturesPath.asInstanceOf[js.Any], getFixtureHtml_ = js.Any.fromFunction1(getFixtureHtml_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), makeFixtureUrl_ = js.Any.fromFunction1(makeFixtureUrl_), preload = js.Any.fromFunction1(preload), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read_ = js.Any.fromFunction1(read_), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[StyleFixtures]
  }
  @scala.inline
  implicit class StyleFixturesOps[Self <: StyleFixtures] (val x: Self) extends AnyVal {
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
    def setAppendLoad(value: /* repeated */ String => Unit): Self = this.set("appendLoad", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendSet(value: String => Unit): Self = this.set("appendSet", js.Any.fromFunction1(value))
    @scala.inline
    def setCleanUp(value: () => Unit): Self = this.set("cleanUp", js.Any.fromFunction0(value))
    @scala.inline
    def setClearCache(value: () => Unit): Self = this.set("clearCache", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateStyle_(value: String => Unit): Self = this.set("createStyle_", js.Any.fromFunction1(value))
    @scala.inline
    def setFixturesPath(value: String): Self = this.set("fixturesPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFixtureHtml_(value: String => String): Self = this.set("getFixtureHtml_", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: /* repeated */ String => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadFixtureIntoCache_(value: String => Unit): Self = this.set("loadFixtureIntoCache_", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeFixtureUrl_(value: String => String): Self = this.set("makeFixtureUrl_", js.Any.fromFunction1(value))
    @scala.inline
    def setPreload(value: /* repeated */ String => Unit): Self = this.set("preload", js.Any.fromFunction1(value))
    @scala.inline
    def setProxyCallTo_(value: (String, js.Any) => js.Any): Self = this.set("proxyCallTo_", js.Any.fromFunction2(value))
    @scala.inline
    def setRead_(value: /* repeated */ String => String): Self = this.set("read_", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: String => String): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

