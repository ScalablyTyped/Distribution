package typings.hlsParser.anon

import typings.hlsParser.mod.types.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discontinuity extends StObject {
  
  var discontinuity: js.UndefOr[Boolean] = js.undefined
  
  var discontinuitySequence: Double
  
  var key: js.UndefOr[Key] = js.undefined
  
  var mediaSequenceNumber: Double
  
  var uri: String
}
object Discontinuity {
  
  inline def apply(discontinuitySequence: Double, mediaSequenceNumber: Double, uri: String): Discontinuity = {
    val __obj = js.Dynamic.literal(discontinuitySequence = discontinuitySequence.asInstanceOf[js.Any], mediaSequenceNumber = mediaSequenceNumber.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discontinuity]
  }
  
  extension [Self <: Discontinuity](x: Self) {
    
    inline def setDiscontinuity(value: Boolean): Self = StObject.set(x, "discontinuity", value.asInstanceOf[js.Any])
    
    inline def setDiscontinuitySequence(value: Double): Self = StObject.set(x, "discontinuitySequence", value.asInstanceOf[js.Any])
    
    inline def setDiscontinuityUndefined: Self = StObject.set(x, "discontinuity", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMediaSequenceNumber(value: Double): Self = StObject.set(x, "mediaSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
