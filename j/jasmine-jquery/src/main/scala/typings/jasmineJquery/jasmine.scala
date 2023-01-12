package typings.jasmineJquery

import typings.jasmine.jasmine.Env
import typings.jquery.JQuery
import typings.jquery.JQueryCallback
import typings.jquery.JQueryEventObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  @js.native
  trait Fixtures extends StObject {
    
    def addToContainer_(html: String): Unit = js.native
    
    def appendLoad(uls: String*): Unit = js.native
    
    def appendSet(html: String): Unit = js.native
    
    def cleanUp(): Unit = js.native
    
    def clearCache(): Unit = js.native
    
    var containerId: String = js.native
    
    def createContainer_(html: String): String = js.native
    
    var fixturesPath: String = js.native
    
    def getFixtureHtml_(url: String): String = js.native
    
    def load(uls: String*): Unit = js.native
    
    def loadFixtureIntoCache_(relativeUrl: String): Unit = js.native
    
    def makeFixtureUrl_(relativeUrl: String): String = js.native
    
    def preload(uls: String*): Unit = js.native
    
    def proxyCallTo_(methodName: String, passedArguments: Any): Any = js.native
    
    def read(uls: String*): String = js.native
    
    def sandbox(): String = js.native
    def sandbox(attributes: Any): String = js.native
    
    def set(html: String): String = js.native
  }
  
  trait JQueryEventSpy extends StObject {
    
    var eventName: String
    
    def handler(eventObject: JQueryEventObject): Any
    
    def reset(): Any
    
    var selector: String
  }
  object JQueryEventSpy {
    
    inline def apply(eventName: String, handler: JQueryEventObject => Any, reset: () => Any, selector: String): JQueryEventSpy = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), reset = js.Any.fromFunction0(reset), selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[JQueryEventSpy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JQueryEventSpy] (val x: Self) extends AnyVal {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: JQueryEventObject => Any): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Any): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONFixtures extends StObject {
    
    def clearCache(): Unit
    
    var fixturesPath: String
    
    def getFixtureData_(url: String): Any
    
    def load(uls: String*): Unit
    
    def loadFixtureIntoCache_(relativeUrl: String): Unit
    
    def proxyCallTo_(methodName: String, passedArguments: Any): Any
    
    def read(uls: String*): String
  }
  object JSONFixtures {
    
    inline def apply(
      clearCache: () => Unit,
      fixturesPath: String,
      getFixtureData_ : String => Any,
      load: /* repeated */ String => Unit,
      loadFixtureIntoCache_ : String => Unit,
      proxyCallTo_ : (String, Any) => Any,
      read: /* repeated */ String => String
    ): JSONFixtures = {
      val __obj = js.Dynamic.literal(clearCache = js.Any.fromFunction0(clearCache), fixturesPath = fixturesPath.asInstanceOf[js.Any], getFixtureData_ = js.Any.fromFunction1(getFixtureData_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[JSONFixtures]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONFixtures] (val x: Self) extends AnyVal {
      
      inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      inline def setFixturesPath(value: String): Self = StObject.set(x, "fixturesPath", value.asInstanceOf[js.Any])
      
      inline def setGetFixtureData_(value: String => Any): Self = StObject.set(x, "getFixtureData_", js.Any.fromFunction1(value))
      
      inline def setLoad(value: /* repeated */ String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadFixtureIntoCache_(value: String => Unit): Self = StObject.set(x, "loadFixtureIntoCache_", js.Any.fromFunction1(value))
      
      inline def setProxyCallTo_(value: (String, Any) => Any): Self = StObject.set(x, "proxyCallTo_", js.Any.fromFunction2(value))
      
      inline def setRead(value: /* repeated */ String => String): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
  
  trait JasmineJQuery extends StObject {
    
    def browserTagCaseIndependentHtml(html: String): String
    
    def elementToString(element: JQuery[HTMLElement]): String
    
    var events: JasmineJQueryEvents
    
    var matchersClass: Any
  }
  object JasmineJQuery {
    
    inline def apply(
      browserTagCaseIndependentHtml: String => String,
      elementToString: JQuery[HTMLElement] => String,
      events: JasmineJQueryEvents,
      matchersClass: Any
    ): JasmineJQuery = {
      val __obj = js.Dynamic.literal(browserTagCaseIndependentHtml = js.Any.fromFunction1(browserTagCaseIndependentHtml), elementToString = js.Any.fromFunction1(elementToString), events = events.asInstanceOf[js.Any], matchersClass = matchersClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[JasmineJQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JasmineJQuery] (val x: Self) extends AnyVal {
      
      inline def setBrowserTagCaseIndependentHtml(value: String => String): Self = StObject.set(x, "browserTagCaseIndependentHtml", js.Any.fromFunction1(value))
      
      inline def setElementToString(value: JQuery[HTMLElement] => String): Self = StObject.set(x, "elementToString", js.Any.fromFunction1(value))
      
      inline def setEvents(value: JasmineJQueryEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setMatchersClass(value: Any): Self = StObject.set(x, "matchersClass", value.asInstanceOf[js.Any])
    }
  }
  
  trait JasmineJQueryEvents extends StObject {
    
    def args(selector: String, eventName: String): Any
    
    def cleanUp(): Unit
    
    def spyOn(selector: String, eventName: String): JQueryEventSpy
    
    def wasPrevented(selector: String, eventName: String): Boolean
    
    def wasStopped(selector: String, eventName: String): Boolean
    
    def wasTriggered(selector: String, eventName: String): Boolean
    
    def wasTriggeredWith(selector: String, eventName: String, expectedArgs: Any, env: Env): Boolean
  }
  object JasmineJQueryEvents {
    
    inline def apply(
      args: (String, String) => Any,
      cleanUp: () => Unit,
      spyOn: (String, String) => JQueryEventSpy,
      wasPrevented: (String, String) => Boolean,
      wasStopped: (String, String) => Boolean,
      wasTriggered: (String, String) => Boolean,
      wasTriggeredWith: (String, String, Any, Env) => Boolean
    ): JasmineJQueryEvents = {
      val __obj = js.Dynamic.literal(args = js.Any.fromFunction2(args), cleanUp = js.Any.fromFunction0(cleanUp), spyOn = js.Any.fromFunction2(spyOn), wasPrevented = js.Any.fromFunction2(wasPrevented), wasStopped = js.Any.fromFunction2(wasStopped), wasTriggered = js.Any.fromFunction2(wasTriggered), wasTriggeredWith = js.Any.fromFunction4(wasTriggeredWith))
      __obj.asInstanceOf[JasmineJQueryEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JasmineJQueryEvents] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: (String, String) => Any): Self = StObject.set(x, "args", js.Any.fromFunction2(value))
      
      inline def setCleanUp(value: () => Unit): Self = StObject.set(x, "cleanUp", js.Any.fromFunction0(value))
      
      inline def setSpyOn(value: (String, String) => JQueryEventSpy): Self = StObject.set(x, "spyOn", js.Any.fromFunction2(value))
      
      inline def setWasPrevented(value: (String, String) => Boolean): Self = StObject.set(x, "wasPrevented", js.Any.fromFunction2(value))
      
      inline def setWasStopped(value: (String, String) => Boolean): Self = StObject.set(x, "wasStopped", js.Any.fromFunction2(value))
      
      inline def setWasTriggered(value: (String, String) => Boolean): Self = StObject.set(x, "wasTriggered", js.Any.fromFunction2(value))
      
      inline def setWasTriggeredWith(value: (String, String, Any, Env) => Boolean): Self = StObject.set(x, "wasTriggeredWith", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait Matchers[T] extends StObject {
    
    def toBe(selector: T): Unit = js.native
    
    /**
      * Only for tags that have checked attribute
      * @example
      * // returns true
      * expect($('<input type="checkbox" checked="checked"/>')).toBeChecked()
      */
    def toBeChecked(): Unit = js.native
    
    /**
      * Only for tags that have disabled attribute
      * @example
      * // returns true
      * expect('<input type="submit" disabled="disabled"/>').toBeDisabled()
      */
    def toBeDisabled(): Unit = js.native
    
    /**
      * Checks for child DOM elements or text
      */
    def toBeEmpty(): Unit = js.native
    
    /**
      * Check if DOM element is focused
      * @example
      * // returns true
      * expect($('<input type="text" />').focus()).toBeFocused()
      */
    def toBeFocused(): Unit = js.native
    
    /**
      * Check if DOM element is hidden.
      * Elements can be hidden for several reasons:
      * - They have a CSS display value of none ;
      * - They are form elements with type equal to hidden.
      * - Their width and height are explicitly set to 0.
      * - An ancestor element is hidden, so the element is not shown on the page.
      */
    def toBeHidden(): Unit = js.native
    
    /**
      * Checks to see if the matched element is attached to the DOM.
      * @example
      * expect($('#id-name')[0]).toBeInDOM()
      */
    def toBeInDOM(): Unit = js.native
    
    /**
      * Check to see if the set of matched elements matches the given selector
      *
      * @example
      * expect($('<span></span>').addClass('js-something')).toBeMatchedBy('.js-something')
      *
      * @returns {Boolean} true if DOM contains the element
      */
    def toBeMatchedBy(selector: String): Unit = js.native
    
    /**
      * Only for tags that have checked attribute
      *
      * @example
      * // returns true
      * expect($('<option selected="selected"></option>')).toBeSelected()
      */
    def toBeSelected(): Unit = js.native
    
    /**
      * Checks if DOM element is visible.
      * Elements are considered visible if they consume space in the document. Visible elements have a width or height that is greater than zero.
      */
    def toBeVisible(): Unit = js.native
    
    /**
      * Check if DOM element is matched by the given selector.
      *
      * @example
      * // returns true
      * expect($('<div><span class="some-class"></span></div>')).toContain('some-class')
      */
    def toContain(selector: Any): Unit = js.native
    
    /**
      * Check if DOM element exists inside the given parent element.
      *
      * @example
      * // returns true
      * expect($('<div><span class="some-class"></span></div>')).toContainElement('span.some-class')
      */
    def toContainElement(selector: String): Unit = js.native
    
    /**
      * Check if DOM element contains the specified HTML.
      *
      * @example
      * // returns true
      * expect($('<div><ul></ul><h1>header</h1></div>')).toContainHtml('<ul></ul>')
      */
    def toContainHtml(html: String): Unit = js.native
    
    /**
      * Check if DOM element contains the specified text.
      *
      * @example
      * // returns true
      * expect($('<div><ul></ul><h1>header</h1></div>')).toContainText('header')
      */
    def toContainText(text: String): Unit = js.native
    
    /**
      * Checks if element exists in or out the DOM.
      */
    def toExist(): Unit = js.native
    
    /**
      * Checks if DOM element handles event.
      *
      * @example
      * // returns true
      * expect($form).toHandle("submit")
      */
    def toHandle(eventName: String): Unit = js.native
    
    /**
      * Assigns a callback to an event of the DOM element.
      *
      * @param eventName Name of the event to assign the callback to.
      * @param eventHandler Callback function to be assigned.
      *
      * @example
      * expect($form).toHandleWith("submit", yourSubmitCallback)
      */
    def toHandleWith(eventName: String, eventHandler: JQueryCallback): Unit = js.native
    
    /**
      * Check if DOM element contains an attribute and, optionally, if the value of the attribute is equal to the expected one.
      *
      * @param attributeName Name of the attribute to check
      * @param expectedAttributeValue Expected attribute value
      */
    def toHaveAttr(attributeName: String): Unit = js.native
    def toHaveAttr(attributeName: String, expectedAttributeValue: Any): Unit = js.native
    
    /**
      * Checks if event propagation has been prevented.
      */
    def toHaveBeenPrevented(): Unit = js.native
    
    /**
      * Checks if event propagation has been prevented on element with selector.
      *
      * @param selector Selector that should have prevented the event.
      */
    def toHaveBeenPreventedOn(selector: String): Unit = js.native
    
    /**
      * Checks if event propagation has been stopped.
      *
      * @example
      * // returns true
      * var spyEvent = spyOnEvent('#some_element', 'click')
      * $('#some_element').click(function (event){event.stopPropagation();})
      * $('#some_element').click()
      * expect(spyEvent).toHaveBeenStopped()
      */
    def toHaveBeenStopped(): Unit = js.native
    
    /**
      * Checks if event propagation has been stopped by an element with the given selector.
      * @param selector Selector of the element that should have stopped the event propagation.
      *
      * @example
      * // returns true
      * $('#some_element').click(function (event){event.stopPropagation();})
      * $('#some_element').click()
      * expect('click').toHaveBeenStoppedOn('#some_element')
      */
    def toHaveBeenStoppedOn(selector: String): Unit = js.native
    
    /**
      * Checks if event was triggered.
      */
    def toHaveBeenTriggered(): Unit = js.native
    
    /**
      * Checks if the event has been triggered on selector.
      * @param selector Selector that should have triggered the event.
      */
    def toHaveBeenTriggeredOn(selector: String): Unit = js.native
    
    /**
      * Checks if the event has been triggered on selector.
      * @param selector Selector that should have triggered the event.
      * @param args Extra arguments to be passed to jQuery events functions.
      */
    def toHaveBeenTriggeredOnAndWith(selector: String, args: Any*): Unit = js.native
    
    /**
      * Check if DOM element has class.
      *
      * @param className Name of the class to check.
      *
      * @example
      * // returns true
      * expect($('<div class="some-class"></div>')).toHaveClass("some-class")
      */
    def toHaveClass(className: String): Unit = js.native
    
    /**
      * Check if DOM element has the given CSS properties.
      *
      * @param css Object containing the properties (and values) to check.
      *
      * @example
      * // returns true
      * expect($('<div style="display: none; margin: 10px;"></div>')).toHaveCss({display: "none", margin: "10px"})
      *
      * @example
      * // returns true
      * expect($('<div style="display: none; margin: 10px;"></div>')).toHaveCss({margin: "10px"})
      */
    def toHaveCss(css: Any): Unit = js.native
    
    /**
      * Check if DOM element has the given data.
      * This can only be applied for element on with jQuery data(key) can be called.
      *
      */
    def toHaveData(key: String, expectedValue: String): Unit = js.native
    
    /**
      * Check if DOM element has the specified HTML.
      *
      * @example
      * // returns true
      * expect($('<div><span></span></div>')).toHaveHtml('<span></span>')
      */
    def toHaveHtml(html: String): Unit = js.native
    
    /**
      * Check if DOM element has the given Id
      *
      * @param Id Expected identifier
      */
    def toHaveId(id: String): Unit = js.native
    
    /**
      * Checks if array has the given length.
      *
      * @param length Expected length
      */
    def toHaveLength(length: Double): Unit = js.native
    
    /**
      * Check if DOM element contains a property and, optionally, if the value of the property is equal to the expected one.
      *
      * @param propertyName Property name to check
      * @param expectedPropertyValue Expected property value
      */
    def toHaveProp(propertyName: String): Unit = js.native
    def toHaveProp(propertyName: String, expectedPropertyValue: Any): Unit = js.native
    
    /**
      * Check if DOM element has the given Text.
      * @param text Accepts a string or regular expression
      *
      * @example
      * // returns true
      * expect($('<div>some text</div>')).toHaveText('some text')
      */
    def toHaveText(text: String): Unit = js.native
    
    /**
      * Check if DOM element has the given value.
      * This can only be applied for element on with jQuery val() can be called.
      *
      * @example
      * // returns true
      * expect($('<input type="text" value="some text"/>')).toHaveValue('some text')
      */
    def toHaveValue(value: String): Unit = js.native
  }
  
  trait StyleFixtures extends StObject {
    
    def appendLoad(uls: String*): Unit
    
    def appendSet(html: String): Unit
    
    def cleanUp(): Unit
    
    def clearCache(): Unit
    
    def createStyle_(html: String): Unit
    
    var fixturesPath: String
    
    def getFixtureHtml_(url: String): String
    
    def load(uls: String*): Unit
    
    def loadFixtureIntoCache_(relativeUrl: String): Unit
    
    def makeFixtureUrl_(relativeUrl: String): String
    
    def preload(uls: String*): Unit
    
    def proxyCallTo_(methodName: String, passedArguments: Any): Any
    
    def read_(uls: String*): String
    
    def set(html: String): String
  }
  object StyleFixtures {
    
    inline def apply(
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
      proxyCallTo_ : (String, Any) => Any,
      read_ : /* repeated */ String => String,
      set: String => String
    ): StyleFixtures = {
      val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), createStyle_ = js.Any.fromFunction1(createStyle_), fixturesPath = fixturesPath.asInstanceOf[js.Any], getFixtureHtml_ = js.Any.fromFunction1(getFixtureHtml_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), makeFixtureUrl_ = js.Any.fromFunction1(makeFixtureUrl_), preload = js.Any.fromFunction1(preload), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read_ = js.Any.fromFunction1(read_), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[StyleFixtures]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleFixtures] (val x: Self) extends AnyVal {
      
      inline def setAppendLoad(value: /* repeated */ String => Unit): Self = StObject.set(x, "appendLoad", js.Any.fromFunction1(value))
      
      inline def setAppendSet(value: String => Unit): Self = StObject.set(x, "appendSet", js.Any.fromFunction1(value))
      
      inline def setCleanUp(value: () => Unit): Self = StObject.set(x, "cleanUp", js.Any.fromFunction0(value))
      
      inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      inline def setCreateStyle_(value: String => Unit): Self = StObject.set(x, "createStyle_", js.Any.fromFunction1(value))
      
      inline def setFixturesPath(value: String): Self = StObject.set(x, "fixturesPath", value.asInstanceOf[js.Any])
      
      inline def setGetFixtureHtml_(value: String => String): Self = StObject.set(x, "getFixtureHtml_", js.Any.fromFunction1(value))
      
      inline def setLoad(value: /* repeated */ String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadFixtureIntoCache_(value: String => Unit): Self = StObject.set(x, "loadFixtureIntoCache_", js.Any.fromFunction1(value))
      
      inline def setMakeFixtureUrl_(value: String => String): Self = StObject.set(x, "makeFixtureUrl_", js.Any.fromFunction1(value))
      
      inline def setPreload(value: /* repeated */ String => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction1(value))
      
      inline def setProxyCallTo_(value: (String, Any) => Any): Self = StObject.set(x, "proxyCallTo_", js.Any.fromFunction2(value))
      
      inline def setRead_(value: /* repeated */ String => String): Self = StObject.set(x, "read_", js.Any.fromFunction1(value))
      
      inline def setSet(value: String => String): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
}
