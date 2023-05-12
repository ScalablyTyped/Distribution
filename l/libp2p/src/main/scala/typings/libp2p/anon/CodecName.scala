package typings.libp2p.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodecName extends StObject {
  
  var codecName: js.UndefOr[String] = js.undefined
  
  var psk: js.typedarray.Uint8Array
  
  var tag: js.UndefOr[String] = js.undefined
}
object CodecName {
  
  inline def apply(psk: js.typedarray.Uint8Array): CodecName = {
    val __obj = js.Dynamic.literal(psk = psk.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodecName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodecName] (val x: Self) extends AnyVal {
    
    inline def setCodecName(value: String): Self = StObject.set(x, "codecName", value.asInstanceOf[js.Any])
    
    inline def setCodecNameUndefined: Self = StObject.set(x, "codecName", js.undefined)
    
    inline def setPsk(value: js.typedarray.Uint8Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
