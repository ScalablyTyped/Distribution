package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seriesmembership extends StObject {
  
  /** Resorce type. */
  var kind: js.UndefOr[String] = js.undefined
  
  var member: js.UndefOr[js.Array[Volume]] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object Seriesmembership {
  
  inline def apply(): Seriesmembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seriesmembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Seriesmembership] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMember(value: js.Array[Volume]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setMemberVarargs(value: Volume*): Self = StObject.set(x, "member", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
