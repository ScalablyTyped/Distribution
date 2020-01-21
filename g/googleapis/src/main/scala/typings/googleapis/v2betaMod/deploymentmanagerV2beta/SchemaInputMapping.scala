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
  def apply(
    fieldName: String = null,
    location: String = null,
    methodMatch: String = null,
    value: String = null
  ): SchemaInputMapping = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (methodMatch != null) __obj.updateDynamic("methodMatch")(methodMatch.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInputMapping]
  }
}

