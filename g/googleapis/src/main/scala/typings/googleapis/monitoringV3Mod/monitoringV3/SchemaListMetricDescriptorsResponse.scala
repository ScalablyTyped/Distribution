package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListMetricDescriptors response.
  */
@js.native
trait SchemaListMetricDescriptorsResponse extends js.Object {
  /**
    * The metric descriptors that are available to the project and that match
    * the value of filter, if present.
    */
  var metricDescriptors: js.UndefOr[js.Array[SchemaMetricDescriptor]] = js.native
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListMetricDescriptorsResponse {
  @scala.inline
  def apply(): SchemaListMetricDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMetricDescriptorsResponse]
  }
  @scala.inline
  implicit class SchemaListMetricDescriptorsResponseOps[Self <: SchemaListMetricDescriptorsResponse] (val x: Self) extends AnyVal {
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
    def setMetricDescriptorsVarargs(value: SchemaMetricDescriptor*): Self = this.set("metricDescriptors", js.Array(value :_*))
    @scala.inline
    def setMetricDescriptors(value: js.Array[SchemaMetricDescriptor]): Self = this.set("metricDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricDescriptors: Self = this.set("metricDescriptors", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

