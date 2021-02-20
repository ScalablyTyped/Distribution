package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlushOnEnd extends StObject {
  
  var flushOnEnd: Boolean = js.native
}
object FlushOnEnd {
  
  @scala.inline
  def apply(flushOnEnd: Boolean): FlushOnEnd = {
    val __obj = js.Dynamic.literal(flushOnEnd = flushOnEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushOnEnd]
  }
  
  @scala.inline
  implicit class FlushOnEndMutableBuilder[Self <: FlushOnEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlushOnEnd(value: Boolean): Self = StObject.set(x, "flushOnEnd", value.asInstanceOf[js.Any])
  }
}
