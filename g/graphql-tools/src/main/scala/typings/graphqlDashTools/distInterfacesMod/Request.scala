package typings.graphqlDashTools.distInterfacesMod

import typings.graphql.languageAstMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var document: DocumentNode
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var variables: Record[String, _]
}

object Request {
  @scala.inline
  def apply(document: DocumentNode, variables: Record[String, _], extensions: Record[String, _] = null): Request = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

