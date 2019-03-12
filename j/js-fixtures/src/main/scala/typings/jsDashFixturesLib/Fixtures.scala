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
    appendLoad: /* repeated */ java.lang.String => scala.Unit,
    appendSet: java.lang.String => scala.Unit,
    body: () => java.lang.String,
    cleanUp: () => scala.Unit,
    clearCache: () => scala.Unit,
    containerId: java.lang.String,
    load: /* repeated */ java.lang.String => scala.Unit,
    path: java.lang.String,
    preload: /* repeated */ java.lang.String => scala.Unit,
    read: /* repeated */ java.lang.String => java.lang.String,
    set: java.lang.String => scala.Unit,
    window: () => stdLib.Window
  ): Fixtures = {
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), body = js.Any.fromFunction0(body), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), containerId = containerId, load = js.Any.fromFunction1(load), path = path, preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1(set), window = js.Any.fromFunction0(window))
  
    __obj.asInstanceOf[Fixtures]
  }
}

