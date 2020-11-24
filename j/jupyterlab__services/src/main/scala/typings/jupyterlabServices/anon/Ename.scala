package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ename extends js.Object {
  
  var ename: String = js.native
  
  var evalue: String = js.native
  
  var traceback: js.Array[String] = js.native
}
object Ename {
  
  @scala.inline
  def apply(ename: String, evalue: String, traceback: js.Array[String]): Ename = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ename]
  }
  
  @scala.inline
  implicit class EnameOps[Self <: Ename] (val x: Self) extends AnyVal {
    
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
    def setEname(value: String): Self = this.set("ename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalue(value: String): Self = this.set("evalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracebackVarargs(value: String*): Self = this.set("traceback", js.Array(value :_*))
    
    @scala.inline
    def setTraceback(value: js.Array[String]): Self = this.set("traceback", value.asInstanceOf[js.Any])
  }
}
