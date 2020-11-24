package typings.libxmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxError extends js.Object {
  
  var code: Double | Null = js.native
  
  /**
    * 1-based column number, 0 if not applicable/available.
    */
  var column: Double = js.native
  
  var domain: Double | Null = js.native
  
  var file: String | Null = js.native
  
  var int1: Double | Null = js.native
  
  var level: Double | Null = js.native
  
  var line: Double | Null = js.native
  
  var message: String | Null = js.native
  
  var str1: Double | Null = js.native
  
  var str2: Double | Null = js.native
  
  var str3: Double | Null = js.native
}
object SyntaxError {
  
  @scala.inline
  def apply(column: Double): SyntaxError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxError]
  }
  
  @scala.inline
  implicit class SyntaxErrorOps[Self <: SyntaxError] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    
    @scala.inline
    def setDomain(value: Double): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNull: Self = this.set("domain", null)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNull: Self = this.set("file", null)
    
    @scala.inline
    def setInt1(value: Double): Self = this.set("int1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt1Null: Self = this.set("int1", null)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelNull: Self = this.set("level", null)
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = this.set("line", null)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    
    @scala.inline
    def setStr1(value: Double): Self = this.set("str1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStr1Null: Self = this.set("str1", null)
    
    @scala.inline
    def setStr2(value: Double): Self = this.set("str2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStr2Null: Self = this.set("str2", null)
    
    @scala.inline
    def setStr3(value: Double): Self = this.set("str3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStr3Null: Self = this.set("str3", null)
  }
}
