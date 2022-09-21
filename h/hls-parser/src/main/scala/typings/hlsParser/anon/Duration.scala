package typings.hlsParser.anon

import typings.hlsParser.mod.types.ByteRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var byterange: js.UndefOr[ByteRange] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var gap: js.UndefOr[Boolean] = js.undefined
  
  var hint: js.UndefOr[Boolean] = js.undefined
  
  var independent: js.UndefOr[Boolean] = js.undefined
  
  var uri: String
}
object Duration {
  
  inline def apply(uri: String): Duration = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setByterange(value: ByteRange): Self = StObject.set(x, "byterange", value.asInstanceOf[js.Any])
    
    inline def setByterangeUndefined: Self = StObject.set(x, "byterange", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setGap(value: Boolean): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setHint(value: Boolean): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
    
    inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
