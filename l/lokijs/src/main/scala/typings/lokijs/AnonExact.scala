package typings.lokijs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExact[E /* <: js.Object */] extends js.Object {
  var exact: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typings.lokijs.lokijsStrings.AnonExact with TopLevel[js.Any]
  var unique: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typings.lokijs.lokijsStrings.AnonExact with TopLevel[js.Any]
}

object AnonExact {
  @scala.inline
  def apply[E /* <: js.Object */](
    exact: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typings.lokijs.lokijsStrings.AnonExact with TopLevel[js.Any],
    unique: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typings.lokijs.lokijsStrings.AnonExact with TopLevel[js.Any]
  ): AnonExact[E] = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExact[E]]
  }
}

