package typings.jqueryDotLivestampjs.jqueryDotLivestampjsMod.Global

import typings.jqueryDotLivestampjs.jqueryDotLivestampjsMod.LivestampGlobal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var livestamp: LivestampGlobal
}

object JQueryStatic {
  @scala.inline
  def apply(livestamp: LivestampGlobal): JQueryStatic = {
    val __obj = js.Dynamic.literal(livestamp = livestamp)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

