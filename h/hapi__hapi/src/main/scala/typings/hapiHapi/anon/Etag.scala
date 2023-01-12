package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Etag extends StObject {
  
  var etag: js.UndefOr[String] = js.undefined
  
  var modified: js.UndefOr[String] = js.undefined
  
  var vary: js.UndefOr[Boolean] = js.undefined
}
object Etag {
  
  inline def apply(): Etag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Etag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Etag] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setVary(value: Boolean): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
    
    inline def setVaryUndefined: Self = StObject.set(x, "vary", js.undefined)
  }
}
