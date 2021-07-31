package typings.karmaChaiSinon

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.AssertStatic
import typings.chai.Chai.ExpectStatic
import typings.chai.Chai.Should
import typings.sinon.mod.Document
import typings.sinon.mod.SinonFakeUploadProgress
import typings.sinon.mod.SinonFakeXMLHttpRequest
import typings.sinon.mod.SinonStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("assert")
    @js.native
    def assert: AssertStatic = js.native
    @scala.inline
    def assert_=(x: AssertStatic): Unit = js.Dynamic.global.updateDynamic("assert")(x.asInstanceOf[js.Any])
    
    @JSGlobal("expect")
    @js.native
    def expect: ExpectStatic = js.native
    @scala.inline
    def expect_=(x: ExpectStatic): Unit = js.Dynamic.global.updateDynamic("expect")(x.asInstanceOf[js.Any])
    
    @JSGlobal("should")
    @js.native
    def should: Should = js.native
    @scala.inline
    def should_=(x: Should): Unit = js.Dynamic.global.updateDynamic("should")(x.asInstanceOf[js.Any])
    
    object sinon extends Shortcut {
      
      @JSGlobal("sinon")
      @js.native
      val ^ : js.Object & SinonStatic = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sinon.FakeXMLHttpRequest")
      @js.native
      class FakeXMLHttpRequest ()
        extends StObject
           with SinonFakeXMLHttpRequest {
        
        /**
          * Whether or not the request is asynchronous.
          */
        /* CompleteClass */
        var async: Boolean = js.native
        
        /* CompleteClass */
        override def autoRespond(ms: Double): Unit = js.native
        
        /**
          * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
          */
        /* CompleteClass */
        override def error(): Unit = js.native
        
        /**
          * All response headers as an object.
          */
        /* CompleteClass */
        override def getAllResponseHeaders(): js.Any = js.native
        
        /**
          * The value of the given response header, if the request has been responded to (see respond).
          * @param header
          */
        /* CompleteClass */
        override def getResponseHeader(header: String): String = js.native
        
        /**
          * The request method as a string.
          */
        /* CompleteClass */
        var method: String = js.native
        
        /* CompleteClass */
        override def onerror(): Unit = js.native
        
        /**
          * Password, if any.
          */
        /* CompleteClass */
        var password: String = js.native
        
        /**
          * The request body
          */
        /* CompleteClass */
        var requestBody: String = js.native
        
        /**
          * An object of all request headers, i.e.:
          */
        /* CompleteClass */
        var requestHeaders: js.Any = js.native
        
        /**
          * Calls the above three methods.
          */
        /* CompleteClass */
        override def respond(status: Double, headers: js.Any, body: String): Unit = js.native
        
        /**
          * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
          */
        /* CompleteClass */
        var responseXML: Document = js.native
        
        /**
          * Sets the respond body, updates the readyState property and fires onreadystatechange.
          * Additionally, populates responseXML with a parsed document if response headers indicate as much.
          */
        /* CompleteClass */
        override def setResponseBody(body: String): Unit = js.native
        
        // Methods
        /**
          * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
          * @param headers
          */
        /* CompleteClass */
        override def setResponseHeaders(headers: js.Any): Unit = js.native
        
        /**
          * The request’s status code.
          * undefined if the request has not been handled (see respond below)
          */
        /* CompleteClass */
        var status: Double = js.native
        
        /**
          * Only populated if the respond method is called (see below).
          */
        /* CompleteClass */
        var statusText: String = js.native
        
        /* CompleteClass */
        var upload: SinonFakeUploadProgress = js.native
        
        // Properties
        /**
          * The URL set on the request object.
          */
        /* CompleteClass */
        var url: String = js.native
        
        /**
          * Username, if any.
          */
        /* CompleteClass */
        var username: String = js.native
        
        /* CompleteClass */
        var withCredentials: Boolean = js.native
      }
      
      type _To = js.Object & SinonStatic
      
      /* This means you don't have to write `^`, but can instead just say `sinon.foo` */
      override def _to: js.Object & SinonStatic = ^
    }
  }
}
