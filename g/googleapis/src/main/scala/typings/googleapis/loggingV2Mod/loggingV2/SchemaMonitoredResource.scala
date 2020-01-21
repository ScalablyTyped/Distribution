package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a resource that can be used for monitoring, logging,
  * billing, or other purposes. Examples include virtual machine instances,
  * databases, and storage devices such as disks. The type field identifies a
  * MonitoredResourceDescriptor object that describes the resource&#39;s
  * schema. Information in the labels field identifies the actual resource and
  * its attributes according to the schema. For example, a particular Compute
  * Engine VM instance could be represented by the following object, because
  * the MonitoredResourceDescriptor for &quot;gce_instance&quot; has labels
  * &quot;instance_id&quot; and &quot;zone&quot;: { &quot;type&quot;:
  * &quot;gce_instance&quot;,   &quot;labels&quot;: { &quot;instance_id&quot;:
  * &quot;12345678901234&quot;,               &quot;zone&quot;:
  * &quot;us-central1-a&quot; }}
  */
@js.native
trait SchemaMonitoredResource extends js.Object {
  /**
    * Required. Values for all of the labels listed in the associated monitored
    * resource descriptor. For example, Compute Engine VM instances use the
    * labels &quot;project_id&quot;, &quot;instance_id&quot;, and
    * &quot;zone&quot;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Required. The monitored resource type. This field must match the type
    * field of a MonitoredResourceDescriptor object. For example, the type of a
    * Compute Engine VM instance is gce_instance.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMonitoredResource {
  @scala.inline
  def apply(labels: StringDictionary[String] = null, `type`: String = null): SchemaMonitoredResource = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMonitoredResource]
  }
}

