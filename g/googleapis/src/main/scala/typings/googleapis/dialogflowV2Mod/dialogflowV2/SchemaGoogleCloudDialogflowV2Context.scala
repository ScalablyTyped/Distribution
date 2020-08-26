package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a context.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2Context extends js.Object {
  /**
    * Optional. The number of conversational query requests after which the
    * context expires. If set to `0` (the default) the context expires
    * immediately. Contexts expire automatically after 20 minutes if there are
    * no matching queries.
    */
  var lifespanCount: js.UndefOr[Double] = js.native
  /**
    * Required. The unique identifier of the context. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session
    * ID&gt;/contexts/&lt;Context ID&gt;`.  The `Context ID` is always
    * converted to lowercase, may only contain characters in [a-zA-Z0-9_-%] and
    * may be at most 250 bytes long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of parameters associated with this context.
    * Refer to [this
    * doc](https://cloud.google.com/dialogflow-enterprise/docs/intents-actions-parameters)
    * for syntax.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGoogleCloudDialogflowV2Context {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Context]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2ContextOps[Self <: SchemaGoogleCloudDialogflowV2Context] (val x: Self) extends AnyVal {
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
    def setLifespanCount(value: Double): Self = this.set("lifespanCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifespanCount: Self = this.set("lifespanCount", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

