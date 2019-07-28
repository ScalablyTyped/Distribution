package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exact[E /* <: js.Object */] extends js.Object {
  var exact: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typings.lokijs.lokijsStrings.Anon_Exact with js.Any
  var unique: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typings.lokijs.lokijsStrings.Anon_Exact with js.Any
}

object Anon_Exact {
  @scala.inline
  def apply[E /* <: js.Object */](
    exact: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typings.lokijs.lokijsStrings.Anon_Exact with js.Any,
    unique: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typings.lokijs.lokijsStrings.Anon_Exact with js.Any
  ): Anon_Exact[E] = {
    val __obj = js.Dynamic.literal(exact = exact, unique = unique)
  
    __obj.asInstanceOf[Anon_Exact[E]]
  }
}

