package typings.graphql.findBreakingChangesMod

import typings.graphql.graphqlStrings.ARG_DEFAULT_VALUE_CHANGE
import typings.graphql.graphqlStrings.IMPLEMENTED_INTERFACE_ADDED
import typings.graphql.graphqlStrings.OPTIONAL_ARG_ADDED
import typings.graphql.graphqlStrings.OPTIONAL_INPUT_FIELD_ADDED
import typings.graphql.graphqlStrings.TYPE_ADDED_TO_UNION
import typings.graphql.graphqlStrings.VALUE_ADDED_TO_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DangerousChange extends js.Object {
  var description: String = js.native
  var `type`: /* keyof graphql.anon.ARGDEFAULTVALUECHANGE */ VALUE_ADDED_TO_ENUM | TYPE_ADDED_TO_UNION | OPTIONAL_INPUT_FIELD_ADDED | OPTIONAL_ARG_ADDED | IMPLEMENTED_INTERFACE_ADDED | ARG_DEFAULT_VALUE_CHANGE = js.native
}

object DangerousChange {
  @scala.inline
  def apply(
    description: String,
    `type`: /* keyof graphql.anon.ARGDEFAULTVALUECHANGE */ VALUE_ADDED_TO_ENUM | TYPE_ADDED_TO_UNION | OPTIONAL_INPUT_FIELD_ADDED | OPTIONAL_ARG_ADDED | IMPLEMENTED_INTERFACE_ADDED | ARG_DEFAULT_VALUE_CHANGE
  ): DangerousChange = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerousChange]
  }
  @scala.inline
  implicit class DangerousChangeOps[Self <: DangerousChange] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(
      value: /* keyof graphql.anon.ARGDEFAULTVALUECHANGE */ VALUE_ADDED_TO_ENUM | TYPE_ADDED_TO_UNION | OPTIONAL_INPUT_FIELD_ADDED | OPTIONAL_ARG_ADDED | IMPLEMENTED_INTERFACE_ADDED | ARG_DEFAULT_VALUE_CHANGE
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

