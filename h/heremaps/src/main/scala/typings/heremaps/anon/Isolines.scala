package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Isolines extends StObject {
  
  var MetaInfo: Timestamp
  
  var View: js.Array[Result]
  
  var isolines: js.Array[js.Any]
}
object Isolines {
  
  inline def apply(MetaInfo: Timestamp, View: js.Array[Result], isolines: js.Array[js.Any]): Isolines = {
    val __obj = js.Dynamic.literal(MetaInfo = MetaInfo.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], isolines = isolines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isolines]
  }
  
  extension [Self <: Isolines](x: Self) {
    
    inline def setIsolines(value: js.Array[js.Any]): Self = StObject.set(x, "isolines", value.asInstanceOf[js.Any])
    
    inline def setIsolinesVarargs(value: js.Any*): Self = StObject.set(x, "isolines", js.Array(value :_*))
    
    inline def setMetaInfo(value: Timestamp): Self = StObject.set(x, "MetaInfo", value.asInstanceOf[js.Any])
    
    inline def setView(value: js.Array[Result]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewVarargs(value: Result*): Self = StObject.set(x, "View", js.Array(value :_*))
  }
}
