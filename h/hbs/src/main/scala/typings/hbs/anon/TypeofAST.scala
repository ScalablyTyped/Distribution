package typings.hbs.anon

import typings.handlebars.hbs.AST.helpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofAST extends js.Object {
  val helpers: typings.handlebars.hbs.AST.helpers
}

object TypeofAST {
  @scala.inline
  def apply(helpers: helpers): TypeofAST = {
    val __obj = js.Dynamic.literal(helpers = helpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAST]
  }
}

