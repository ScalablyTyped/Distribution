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
  
  @scala.inline
  def apply(): PartialPaginatorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginatorState]
  }
  
  @scala.inline
  implicit class PartialPaginatorStateMutableBuilder[Self <: PartialPaginatorState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
  }
}
