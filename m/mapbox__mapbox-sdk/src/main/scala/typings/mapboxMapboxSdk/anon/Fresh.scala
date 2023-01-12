package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fresh extends StObject {
  
  var fresh: js.UndefOr[Boolean] = js.undefined
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
}
object Fresh {
  
  inline def apply(): Fresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fresh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fresh] (val x: Self) extends AnyVal {
    
    inline def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
    
    inline def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
