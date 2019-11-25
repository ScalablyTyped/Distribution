package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsSchemaOptions extends js.Object {
  /**
    * If true, will identify schemas from older versions of joi, otherwise will throw an error.
    *
    * @default false
    */
  var legacy: Boolean
}

object IsSchemaOptions {
  @scala.inline
  def apply(legacy: Boolean): IsSchemaOptions = {
    val __obj = js.Dynamic.literal(legacy = legacy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IsSchemaOptions]
  }
}

