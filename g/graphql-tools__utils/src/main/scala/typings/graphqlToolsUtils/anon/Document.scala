package typings.graphqlToolsUtils.anon

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var document: DocumentNode
  var location: String
  var rawSDL: String
}

object Document {
  @scala.inline
  def apply(document: DocumentNode, location: String, rawSDL: String): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rawSDL = rawSDL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

