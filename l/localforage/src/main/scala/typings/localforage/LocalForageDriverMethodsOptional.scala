package typings.localforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalForageDriverMethodsOptional extends StObject {
  
  var dropInstance: js.UndefOr[LocalForageDropInstanceFn] = js.undefined
}
object LocalForageDriverMethodsOptional {
  
  inline def apply(): LocalForageDriverMethodsOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageDriverMethodsOptional]
  }
  
  extension [Self <: LocalForageDriverMethodsOptional](x: Self) {
    
    inline def setDropInstance(
      value: (/* dbInstanceOptions */ js.UndefOr[LocalForageDbInstanceOptions], /* callback */ js.UndefOr[js.Function1[/* err */ js.Any, Unit]]) => js.Promise[Unit]
    ): Self = StObject.set(x, "dropInstance", js.Any.fromFunction2(value))
    
    inline def setDropInstanceUndefined: Self = StObject.set(x, "dropInstance", js.undefined)
  }
}
