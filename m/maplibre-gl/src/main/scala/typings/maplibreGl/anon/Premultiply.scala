package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Premultiply extends StObject {
  
  var premultiply: js.UndefOr[Boolean] = js.undefined
  
  var useMipmap: js.UndefOr[Boolean] = js.undefined
}
object Premultiply {
  
  inline def apply(): Premultiply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Premultiply]
  }
  
  extension [Self <: Premultiply](x: Self) {
    
    inline def setPremultiply(value: Boolean): Self = StObject.set(x, "premultiply", value.asInstanceOf[js.Any])
    
    inline def setPremultiplyUndefined: Self = StObject.set(x, "premultiply", js.undefined)
    
    inline def setUseMipmap(value: Boolean): Self = StObject.set(x, "useMipmap", value.asInstanceOf[js.Any])
    
    inline def setUseMipmapUndefined: Self = StObject.set(x, "useMipmap", js.undefined)
  }
}
