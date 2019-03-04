package typings
package jsDashFixturesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fixtures extends js.Object {
  var containerId: java.lang.String
  var path: java.lang.String
  def appendLoad(urls: java.lang.String*): scala.Unit
  def appendSet(html: java.lang.String): scala.Unit
  def body(): java.lang.String
  def cleanUp(): scala.Unit
  def clearCache(): scala.Unit
  def load(urls: java.lang.String*): scala.Unit
  def preload(urls: java.lang.String*): scala.Unit
  def read(urls: java.lang.String*): java.lang.String
  def set(html: java.lang.String): scala.Unit
  def window(): stdLib.Window
}

object Fixtures {
  @scala.inline
  def apply(
    appendLoad: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    appendSet: js.Function1[java.lang.String, scala.Unit],
    body: js.Function0[java.lang.String],
    cleanUp: js.Function0[scala.Unit],
    clearCache: js.Function0[scala.Unit],
    containerId: java.lang.String,
    load: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    path: java.lang.String,
    preload: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    read: js.Function1[/* repeated */ java.lang.String, java.lang.String],
    set: js.Function1[java.lang.String, scala.Unit],
    window: js.Function0[stdLib.Window]
  ): Fixtures = {
    val __obj = js.Dynamic.literal(appendLoad = appendLoad, appendSet = appendSet, body = body, cleanUp = cleanUp, clearCache = clearCache, containerId = containerId, load = load, path = path, preload = preload, read = read, set = set, window = window)
  
    __obj.asInstanceOf[Fixtures]
  }
}

