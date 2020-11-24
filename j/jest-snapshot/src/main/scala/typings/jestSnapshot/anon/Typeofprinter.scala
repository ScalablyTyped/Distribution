package typings.jestSnapshot.anon

import typings.prettier.anon.CursorNodeStart
import typings.prettier.mod.Doc_
import typings.prettier.mod.doc.printer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofprinter extends js.Object {
  
  def printDocToString(doc: Doc_, options: Options): CursorNodeStart = js.native
}
object Typeofprinter {
  
  @scala.inline
  def apply(printDocToString: (Doc_, Options) => CursorNodeStart): Typeofprinter = {
    val __obj = js.Dynamic.literal(printDocToString = js.Any.fromFunction2(printDocToString))
    __obj.asInstanceOf[Typeofprinter]
  }
  
  @scala.inline
  implicit class TypeofprinterOps[Self <: Typeofprinter] (val x: Self) extends AnyVal {
    
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
    def setPrintDocToString(value: (Doc_, Options) => CursorNodeStart): Self = this.set("printDocToString", js.Any.fromFunction2(value))
  }
}
