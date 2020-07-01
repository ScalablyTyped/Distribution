package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to instantiate a workflow template.
  */
@js.native
trait SchemaInstantiateWorkflowTemplateRequest extends js.Object {
  /**
    * Deprecated. Please use request_id field instead.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * Optional. Map from parameter names to values that should be used for
    * those parameters. Values may not exceed 100 characters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. A tag that prevents multiple concurrent workflow instances with
    * the same tag from running. This mitigates risk of concurrent instances
    * started due to retries.It is recommended to always set this value to a
    * UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The
    * tag must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
    * and hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * Optional. The version of workflow template to instantiate. If specified,
    * the workflow will be instantiated only if the current version of the
    * workflow template has the supplied version.This option cannot be used to
    * instantiate a previous version of workflow template.
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaInstantiateWorkflowTemplateRequest {
  @scala.inline
  def apply(
    instanceId: String = null,
    parameters: StringDictionary[String] = null,
    requestId: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): SchemaInstantiateWorkflowTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstantiateWorkflowTemplateRequest]
  }
}

