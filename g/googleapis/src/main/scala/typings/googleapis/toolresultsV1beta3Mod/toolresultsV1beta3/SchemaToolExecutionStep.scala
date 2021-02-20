package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic tool step to be used for binaries we do not explicitly support. For
  * example: running cp to copy artifacts from one location to another.
  */
@js.native
trait SchemaToolExecutionStep extends StObject {
  
  /**
    * A Tool execution.  - In response: present if set by create/update request
    * - In create/update request: optional
    */
  var toolExecution: js.UndefOr[SchemaToolExecution] = js.native
}
object SchemaToolExecutionStep {
  
  @scala.inline
  def apply(): SchemaToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolExecutionStep]
  }
  
  @scala.inline
  implicit class SchemaToolExecutionStepMutableBuilder[Self <: SchemaToolExecutionStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToolExecution(value: SchemaToolExecution): Self = StObject.set(x, "toolExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolExecutionUndefined: Self = StObject.set(x, "toolExecution", js.undefined)
  }
}
