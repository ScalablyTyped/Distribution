package typings.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when the worker VM that was assigned to the pipeline has
  * been released (deleted).
  */
@js.native
trait SchemaWorkerReleasedEvent extends js.Object {
  
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * The zone the worker was running in.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaWorkerReleasedEvent {
  
  @scala.inline
  def apply(): SchemaWorkerReleasedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerReleasedEvent]
  }
  
  @scala.inline
  implicit class SchemaWorkerReleasedEventOps[Self <: SchemaWorkerReleasedEvent] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
