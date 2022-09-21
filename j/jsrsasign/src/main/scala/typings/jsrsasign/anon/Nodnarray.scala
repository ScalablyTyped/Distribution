package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodnarray extends StObject {
  
  var nodnarray: js.UndefOr[Boolean] = js.undefined
  
  var tbshex: js.UndefOr[Boolean] = js.undefined
}
object Nodnarray {
  
  inline def apply(): Nodnarray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nodnarray]
  }
  
  extension [Self <: Nodnarray](x: Self) {
    
    inline def setNodnarray(value: Boolean): Self = StObject.set(x, "nodnarray", value.asInstanceOf[js.Any])
    
    inline def setNodnarrayUndefined: Self = StObject.set(x, "nodnarray", js.undefined)
    
    inline def setTbshex(value: Boolean): Self = StObject.set(x, "tbshex", value.asInstanceOf[js.Any])
    
    inline def setTbshexUndefined: Self = StObject.set(x, "tbshex", js.undefined)
  }
}
