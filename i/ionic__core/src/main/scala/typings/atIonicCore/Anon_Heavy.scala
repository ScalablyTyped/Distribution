package typings.atIonicCore

import typings.atIonicCore.atIonicCoreStrings.heavy
import typings.atIonicCore.atIonicCoreStrings.light
import typings.atIonicCore.atIonicCoreStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Heavy extends js.Object {
  var style: medium | light | heavy
}

object Anon_Heavy {
  @scala.inline
  def apply(style: medium | light | heavy): Anon_Heavy = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Heavy]
  }
}

