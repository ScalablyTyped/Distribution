package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InputMapping creates a &#39;virtual&#39; property that will be injected
  * into the properties before sending the request to the underlying API.
  */
@js.native
trait SchemaInputMapping extends js.Object {
  /**
    * The name of the field that is going to be injected.
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * The location where this mapping applies.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Regex to evaluate on method to decide if input applies.
    */
  var methodMatch: js.UndefOr[String] = js.native
  /**
    * A jsonPath expression to select an element.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaInputMapping {
  @scala.inline
  def apply(): SchemaInputMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInputMapping]
  }
  @scala.inline
  implicit class SchemaInputMappingOps[Self <: SchemaInputMapping] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMethodMatch(value: String): Self = this.set("methodMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethodMatch: Self = this.set("methodMatch", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

