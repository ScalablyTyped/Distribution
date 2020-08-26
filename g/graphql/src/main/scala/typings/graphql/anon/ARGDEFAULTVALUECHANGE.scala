package typings.graphql.anon

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
trait ARGDEFAULTVALUECHANGE extends js.Object {
  var ARG_DEFAULT_VALUE_CHANGE: typings.graphql.graphqlStrings.ARG_DEFAULT_VALUE_CHANGE = js.native
  var IMPLEMENTED_INTERFACE_ADDED: typings.graphql.graphqlStrings.IMPLEMENTED_INTERFACE_ADDED = js.native
  var OPTIONAL_ARG_ADDED: typings.graphql.graphqlStrings.OPTIONAL_ARG_ADDED = js.native
  var OPTIONAL_INPUT_FIELD_ADDED: typings.graphql.graphqlStrings.OPTIONAL_INPUT_FIELD_ADDED = js.native
  var TYPE_ADDED_TO_UNION: typings.graphql.graphqlStrings.TYPE_ADDED_TO_UNION = js.native
  var VALUE_ADDED_TO_ENUM: typings.graphql.graphqlStrings.VALUE_ADDED_TO_ENUM = js.native
}

object ARGDEFAULTVALUECHANGE {
  @scala.inline
  def apply(
    ARG_DEFAULT_VALUE_CHANGE: ARG_DEFAULT_VALUE_CHANGE,
    IMPLEMENTED_INTERFACE_ADDED: IMPLEMENTED_INTERFACE_ADDED,
    OPTIONAL_ARG_ADDED: OPTIONAL_ARG_ADDED,
    OPTIONAL_INPUT_FIELD_ADDED: OPTIONAL_INPUT_FIELD_ADDED,
    TYPE_ADDED_TO_UNION: TYPE_ADDED_TO_UNION,
    VALUE_ADDED_TO_ENUM: VALUE_ADDED_TO_ENUM
  ): ARGDEFAULTVALUECHANGE = {
    val __obj = js.Dynamic.literal(ARG_DEFAULT_VALUE_CHANGE = ARG_DEFAULT_VALUE_CHANGE.asInstanceOf[js.Any], IMPLEMENTED_INTERFACE_ADDED = IMPLEMENTED_INTERFACE_ADDED.asInstanceOf[js.Any], OPTIONAL_ARG_ADDED = OPTIONAL_ARG_ADDED.asInstanceOf[js.Any], OPTIONAL_INPUT_FIELD_ADDED = OPTIONAL_INPUT_FIELD_ADDED.asInstanceOf[js.Any], TYPE_ADDED_TO_UNION = TYPE_ADDED_TO_UNION.asInstanceOf[js.Any], VALUE_ADDED_TO_ENUM = VALUE_ADDED_TO_ENUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARGDEFAULTVALUECHANGE]
  }
  @scala.inline
  implicit class ARGDEFAULTVALUECHANGEOps[Self <: ARGDEFAULTVALUECHANGE] (val x: Self) extends AnyVal {
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
    def setARG_DEFAULT_VALUE_CHANGE(value: ARG_DEFAULT_VALUE_CHANGE): Self = this.set("ARG_DEFAULT_VALUE_CHANGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setIMPLEMENTED_INTERFACE_ADDED(value: IMPLEMENTED_INTERFACE_ADDED): Self = this.set("IMPLEMENTED_INTERFACE_ADDED", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPTIONAL_ARG_ADDED(value: OPTIONAL_ARG_ADDED): Self = this.set("OPTIONAL_ARG_ADDED", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPTIONAL_INPUT_FIELD_ADDED(value: OPTIONAL_INPUT_FIELD_ADDED): Self = this.set("OPTIONAL_INPUT_FIELD_ADDED", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_ADDED_TO_UNION(value: TYPE_ADDED_TO_UNION): Self = this.set("TYPE_ADDED_TO_UNION", value.asInstanceOf[js.Any])
    @scala.inline
    def setVALUE_ADDED_TO_ENUM(value: VALUE_ADDED_TO_ENUM): Self = this.set("VALUE_ADDED_TO_ENUM", value.asInstanceOf[js.Any])
  }
  
}

