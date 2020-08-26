package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location information about a resource.
  */
@js.native
trait SchemaResourceLocation extends js.Object {
  /**
    * The locations of a resource after the execution of the operation.
    * Requests to create or delete a location based resource must populate the
    * &#39;current_locations&#39; field and not the
    * &#39;original_locations&#39; field. For example:
    * &quot;europe-west1-a&quot;     &quot;us-east1&quot;     &quot;nam3&quot;
    */
  var currentLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The locations of a resource prior to the execution of the operation.
    * Requests that mutate the resource&#39;s location must populate both the
    * &#39;original_locations&#39; as well as the &#39;current_locations&#39;
    * fields. For example:      &quot;europe-west1-a&quot; &quot;us-east1&quot;
    * &quot;nam3&quot;
    */
  var originalLocations: js.UndefOr[js.Array[String]] = js.native
}

object SchemaResourceLocation {
  @scala.inline
  def apply(): SchemaResourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceLocation]
  }
  @scala.inline
  implicit class SchemaResourceLocationOps[Self <: SchemaResourceLocation] (val x: Self) extends AnyVal {
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
    def setCurrentLocationsVarargs(value: String*): Self = this.set("currentLocations", js.Array(value :_*))
    @scala.inline
    def setCurrentLocations(value: js.Array[String]): Self = this.set("currentLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLocations: Self = this.set("currentLocations", js.undefined)
    @scala.inline
    def setOriginalLocationsVarargs(value: String*): Self = this.set("originalLocations", js.Array(value :_*))
    @scala.inline
    def setOriginalLocations(value: js.Array[String]): Self = this.set("originalLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalLocations: Self = this.set("originalLocations", js.undefined)
  }
  
}

