package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONFormatterOptions extends StObject {
  
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var indentation: js.UndefOr[Double] = js.undefined
}
object JSONFormatterOptions {
  
  @scala.inline
  def apply(): JSONFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONFormatterOptions]
  }
  
  @scala.inline
  implicit class JSONFormatterOptionsMutableBuilder[Self <: JSONFormatterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: () => Unit): Self = StObject.set(x, "change", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
  }
}
