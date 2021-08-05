package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observable extends StObject {
  
  var Observable: Ap
}
object Observable {
  
  inline def apply(Observable: Ap): Observable = {
    val __obj = js.Dynamic.literal(Observable = Observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observable]
  }
  
  extension [Self <: Observable](x: Self) {
    
    inline def setObservable(value: Ap): Self = StObject.set(x, "Observable", value.asInstanceOf[js.Any])
  }
}
