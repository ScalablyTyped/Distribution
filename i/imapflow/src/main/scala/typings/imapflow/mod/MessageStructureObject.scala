package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageStructureObject extends StObject {
  
  var childNodes: js.Array[MessageStructureObject]
  
  var disposition: String
  
  var dispositionParameters: String
  
  var encoding: String
  
  var envelope: MessageEnvelopeObject
  
  var id: String
  
  var parameters: String
  
  var part: String
  
  var size: Double
  
  var `type`: String
}
object MessageStructureObject {
  
  inline def apply(
    childNodes: js.Array[MessageStructureObject],
    disposition: String,
    dispositionParameters: String,
    encoding: String,
    envelope: MessageEnvelopeObject,
    id: String,
    parameters: String,
    part: String,
    size: Double,
    `type`: String
  ): MessageStructureObject = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], disposition = disposition.asInstanceOf[js.Any], dispositionParameters = dispositionParameters.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStructureObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageStructureObject] (val x: Self) extends AnyVal {
    
    inline def setChildNodes(value: js.Array[MessageStructureObject]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setChildNodesVarargs(value: MessageStructureObject*): Self = StObject.set(x, "childNodes", js.Array(value*))
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionParameters(value: String): Self = StObject.set(x, "dispositionParameters", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEnvelope(value: MessageEnvelopeObject): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
