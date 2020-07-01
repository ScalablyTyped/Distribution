package typings.graphqlToolsUtils.getFieldsWithDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveUsage extends js.Object {
  var args: DirectiveArgs
  var name: String
}

object DirectiveUsage {
  @scala.inline
  def apply(args: DirectiveArgs, name: String): DirectiveUsage = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveUsage]
  }
}

