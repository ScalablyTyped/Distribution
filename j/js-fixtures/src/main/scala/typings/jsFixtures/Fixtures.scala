package typings.jsFixtures

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fixtures extends js.Object {
  
  def appendLoad(urls: String*): Unit = js.native
  
  def appendSet(html: String): Unit = js.native
  
  def body(): String = js.native
  
  def cleanUp(): Unit = js.native
  
  def clearCache(): Unit = js.native
  
  var containerId: String = js.native
  
  def load(urls: String*): Unit = js.native
  
  var path: String = js.native
  
  def preload(urls: String*): Unit = js.native
  
  def read(urls: String*): String = js.native
  
  def set(html: String): Unit = js.native
  
  def window(): Window = js.native
}
object Fixtures {
  
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
    window: () => Window
  ): Fixtures = {
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), body = js.Any.fromFunction0(body), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), containerId = containerId.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), path = path.asInstanceOf[js.Any], preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1(set), window = js.Any.fromFunction0(window))
    __obj.asInstanceOf[Fixtures]
  }
  
  @scala.inline
  implicit class FixturesOps[Self <: Fixtures] (val x: Self) extends AnyVal {
    
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
    def setBody(value: () => String): Self = this.set("body", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCleanUp(value: () => Unit): Self = this.set("cleanUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearCache(value: () => Unit): Self = this.set("clearCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: /* repeated */ String => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: /* repeated */ String => Unit): Self = this.set("preload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(value: /* repeated */ String => String): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindow(value: () => Window): Self = this.set("window", js.Any.fromFunction0(value))
  }
}
