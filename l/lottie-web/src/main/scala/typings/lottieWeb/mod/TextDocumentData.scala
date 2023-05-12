package typings.lottieWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentData extends StObject {
  
  var ca: js.UndefOr[Double] = js.undefined
  
  var f: js.UndefOr[String] = js.undefined
  
  var fc: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  
  var j: js.UndefOr[Double] = js.undefined
  
  var lh: js.UndefOr[Double] = js.undefined
  
  var ls: js.UndefOr[Double] = js.undefined
  
  var s: js.UndefOr[Double] = js.undefined
  
  var t: js.UndefOr[String] = js.undefined
  
  var tr: js.UndefOr[Double] = js.undefined
}
object TextDocumentData {
  
  inline def apply(): TextDocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDocumentData] (val x: Self) extends AnyVal {
    
    inline def setCa(value: Double): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    inline def setFc(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    inline def setFcUndefined: Self = StObject.set(x, "fc", js.undefined)
    
    inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    inline def setLh(value: Double): Self = StObject.set(x, "lh", value.asInstanceOf[js.Any])
    
    inline def setLhUndefined: Self = StObject.set(x, "lh", js.undefined)
    
    inline def setLs(value: Double): Self = StObject.set(x, "ls", value.asInstanceOf[js.Any])
    
    inline def setLsUndefined: Self = StObject.set(x, "ls", js.undefined)
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setTr(value: Double): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
  }
}
