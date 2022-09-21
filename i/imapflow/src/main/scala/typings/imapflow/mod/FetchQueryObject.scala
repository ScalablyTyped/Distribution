package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchQueryObject extends StObject {
  
  var bodyParts: js.UndefOr[js.Array[String]] = js.undefined
  
  var bodyStructure: js.UndefOr[Boolean] = js.undefined
  
  var envelope: js.UndefOr[Boolean] = js.undefined
  
  var flags: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var internalDate: js.UndefOr[Boolean] = js.undefined
  
  var labels: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[Boolean | js.Object] = js.undefined
  
  var threadId: js.UndefOr[String] = js.undefined
  
  var uid: js.UndefOr[Boolean] = js.undefined
}
object FetchQueryObject {
  
  inline def apply(): FetchQueryObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchQueryObject]
  }
  
  extension [Self <: FetchQueryObject](x: Self) {
    
    inline def setBodyParts(value: js.Array[String]): Self = StObject.set(x, "bodyParts", value.asInstanceOf[js.Any])
    
    inline def setBodyPartsUndefined: Self = StObject.set(x, "bodyParts", js.undefined)
    
    inline def setBodyPartsVarargs(value: String*): Self = StObject.set(x, "bodyParts", js.Array(value*))
    
    inline def setBodyStructure(value: Boolean): Self = StObject.set(x, "bodyStructure", value.asInstanceOf[js.Any])
    
    inline def setBodyStructureUndefined: Self = StObject.set(x, "bodyStructure", js.undefined)
    
    inline def setEnvelope(value: Boolean): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
    
    inline def setFlags(value: Boolean): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setHeaders(value: Boolean | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setInternalDate(value: Boolean): Self = StObject.set(x, "internalDate", value.asInstanceOf[js.Any])
    
    inline def setInternalDateUndefined: Self = StObject.set(x, "internalDate", js.undefined)
    
    inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSource(value: Boolean | js.Object): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
    
    inline def setUid(value: Boolean): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
