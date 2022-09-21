package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMethod extends StObject {
  
  /**
    * The simple name of this method.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Any metadata attached to the method.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.undefined
  
  /**
    * If true, the request is streamed.
    */
  var requestStreaming: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A URL of the input message type.
    */
  var requestTypeUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the response is streamed.
    */
  var responseStreaming: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The URL of the output message type.
    */
  var responseTypeUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source syntax of this method.
    */
  var syntax: js.UndefOr[String | Null] = js.undefined
}
object SchemaMethod {
  
  inline def apply(): SchemaMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMethod]
  }
  
  extension [Self <: SchemaMethod](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRequestStreaming(value: Boolean): Self = StObject.set(x, "requestStreaming", value.asInstanceOf[js.Any])
    
    inline def setRequestStreamingNull: Self = StObject.set(x, "requestStreaming", null)
    
    inline def setRequestStreamingUndefined: Self = StObject.set(x, "requestStreaming", js.undefined)
    
    inline def setRequestTypeUrl(value: String): Self = StObject.set(x, "requestTypeUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUrlNull: Self = StObject.set(x, "requestTypeUrl", null)
    
    inline def setRequestTypeUrlUndefined: Self = StObject.set(x, "requestTypeUrl", js.undefined)
    
    inline def setResponseStreaming(value: Boolean): Self = StObject.set(x, "responseStreaming", value.asInstanceOf[js.Any])
    
    inline def setResponseStreamingNull: Self = StObject.set(x, "responseStreaming", null)
    
    inline def setResponseStreamingUndefined: Self = StObject.set(x, "responseStreaming", js.undefined)
    
    inline def setResponseTypeUrl(value: String): Self = StObject.set(x, "responseTypeUrl", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUrlNull: Self = StObject.set(x, "responseTypeUrl", null)
    
    inline def setResponseTypeUrlUndefined: Self = StObject.set(x, "responseTypeUrl", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxNull: Self = StObject.set(x, "syntax", null)
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
