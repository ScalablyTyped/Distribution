package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fixed extends StObject {
  
  var fixed: js.UndefOr[String] = js.undefined
  
  var length: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var options: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var regexp: js.UndefOr[js.Object] = js.undefined
  
  var restrictToOptions: js.UndefOr[Boolean] = js.undefined
}
object Fixed {
  
  inline def apply(): Fixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fixed]
  }
  
  extension [Self <: Fixed](x: Self) {
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setLength(value: Double | js.Array[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLengthVarargs(value: Double*): Self = StObject.set(x, "length", js.Array(value*))
    
    inline def setOptions(value: js.Array[Double | String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: (Double | String)*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRegexp(value: js.Object): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    inline def setRestrictToOptions(value: Boolean): Self = StObject.set(x, "restrictToOptions", value.asInstanceOf[js.Any])
    
    inline def setRestrictToOptionsUndefined: Self = StObject.set(x, "restrictToOptions", js.undefined)
  }
}
