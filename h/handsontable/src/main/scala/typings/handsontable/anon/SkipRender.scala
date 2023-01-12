package typings.handsontable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipRender extends StObject {
  
  var skipRender: js.UndefOr[Boolean] = js.undefined
}
object SkipRender {
  
  inline def apply(): SkipRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipRender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkipRender] (val x: Self) extends AnyVal {
    
    inline def setSkipRender(value: Boolean): Self = StObject.set(x, "skipRender", value.asInstanceOf[js.Any])
    
    inline def setSkipRenderUndefined: Self = StObject.set(x, "skipRender", js.undefined)
  }
}
