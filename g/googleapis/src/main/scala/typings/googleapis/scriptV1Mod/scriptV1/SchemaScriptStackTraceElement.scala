package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stack trace through the script that shows where the execution failed.
  */
@js.native
trait SchemaScriptStackTraceElement extends js.Object {
  
  /**
    * The name of the function that failed.
    */
  var function: js.UndefOr[String] = js.native
  
  /**
    * The line number where the script failed.
    */
  var lineNumber: js.UndefOr[Double] = js.native
}
object SchemaScriptStackTraceElement {
  
  @scala.inline
  def apply(): SchemaScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptStackTraceElement]
  }
  
  @scala.inline
  implicit class SchemaScriptStackTraceElementOps[Self <: SchemaScriptStackTraceElement] (val x: Self) extends AnyVal {
    
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
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
  }
}
