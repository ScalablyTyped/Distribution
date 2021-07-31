package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exit code from a tool execution.
  */
trait SchemaToolExitCode extends StObject {
  
  /**
    * Tool execution exit code. A value of 0 means that the execution was
    * successful.  - In response: always set - In create/update request: always
    * set
    */
  var number: js.UndefOr[Double] = js.undefined
}
object SchemaToolExitCode {
  
  @scala.inline
  def apply(): SchemaToolExitCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolExitCode]
  }
  
  @scala.inline
  implicit class SchemaToolExitCodeMutableBuilder[Self <: SchemaToolExitCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
