package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fixed extends StObject {
  
  var fixed: js.UndefOr[String] = js.native
  
  var length: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var options: js.UndefOr[js.Array[Double | String]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var regexp: js.UndefOr[js.Object] = js.native
}
object Fixed {
  
  @scala.inline
  def apply(): Fixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fixed]
  }
  
  @scala.inline
  implicit class FixedMutableBuilder[Self <: Fixed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setLength(value: Double | js.Array[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLengthVarargs(value: Double*): Self = StObject.set(x, "length", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Double | String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: (Double | String)*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRegexp(value: js.Object): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
  }
}
