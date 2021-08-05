package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Method represents a method of an API interface.
  */
trait SchemaMethod extends StObject {
  
  /**
    * The simple name of this method.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Any metadata attached to the method.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.undefined
  
  /**
    * If true, the request is streamed.
    */
  var requestStreaming: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A URL of the input message type.
    */
  var requestTypeUrl: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the response is streamed.
    */
  var responseStreaming: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL of the output message type.
    */
  var responseTypeUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The source syntax of this method.
    */
  var syntax: js.UndefOr[String] = js.undefined
}
object SchemaMethod {
  
  inline def apply(): SchemaMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMethod]
  }
  
  extension [Self <: SchemaMethod](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setRequestStreaming(value: Boolean): Self = StObject.set(x, "requestStreaming", value.asInstanceOf[js.Any])
    
    inline def setRequestStreamingUndefined: Self = StObject.set(x, "requestStreaming", js.undefined)
    
    inline def setRequestTypeUrl(value: String): Self = StObject.set(x, "requestTypeUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUrlUndefined: Self = StObject.set(x, "requestTypeUrl", js.undefined)
    
    inline def setResponseStreaming(value: Boolean): Self = StObject.set(x, "responseStreaming", value.asInstanceOf[js.Any])
    
    inline def setResponseStreamingUndefined: Self = StObject.set(x, "responseStreaming", js.undefined)
    
    inline def setResponseTypeUrl(value: String): Self = StObject.set(x, "responseTypeUrl", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUrlUndefined: Self = StObject.set(x, "responseTypeUrl", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
