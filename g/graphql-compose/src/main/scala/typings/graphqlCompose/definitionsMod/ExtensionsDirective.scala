package typings.graphqlCompose.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionsDirective extends js.Object {
  var args: DirectiveArgs
  var name: String
}

object ExtensionsDirective {
  @scala.inline
  def apply(args: DirectiveArgs, name: String): ExtensionsDirective = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionsDirective]
  }
}

