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
trait SchemaGoogleCloudDialogflowV2EventInput extends js.Object {
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

object SchemaGoogleCloudDialogflowV2EventInput {
  @scala.inline
  def apply(languageCode: String = null, name: String = null, parameters: StringDictionary[js.Any] = null): SchemaGoogleCloudDialogflowV2EventInput = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EventInput]
  }
}

