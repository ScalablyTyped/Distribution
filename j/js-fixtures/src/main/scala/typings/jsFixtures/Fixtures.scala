package typings.jsFixtures

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fixtures extends StObject {
  
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
  implicit class FixturesMutableBuilder[Self <: Fixtures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendLoad(value: /* repeated */ String => Unit): Self = StObject.set(x, "appendLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendSet(value: String => Unit): Self = StObject.set(x, "appendSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBody(value: () => String): Self = StObject.set(x, "body", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCleanUp(value: () => Unit): Self = StObject.set(x, "cleanUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: /* repeated */ String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: /* repeated */ String => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(value: /* repeated */ String => String): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindow(value: () => Window): Self = StObject.set(x, "window", js.Any.fromFunction0(value))
  }
}
