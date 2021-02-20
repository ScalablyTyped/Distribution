package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated after a worker VM has been assigned to run the pipeline.
  */
@js.native
trait SchemaWorkerAssignedEvent extends StObject {
  
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * The zone the worker is running in.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaWorkerAssignedEvent {
  
  @scala.inline
  def apply(): SchemaWorkerAssignedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerAssignedEvent]
  }
  
  @scala.inline
  implicit class SchemaWorkerAssignedEventMutableBuilder[Self <: SchemaWorkerAssignedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
