package typings.httpStringParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-string-parser", "parseHeaders")
  @js.native
  def parseHeaders(headerLines: js.Array[String]): StringDictionary[String] = js.native
  
  @JSImport("http-string-parser", "parseRequest")
  @js.native
  def parseRequest(requestString: String): ParseRequestResult = js.native
  
  @JSImport("http-string-parser", "parseRequestLine")
  @js.native
  def parseRequestLine(requestLineString: String): ParseRequestLineResult = js.native
  
  @JSImport("http-string-parser", "parseResponse")
  @js.native
  def parseResponse(responseString: String): ParseResponseResult = js.native
  
  @JSImport("http-string-parser", "parseStatusLine")
  @js.native
  def parseStatusLine(statusLine: String): ParseStatusLineResult = js.native
  
  @js.native
  trait ParseRequestLineResult extends StObject {
    
    var method: String = js.native
    
    var protocol: String = js.native
    
    var uri: String = js.native
  }
  object ParseRequestLineResult {
    
    @scala.inline
    def apply(method: String, protocol: String, uri: String): ParseRequestLineResult = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseRequestLineResult]
    }
    
    @scala.inline
    implicit class ParseRequestLineResultMutableBuilder[Self <: ParseRequestLineResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseRequestResult extends StObject {
    
    var body: String = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var method: String = js.native
    
    var uri: String = js.native
  }
  object ParseRequestResult {
    
    @scala.inline
    def apply(body: String, headers: StringDictionary[String], method: String, uri: String): ParseRequestResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseRequestResult]
    }
    
    @scala.inline
    implicit class ParseRequestResultMutableBuilder[Self <: ParseRequestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseResponseResult extends StObject {
    
    var body: String = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var statusCode: String = js.native
    
    var statusMessage: String = js.native
  }
  object ParseResponseResult {
    
    @scala.inline
    def apply(body: String, headers: StringDictionary[String], statusCode: String, statusMessage: String): ParseResponseResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResponseResult]
    }
    
    @scala.inline
    implicit class ParseResponseResultMutableBuilder[Self <: ParseResponseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseStatusLineResult extends StObject {
    
    var protocol: String = js.native
    
    var statusCode: String = js.native
    
    var statusMessage: String = js.native
  }
  object ParseStatusLineResult {
    
    @scala.inline
    def apply(protocol: String, statusCode: String, statusMessage: String): ParseStatusLineResult = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseStatusLineResult]
    }
    
    @scala.inline
    implicit class ParseStatusLineResultMutableBuilder[Self <: ParseStatusLineResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
}
