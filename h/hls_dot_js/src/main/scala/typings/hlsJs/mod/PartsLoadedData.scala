package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartsLoadedData extends StObject {
  
  var frag: Fragment
  
  var part: Part | Null
  
  var partsLoaded: js.UndefOr[js.Array[FragLoadedData]] = js.undefined
}
object PartsLoadedData {
  
  inline def apply(frag: Fragment): PartsLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], part = null)
    __obj.asInstanceOf[PartsLoadedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartsLoadedData] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
    
    inline def setPartsLoaded(value: js.Array[FragLoadedData]): Self = StObject.set(x, "partsLoaded", value.asInstanceOf[js.Any])
    
    inline def setPartsLoadedUndefined: Self = StObject.set(x, "partsLoaded", js.undefined)
    
    inline def setPartsLoadedVarargs(value: FragLoadedData*): Self = StObject.set(x, "partsLoaded", js.Array(value*))
  }
}
