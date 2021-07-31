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
  
  @scala.inline
  def apply(): Seriesmembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seriesmembership]
  }
  
  @scala.inline
  implicit class SeriesmembershipMutableBuilder[Self <: Seriesmembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMember(value: js.Array[Volume]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setMemberVarargs(value: Volume*): Self = StObject.set(x, "member", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
