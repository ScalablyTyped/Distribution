package typings.lokijs.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exact[E /* <: js.Object */] extends js.Object {
  var exact: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any] = js.native
  var unique: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any] = js.native
}

object Exact {
  @scala.inline
  def apply[/* <: js.Object */ E](
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
  implicit class ExactOps[Self <: Exact[_], /* <: js.Object */ E] (val x: Self with Exact[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExact(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof E ]: lokijs.ExactIndex<E>}
      */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any]
    ): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnique(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof E ]: lokijs.UniqueIndex<E>}
      */ typings.lokijs.lokijsStrings.Exact with TopLevel[js.Any]
    ): Self = this.set("unique", value.asInstanceOf[js.Any])
  }
  
}

