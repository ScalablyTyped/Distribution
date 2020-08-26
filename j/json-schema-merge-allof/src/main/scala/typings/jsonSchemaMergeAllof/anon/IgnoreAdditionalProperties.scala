package typings.jsonSchemaMergeAllof.anon

import typings.jsonSchemaMergeAllof.jsonSchemaMergeAllofBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreAdditionalProperties extends js.Object {
  var ignoreAdditionalProperties: `true` = js.native
}

object IgnoreAdditionalProperties {
  @scala.inline
  def apply(ignoreAdditionalProperties: `true`): IgnoreAdditionalProperties = {
    val __obj = js.Dynamic.literal(ignoreAdditionalProperties = ignoreAdditionalProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreAdditionalProperties]
  }
  @scala.inline
  implicit class IgnoreAdditionalPropertiesOps[Self <: IgnoreAdditionalProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIgnoreAdditionalProperties(value: `true`): Self = this.set("ignoreAdditionalProperties", value.asInstanceOf[js.Any])
  }
  
}

