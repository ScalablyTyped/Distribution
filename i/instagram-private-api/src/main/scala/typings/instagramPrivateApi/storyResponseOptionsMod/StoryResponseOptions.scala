package typings.instagramPrivateApi.storyResponseOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryResponseOptions extends js.Object {
  var client_context: js.UndefOr[String] = js.undefined
  var mutation_token: js.UndefOr[String] = js.undefined
}

object StoryResponseOptions {
  @scala.inline
  def apply(client_context: String = null, mutation_token: String = null): StoryResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (client_context != null) __obj.updateDynamic("client_context")(client_context.asInstanceOf[js.Any])
    if (mutation_token != null) __obj.updateDynamic("mutation_token")(mutation_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryResponseOptions]
  }
}

