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
  def createStyle_(html: java.lang.String): scala.Unit
  def getFixtureHtml_(url: java.lang.String): java.lang.String
  def load(uls: java.lang.String*): scala.Unit
  def loadFixtureIntoCache_(relativeUrl: java.lang.String): scala.Unit
  def makeFixtureUrl_(relativeUrl: java.lang.String): java.lang.String
  def preload(uls: java.lang.String*): scala.Unit
  def proxyCallTo_(methodName: java.lang.String, passedArguments: js.Any): js.Any
  def read_(uls: java.lang.String*): java.lang.String
  def set(html: java.lang.String): java.lang.String
}

object StyleFixtures {
  @scala.inline
  def apply(
    appendLoad: /* repeated */ java.lang.String => scala.Unit,
    appendSet: java.lang.String => scala.Unit,
    cleanUp: () => scala.Unit,
    clearCache: () => scala.Unit,
    createStyle_ : java.lang.String => scala.Unit,
    fixturesPath: java.lang.String,
    getFixtureHtml_ : java.lang.String => java.lang.String,
    load: /* repeated */ java.lang.String => scala.Unit,
    loadFixtureIntoCache_ : java.lang.String => scala.Unit,
    makeFixtureUrl_ : java.lang.String => java.lang.String,
    preload: /* repeated */ java.lang.String => scala.Unit,
    proxyCallTo_ : (java.lang.String, js.Any) => js.Any,
    read_ : /* repeated */ java.lang.String => java.lang.String,
    set: java.lang.String => java.lang.String
  ): StyleFixtures = {
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), createStyle_ = js.Any.fromFunction1(createStyle_), fixturesPath = fixturesPath, getFixtureHtml_ = js.Any.fromFunction1(getFixtureHtml_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), makeFixtureUrl_ = js.Any.fromFunction1(makeFixtureUrl_), preload = js.Any.fromFunction1(preload), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read_ = js.Any.fromFunction1(read_), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[StyleFixtures]
  }
}

