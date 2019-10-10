package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped @hapi/joi.@hapi/joi.ReferenceOptions extends 'prefix' ? never : @hapi/joi.@hapi/joi.ReferenceOptions */ trait Reference extends js.Object {
  var depth: Double
  var display: String
  var key: String
  var path: js.Array[String]
  var root: String
  var `type`: String
}

object Reference {
  @scala.inline
  def apply(
    depth: Double,
    display: String,
    key: String,
    path: js.Array[String],
    root: String,
    toString: () => String,
    `type`: String
  ): Reference = {
    val __obj = js.Dynamic.literal(depth = depth, display = display, key = key, path = path, root = root, toString = js.Any.fromFunction0(toString))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Reference]
  }
}

