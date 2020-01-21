package typings.knockoutPreRendered.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// common AMD type
trait AMDModule extends js.Object {
  var require: String
}

object AMDModule {
  @scala.inline
  def apply(require: String): AMDModule = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AMDModule]
  }
}

