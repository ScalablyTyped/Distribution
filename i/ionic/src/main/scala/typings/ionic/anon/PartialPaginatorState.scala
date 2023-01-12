package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.PaginatorState> */
trait PartialPaginatorState extends StObject {
  
  var done: js.UndefOr[Boolean] = js.undefined
  
  var loaded: js.UndefOr[Double] = js.undefined
}
object PartialPaginatorState {
  
  inline def apply(): PartialPaginatorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginatorState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaginatorState] (val x: Self) extends AnyVal {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
  }
}
