package typings.hapi.anon

import typings.hapi.hapiStrings.`private`
import typings.hapi.hapiStrings.default
import typings.hapi.hapiStrings.public
import typings.hapi.mod.RouteOptionsCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  expiresIn :number | undefined,   expiresAt :undefined} & {  privacy :'default' | 'public' | 'private' | undefined,   statuses :std.Array<number> | undefined,   otherwise :string | undefined} */
trait expiresInnumberundefinede
  extends StObject
     with RouteOptionsCache {
  
  var expiresAt: Unit
  
  var expiresIn: js.UndefOr[Double] = js.undefined
  
  var otherwise: js.UndefOr[String] = js.undefined
  
  var privacy: js.UndefOr[default | public | `private`] = js.undefined
  
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
}
object expiresInnumberundefinede {
  
  inline def apply(expiresAt: Unit): expiresInnumberundefinede = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[expiresInnumberundefinede]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: expiresInnumberundefinede] (val x: Self) extends AnyVal {
    
    inline def setExpiresAt(value: Unit): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setOtherwise(value: String): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    inline def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    inline def setPrivacy(value: default | public | `private`): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setStatuses(value: js.Array[Double]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: Double*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
