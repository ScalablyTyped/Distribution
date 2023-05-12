package typings.libp2p.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/fetch/pb/proto.FetchRequest> */
trait PartialFetchRequest extends StObject {
  
  var identifier: js.UndefOr[String] = js.undefined
}
object PartialFetchRequest {
  
  inline def apply(): PartialFetchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFetchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFetchRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
  }
}
