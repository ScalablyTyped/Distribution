package typings.instagramPrivateApi.storyResponseOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryTextQuestionResponse extends StoryResponseOptions {
  var response: String
}

object StoryTextQuestionResponse {
  @scala.inline
  def apply(response: String, client_context: String = null, mutation_token: String = null): StoryTextQuestionResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    if (client_context != null) __obj.updateDynamic("client_context")(client_context.asInstanceOf[js.Any])
    if (mutation_token != null) __obj.updateDynamic("mutation_token")(mutation_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryTextQuestionResponse]
  }
}

