package typings.jsFixtures

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fixtures_ extends js.Object {
  var containerId: String
  var path: String
  def appendLoad(urls: String*): Unit
  def appendSet(html: String): Unit
  def body(): String
  def cleanUp(): Unit
  def clearCache(): Unit
  def load(urls: String*): Unit
  def preload(urls: String*): Unit
  def read(urls: String*): String
  def set(html: String): Unit
  def window(): Window_
}

object Fixtures_ {
  @scala.inline
  def apply(
    appendLoad: /* repeated */ String => Unit,
    appendSet: String => Unit,
    body: () => String,
    cleanUp: () => Unit,
    clearCache: () => Unit,
    containerId: String,
    load: /* repeated */ String => Unit,
    path: String,
    preload: /* repeated */ String => Unit,
    read: /* repeated */ String => String,
    set: String => Unit,
    window: () => Window_
  ): Fixtures_ = {
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), body = js.Any.fromFunction0(body), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), containerId = containerId.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), path = path.asInstanceOf[js.Any], preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1(set), window = js.Any.fromFunction0(window))
  
    __obj.asInstanceOf[Fixtures_]
  }
}

