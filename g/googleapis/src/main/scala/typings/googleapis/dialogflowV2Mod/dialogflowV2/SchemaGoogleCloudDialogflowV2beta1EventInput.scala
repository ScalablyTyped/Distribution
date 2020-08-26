package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Events allow for matching intents by event name instead of the natural
  * language input. For instance, input `&lt;event: { name:
  * &quot;welcome_event&quot;, parameters: { name: &quot;Sam&quot; } }&gt;` can
  * trigger a personalized welcome response. The parameter `name` may be used
  * by the agent in the response: `&quot;Hello #welcome_event.name! What can I
  * do for you today?&quot;`.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1EventInput extends js.Object {
  /**
    * Required. The language of this query. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. Note that queries
    * in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Required. The unique identifier of the event.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of parameters associated with the event.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1EventInput {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1EventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EventInput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1EventInputOps[Self <: SchemaGoogleCloudDialogflowV2beta1EventInput] (val x: Self) extends AnyVal {
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
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
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

