package typings.iso31662.mod.CountryInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Partial extends js.Object {
  var name: String
  var sub: typings.iso31662.mod.SubdivisionInfo.Map
}

object Partial {
  @scala.inline
  def apply(name: String, sub: typings.iso31662.mod.SubdivisionInfo.Map): Partial = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Partial]
  }
}

