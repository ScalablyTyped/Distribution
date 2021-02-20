package typings.lokijs.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exact[E /* <: js.Object */] extends StObject {
  
  var exact: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any] = js.native
  
  var unique: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any] = js.native
}
object Exact {
  
  @scala.inline
  def apply[E /* <: js.Object */](
    exact: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any],
    unique: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any]
  ): Exact[E] = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exact[E]]
  }
  
  @scala.inline
  implicit class ExactMutableBuilder[Self <: Exact[_], E /* <: js.Object */] (val x: Self with Exact[E]) extends AnyVal {
    
    @scala.inline
    def setExact(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof E ]: lokijs.ExactIndex<E>}
      */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any]
    ): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof E ]: lokijs.UniqueIndex<E>}
      */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any]
    ): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
