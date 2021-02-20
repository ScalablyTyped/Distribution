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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("appendLoadFixtures")
  @js.native
  def appendLoadFixtures(uls: String*): Unit = js.native
  
  @JSGlobal("appendLoadStyleFixtures")
  @js.native
  def appendLoadStyleFixtures(uls: String*): Unit = js.native
  
  @JSGlobal("appendSetFixtures")
  @js.native
  def appendSetFixtures(html: String): Unit = js.native
  
  @JSGlobal("appendSetStyleFixtures")
  @js.native
  def appendSetStyleFixtures(html: String): Unit = js.native
  
  @JSGlobal("getJSONFixture")
  @js.native
  def getJSONFixture(url: String): js.Any = js.native
  
  object jasmine {
    
    @JSGlobal("jasmine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jasmine.JQuery")
    @js.native
    def JQuery: JasmineJQuery = js.native
    @scala.inline
    def JQuery_=(x: JasmineJQuery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JQuery")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.getFixtures")
    @js.native
    def getFixtures(): Fixtures = js.native
    
    @JSGlobal("jasmine.getJSONFixtures")
    @js.native
    def getJSONFixtures(): JSONFixtures = js.native
    
    @JSGlobal("jasmine.getStyleFixtures")
    @js.native
    def getStyleFixtures(): StyleFixtures = js.native
    
    @JSGlobal("jasmine.spiedEventsKey")
    @js.native
    def spiedEventsKey(selector: JQuery[HTMLElement], eventName: String): String = js.native
  }
  
  @JSGlobal("loadFixtures")
  @js.native
  def loadFixtures(uls: String*): Unit = js.native
  
  @JSGlobal("loadJSONFixtures")
  @js.native
  def loadJSONFixtures(uls: String*): JSONFixtures = js.native
  
  @JSGlobal("loadStyleFixtures")
  @js.native
  def loadStyleFixtures(uls: String*): Unit = js.native
  
  @JSGlobal("preloadFixtures")
  @js.native
  def preloadFixtures(uls: String*): Unit = js.native
  
  @JSGlobal("preloadStyleFixtures")
  @js.native
  def preloadStyleFixtures(uls: String*): Unit = js.native
  
  @JSGlobal("readFixtures")
  @js.native
  def readFixtures(uls: String*): String = js.native
  
  @JSGlobal("sandbox")
  @js.native
  def sandbox(): String = js.native
  @JSGlobal("sandbox")
  @js.native
  def sandbox(attributes: js.Any): String = js.native
  
  @JSGlobal("setFixtures")
  @js.native
  def setFixtures(html: String): String = js.native
  
  @JSGlobal("setStyleFixtures")
  @js.native
  def setStyleFixtures(html: String): Unit = js.native
  
  @JSGlobal("spyOnEvent")
  @js.native
  def spyOnEvent(selector: String, eventName: String): JQueryEventSpy = js.native
}
