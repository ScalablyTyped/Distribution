package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when the execution of a pipeline has failed. Note that
  * other events can continue to occur after this event.
  */
@js.native
trait SchemaFailedEvent extends StObject {
  
  /**
    * The human-readable description of the cause of the failure.
    */
  var cause: js.UndefOr[String] = js.native
  
  /**
    * The Google standard error code that best describes this failure.
    */
  var code: js.UndefOr[String] = js.native
}
object SchemaFailedEvent {
  
  @scala.inline
  def apply(): SchemaFailedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailedEvent]
  }
  
  @scala.inline
  implicit class SchemaFailedEventMutableBuilder[Self <: SchemaFailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
