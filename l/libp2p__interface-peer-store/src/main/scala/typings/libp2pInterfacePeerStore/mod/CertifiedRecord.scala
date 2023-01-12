package typings.libp2pInterfacePeerStore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertifiedRecord extends StObject {
  
  var raw: js.typedarray.Uint8Array
  
  var seqNumber: Double
}
object CertifiedRecord {
  
  inline def apply(raw: js.typedarray.Uint8Array, seqNumber: Double): CertifiedRecord = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], seqNumber = seqNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertifiedRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertifiedRecord] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: js.typedarray.Uint8Array): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setSeqNumber(value: Double): Self = StObject.set(x, "seqNumber", value.asInstanceOf[js.Any])
  }
}
