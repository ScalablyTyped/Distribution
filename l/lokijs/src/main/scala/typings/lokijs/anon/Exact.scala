package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exact[E /* <: js.Object */] extends StObject {
  
  var exact: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof E ]: lokijs.ExactIndex<E>} */ js.Any
  
  var unique: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof E ]: lokijs.UniqueIndex<E>} */ js.Any
}
object Exact {
  
  inline def apply[E /* <: js.Object */](
    exact: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof E ]: lokijs.ExactIndex<E>} */ js.Any,
    unique: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof E ]: lokijs.UniqueIndex<E>} */ js.Any
  ): Exact[E] = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exact[E]]
  }
  
  extension [Self <: Exact[?], E /* <: js.Object */](x: Self & Exact[E]) {
    
    inline def setExact(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof E ]: lokijs.ExactIndex<E>} */ js.Any
    ): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setUnique(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof E ]: lokijs.UniqueIndex<E>} */ js.Any
    ): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
