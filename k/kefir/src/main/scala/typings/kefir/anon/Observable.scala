package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable extends StObject {
  
  var Observable: Ap = js.native
}
object Observable {
  
  @scala.inline
  def apply(Observable: Ap): Observable = {
    val __obj = js.Dynamic.literal(Observable = Observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observable]
  }
  
  @scala.inline
  implicit class ObservableMutableBuilder[Self <: Observable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObservable(value: Ap): Self = StObject.set(x, "Observable", value.asInstanceOf[js.Any])
  }
}
