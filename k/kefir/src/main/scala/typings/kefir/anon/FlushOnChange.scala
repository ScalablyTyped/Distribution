package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlushOnChange extends StObject {
  
  var flushOnChange: js.UndefOr[Boolean] = js.native
  
  var flushOnEnd: js.UndefOr[Boolean] = js.native
}
object FlushOnChange {
  
  @scala.inline
  def apply(): FlushOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlushOnChange]
  }
  
  @scala.inline
  implicit class FlushOnChangeMutableBuilder[Self <: FlushOnChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlushOnChange(value: Boolean): Self = StObject.set(x, "flushOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushOnChangeUndefined: Self = StObject.set(x, "flushOnChange", js.undefined)
    
    @scala.inline
    def setFlushOnEnd(value: Boolean): Self = StObject.set(x, "flushOnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushOnEndUndefined: Self = StObject.set(x, "flushOnEnd", js.undefined)
  }
}
