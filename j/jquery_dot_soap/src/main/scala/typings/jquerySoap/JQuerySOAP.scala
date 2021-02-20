package typings.jquerySoap

import typings.jquery.JQueryXHR
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQuerySOAP {
  
  @js.native
  trait Options extends StObject {
    
    var HTTPHeaders: js.UndefOr[js.Object] = js.native
    
    var SOAPAction: js.UndefOr[String] = js.native
    
    var SOAPHeader: js.UndefOr[js.Object] = js.native
    
    var appendMethodToURL: js.UndefOr[Boolean] = js.native
    
    var async: js.UndefOr[Boolean] = js.native
    
    var beforeSend: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, Unit]] = js.native
    
    var context: js.UndefOr[js.Any] = js.native
    
    var data: js.UndefOr[js.Object] = js.native
    
    var elementName: js.UndefOr[String] = js.native
    
    var enableLogging: js.UndefOr[Boolean] = js.native
    
    var envAttributes: js.UndefOr[js.Any] = js.native
    
    var error: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, Unit]] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var namespaceQualifier: js.UndefOr[String] = js.native
    
    var namespaceURL: js.UndefOr[String] = js.native
    
    var noPrefix: js.UndefOr[Boolean] = js.native
    
    var request: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, Unit]] = js.native
    
    var soap12: js.UndefOr[Boolean] = js.native
    
    var statusCode: js.UndefOr[js.Object] = js.native
    
    var success: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, Unit]] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var wss: js.UndefOr[js.Object] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendMethodToURL(value: Boolean): Self = StObject.set(x, "appendMethodToURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendMethodToURLUndefined: Self = StObject.set(x, "appendMethodToURL", js.undefined)
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setBeforeSend(value: /* SOAPEnvelope */ SOAPEnvelope => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setElementName(value: String): Self = StObject.set(x, "elementName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementNameUndefined: Self = StObject.set(x, "elementName", js.undefined)
      
      @scala.inline
      def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
      
      @scala.inline
      def setEnvAttributes(value: js.Any): Self = StObject.set(x, "envAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvAttributesUndefined: Self = StObject.set(x, "envAttributes", js.undefined)
      
      @scala.inline
      def setError(value: /* SOAPResponse */ SOAPResponse => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHTTPHeaders(value: js.Object): Self = StObject.set(x, "HTTPHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTTPHeadersUndefined: Self = StObject.set(x, "HTTPHeaders", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setNamespaceQualifier(value: String): Self = StObject.set(x, "namespaceQualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceQualifierUndefined: Self = StObject.set(x, "namespaceQualifier", js.undefined)
      
      @scala.inline
      def setNamespaceURL(value: String): Self = StObject.set(x, "namespaceURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceURLUndefined: Self = StObject.set(x, "namespaceURL", js.undefined)
      
      @scala.inline
      def setNoPrefix(value: Boolean): Self = StObject.set(x, "noPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPrefixUndefined: Self = StObject.set(x, "noPrefix", js.undefined)
      
      @scala.inline
      def setRequest(value: /* SOAPEnvelope */ SOAPEnvelope => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setSOAPAction(value: String): Self = StObject.set(x, "SOAPAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOAPActionUndefined: Self = StObject.set(x, "SOAPAction", js.undefined)
      
      @scala.inline
      def setSOAPHeader(value: js.Object): Self = StObject.set(x, "SOAPHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOAPHeaderUndefined: Self = StObject.set(x, "SOAPHeader", js.undefined)
      
      @scala.inline
      def setSoap12(value: Boolean): Self = StObject.set(x, "soap12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoap12Undefined: Self = StObject.set(x, "soap12", js.undefined)
      
      @scala.inline
      def setStatusCode(value: js.Object): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setSuccess(value: /* SOAPResponse */ SOAPResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWss(value: js.Object): Self = StObject.set(x, "wss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWssUndefined: Self = StObject.set(x, "wss", js.undefined)
    }
  }
  
  type SOAP = js.Function1[/* options */ js.UndefOr[Options], JQueryXHR]
  
  @js.native
  trait SOAPEnvelope extends StObject {
    
    def addAttribute(name: String, value: String): Unit = js.native
    def addAttribute(name: String, value: Double): Unit = js.native
    
    def addBody(soapObject: SOAPObject): Unit = js.native
    
    def addHeader(soapObject: SOAPObject): Unit = js.native
    
    def addNamespace(name: String, uri: String): Unit = js.native
    
    var attributes: js.Object = js.native
    
    var bodies: js.Array[SOAPObject] = js.native
    
    var headers: js.Array[SOAPObject] = js.native
    
    var prefix: String = js.native
    
    def send(options: Options): Unit = js.native
    
    var soapConfig: js.Any = js.native
    
    var typeOf: String = js.native
  }
  
  @js.native
  trait SOAPObject extends StObject {
    
    var _parent: SOAPObject = js.native
    
    def addNamespace(name: String, url: String): Unit = js.native
    
    def addParameter(name: String, value: String): Unit = js.native
    def addParameter(name: String, value: Double): Unit = js.native
    
    def appendChild(soapObject: SOAPObject): SOAPObject = js.native
    
    def attr(name: String, value: String): js.Object = js.native
    def attr(name: String, value: Double): js.Object = js.native
    
    var attributes: js.Object = js.native
    
    var children: js.Array[SOAPObject] = js.native
    
    def end(): SOAPObject = js.native
    
    def find(name: String): SOAPObject = js.native
    
    def hasChildren(): Boolean = js.native
    
    var name: String = js.native
    
    def newChild(name: String): SOAPObject = js.native
    
    var ns: js.Object = js.native
    
    def parent(): SOAPObject = js.native
    
    var typeOf: String = js.native
    
    def `val`(value: String): SOAPObject = js.native
    def `val`(value: Double): SOAPObject = js.native
    
    var value: js.Any = js.native
  }
  
  @js.native
  trait SOAPResponse extends StObject {
    
    def toJSON(): js.Any = js.native
    
    def toXML(): XMLDocument = js.native
  }
  object SOAPResponse {
    
    @scala.inline
    def apply(toJSON: () => js.Any, toXML: () => XMLDocument): SOAPResponse = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), toXML = js.Any.fromFunction0(toXML))
      __obj.asInstanceOf[SOAPResponse]
    }
    
    @scala.inline
    implicit class SOAPResponseMutableBuilder[Self <: SOAPResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToXML(value: () => XMLDocument): Self = StObject.set(x, "toXML", js.Any.fromFunction0(value))
    }
  }
}
