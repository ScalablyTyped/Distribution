package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Carousel, 'prev'> */
@js.native
trait PickCarouselprev extends StObject {
  
  var prev: js.UndefOr[js.Any] = js.native
}
object PickCarouselprev {
  
  @scala.inline
  def apply(): PickCarouselprev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCarouselprev]
  }
  
  @scala.inline
  implicit class PickCarouselprevMutableBuilder[Self <: PickCarouselprev] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrev(value: js.Any): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
  }
}
