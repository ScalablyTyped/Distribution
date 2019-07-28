package typings.jasmineDashJquery.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFixtures extends js.Object {
  var fixturesPath: String
  def appendLoad(uls: String*): Unit
  def appendSet(html: String): Unit
  def cleanUp(): Unit
  def clearCache(): Unit
  def createStyle_(html: String): Unit
  def getFixtureHtml_(url: String): String
  def load(uls: String*): Unit
  def loadFixtureIntoCache_(relativeUrl: String): Unit
  def makeFixtureUrl_(relativeUrl: String): String
  def preload(uls: String*): Unit
  def proxyCallTo_(methodName: String, passedArguments: js.Any): js.Any
  def read_(uls: String*): String
  def set(html: String): String
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
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), createStyle_ = js.Any.fromFunction1(createStyle_), fixturesPath = fixturesPath, getFixtureHtml_ = js.Any.fromFunction1(getFixtureHtml_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), makeFixtureUrl_ = js.Any.fromFunction1(makeFixtureUrl_), preload = js.Any.fromFunction1(preload), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read_ = js.Any.fromFunction1(read_), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[StyleFixtures]
  }
}

