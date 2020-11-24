package typings.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdoc extends js.Object {
  
  val builders: Typeofbuilders = js.native
  
  val debug: Typeofdebug = js.native
  
  val printer: Typeofprinter = js.native
  
  val utils: TypeofutilsIsEmpty = js.native
}
object Typeofdoc {
  
  @scala.inline
  def apply(builders: Typeofbuilders, debug: Typeofdebug, printer: Typeofprinter, utils: TypeofutilsIsEmpty): Typeofdoc = {
    val __obj = js.Dynamic.literal(builders = builders.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], printer = printer.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdoc]
  }
  
  @scala.inline
  implicit class TypeofdocOps[Self <: Typeofdoc] (val x: Self) extends AnyVal {
    
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
    def setBuilders(value: Typeofbuilders): Self = this.set("builders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Typeofdebug): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinter(value: Typeofprinter): Self = this.set("printer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: TypeofutilsIsEmpty): Self = this.set("utils", value.asInstanceOf[js.Any])
  }
}
