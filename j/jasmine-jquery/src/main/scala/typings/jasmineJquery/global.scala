package typings.jasmineJquery

import typings.jasmineJquery.jasmine.Fixtures
import typings.jasmineJquery.jasmine.JQueryEventSpy
import typings.jasmineJquery.jasmine.JSONFixtures
import typings.jasmineJquery.jasmine.JasmineJQuery
import typings.jasmineJquery.jasmine.StyleFixtures
import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def appendLoadFixtures(uls: String*): Unit = js.Dynamic.global.applyDynamic("appendLoadFixtures")(uls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def appendLoadStyleFixtures(uls: String*): Unit = js.Dynamic.global.applyDynamic("appendLoadStyleFixtures")(uls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def appendSetFixtures(html: String): Unit = js.Dynamic.global.applyDynamic("appendSetFixtures")(html.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def appendSetStyleFixtures(html: String): Unit = js.Dynamic.global.applyDynamic("appendSetStyleFixtures")(html.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getJSONFixture(url: String): js.Any = js.Dynamic.global.applyDynamic("getJSONFixture")(url.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object jasmine {
    
    @JSGlobal("jasmine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jasmine.JQuery")
    @js.native
    def JQuery: JasmineJQuery = js.native
    inline def JQuery_=(x: JasmineJQuery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JQuery")(x.asInstanceOf[js.Any])
    
    inline def getFixtures(): Fixtures = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixtures")().asInstanceOf[Fixtures]
    
    inline def getJSONFixtures(): JSONFixtures = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSONFixtures")().asInstanceOf[JSONFixtures]
    
    inline def getStyleFixtures(): StyleFixtures = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleFixtures")().asInstanceOf[StyleFixtures]
    
    inline def spiedEventsKey(selector: JQuery[HTMLElement], eventName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("spiedEventsKey")(selector.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  inline def loadFixtures(uls: String*): Unit = js.Dynamic.global.applyDynamic("loadFixtures")(uls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def loadJSONFixtures(uls: String*): JSONFixtures = js.Dynamic.global.applyDynamic("loadJSONFixtures")(uls.asInstanceOf[js.Any]).asInstanceOf[JSONFixtures]
  
  inline def loadStyleFixtures(uls: String*): Unit = js.Dynamic.global.applyDynamic("loadStyleFixtures")(uls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def preloadFixtures(uls: String*): Unit = js.Dynamic.global.applyDynamic("preloadFixtures")(uls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def preloadStyleFixtures(uls: String*): Unit = js.Dynamic.global.applyDynamic("preloadStyleFixtures")(uls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def readFixtures(uls: String*): String = js.Dynamic.global.applyDynamic("readFixtures")(uls.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sandbox(): String = js.Dynamic.global.applyDynamic("sandbox")().asInstanceOf[String]
  inline def sandbox(attributes: js.Any): String = js.Dynamic.global.applyDynamic("sandbox")(attributes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setFixtures(html: String): String = js.Dynamic.global.applyDynamic("setFixtures")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setStyleFixtures(html: String): Unit = js.Dynamic.global.applyDynamic("setStyleFixtures")(html.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spyOnEvent(selector: String, eventName: String): JQueryEventSpy = (js.Dynamic.global.applyDynamic("spyOnEvent")(selector.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[JQueryEventSpy]
}
