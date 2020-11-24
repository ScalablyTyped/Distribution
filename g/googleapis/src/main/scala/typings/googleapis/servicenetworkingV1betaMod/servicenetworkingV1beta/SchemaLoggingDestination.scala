package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of a specific logging destination (the producer project or
  * the consumer project).
  */
@js.native
trait SchemaLoggingDestination extends js.Object {
  
  /**
    * Names of the logs to be sent to this destination. Each name must be
    * defined in the Service.logs section. If the log name is not a domain
    * scoped name, it will be automatically prefixed with the service name
    * followed by &quot;/&quot;.
    */
  var logs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The monitored resource type. The type must be defined in the
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}
object SchemaLoggingDestination {
  
  @scala.inline
  def apply(): SchemaLoggingDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingDestination]
  }
  
  @scala.inline
  implicit class SchemaLoggingDestinationOps[Self <: SchemaLoggingDestination] (val x: Self) extends AnyVal {
    
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
    def setLogsVarargs(value: String*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[String]): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    
    @scala.inline
    def setMonitoredResource(value: String): Self = this.set("monitoredResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoredResource: Self = this.set("monitoredResource", js.undefined)
  }
}
