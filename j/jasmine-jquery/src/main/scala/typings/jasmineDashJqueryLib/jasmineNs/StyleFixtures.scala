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
    appendLoad: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    appendSet: js.Function1[java.lang.String, scala.Unit],
    cleanUp: js.Function0[scala.Unit],
    clearCache: js.Function0[scala.Unit],
    createStyle_ : js.Function1[java.lang.String, scala.Unit],
    fixturesPath: java.lang.String,
    getFixtureHtml_ : js.Function1[java.lang.String, java.lang.String],
    load: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    loadFixtureIntoCache_ : js.Function1[java.lang.String, scala.Unit],
    makeFixtureUrl_ : js.Function1[java.lang.String, java.lang.String],
    preload: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    proxyCallTo_ : js.Function2[java.lang.String, js.Any, js.Any],
    read_ : js.Function1[/* repeated */ java.lang.String, java.lang.String],
    set: js.Function1[java.lang.String, java.lang.String]
  ): StyleFixtures = {
    val __obj = js.Dynamic.literal(appendLoad = appendLoad, appendSet = appendSet, cleanUp = cleanUp, clearCache = clearCache, createStyle_ = createStyle_, fixturesPath = fixturesPath, getFixtureHtml_ = getFixtureHtml_, load = load, loadFixtureIntoCache_ = loadFixtureIntoCache_, makeFixtureUrl_ = makeFixtureUrl_, preload = preload, proxyCallTo_ = proxyCallTo_, read_ = read_, set = set)
  
    __obj.asInstanceOf[StyleFixtures]
  }
}

