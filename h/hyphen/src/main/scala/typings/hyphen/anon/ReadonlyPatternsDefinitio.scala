package typings.hyphen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<hyphen.hyphen.PatternsDefinition> */
@js.native
trait ReadonlyPatternsDefinitio extends js.Object {
  
  val exceptions: js.Array[String] = js.native
  
  val patterns: js.Array[String] = js.native
}
object ReadonlyPatternsDefinitio {
  
  @scala.inline
  def apply(exceptions: js.Array[String], patterns: js.Array[String]): ReadonlyPatternsDefinitio = {
    val __obj = js.Dynamic.literal(exceptions = exceptions.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPatternsDefinitio]
  }
  
  @scala.inline
  implicit class ReadonlyPatternsDefinitioOps[Self <: ReadonlyPatternsDefinitio] (val x: Self) extends AnyVal {
    
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
    def setExceptionsVarargs(value: String*): Self = this.set("exceptions", js.Array(value :_*))
    
    @scala.inline
    def setExceptions(value: js.Array[String]): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: String*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
  }
}
