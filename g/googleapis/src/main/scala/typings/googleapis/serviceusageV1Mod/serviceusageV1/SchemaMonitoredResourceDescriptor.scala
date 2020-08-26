package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes the schema of a MonitoredResource object using a
  * type name and a set of labels.  For example, the monitored resource
  * descriptor for Google Compute Engine VM instances has a type of
  * `&quot;gce_instance&quot;` and specifies the use of the labels
  * `&quot;instance_id&quot;` and `&quot;zone&quot;` to identify particular VM
  * instances.  Different APIs can support different monitored resource types.
  * APIs generally provide a `list` method that returns the monitored resource
  * descriptors used by the API.
  */
@js.native
trait SchemaMonitoredResourceDescriptor extends js.Object {
  /**
    * Optional. A detailed description of the monitored resource type that
    * might be used in documentation.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. A concise name for the monitored resource type that might be
    * displayed in user interfaces. It should be a Title Cased Noun Phrase,
    * without any article or other determiners. For example, `&quot;Google
    * Cloud SQL Database&quot;`.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Required. A set of labels used to describe instances of this monitored
    * resource type. For example, an individual Google Cloud SQL database is
    * identified by values for the labels `&quot;database_id&quot;` and
    * `&quot;zone&quot;`.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.native
  /**
    * Optional. The resource name of the monitored resource descriptor:
    * `&quot;projects/{project_id}/monitoredResourceDescriptors/{type}&quot;`
    * where {type} is the value of the `type` field in this object and
    * {project_id} is a project ID that provides API-specific context for
    * accessing the type.  APIs that do not use project information can use the
    * resource name format `&quot;monitoredResourceDescriptors/{type}&quot;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The monitored resource type. For example, the type
    * `&quot;cloudsql_database&quot;` represents databases in Google Cloud SQL.
    * The maximum length of this value is 256 characters.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMonitoredResourceDescriptor {
  @scala.inline
  def apply(): SchemaMonitoredResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoredResourceDescriptor]
  }
  @scala.inline
  implicit class SchemaMonitoredResourceDescriptorOps[Self <: SchemaMonitoredResourceDescriptor] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: SchemaLabelDescriptor*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[SchemaLabelDescriptor]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

