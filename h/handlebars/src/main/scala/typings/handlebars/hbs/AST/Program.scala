package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program extends Node {
  var blockParams: js.Array[String]
  var body: js.Array[Statement]
}

object Program {
  @scala.inline
  def apply(blockParams: js.Array[String], body: js.Array[Statement], loc: SourceLocation, `type`: String): Program = {
    val __obj = js.Dynamic.literal(blockParams = blockParams.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}

