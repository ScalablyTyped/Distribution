package typings.graphql.anon

import typings.graphql.graphqlStrings.ARG_CHANGED_KIND
import typings.graphql.graphqlStrings.ARG_REMOVED
import typings.graphql.graphqlStrings.DIRECTIVE_ARG_REMOVED
import typings.graphql.graphqlStrings.DIRECTIVE_LOCATION_REMOVED
import typings.graphql.graphqlStrings.DIRECTIVE_REMOVED
import typings.graphql.graphqlStrings.DIRECTIVE_REPEATABLE_REMOVED
import typings.graphql.graphqlStrings.FIELD_CHANGED_KIND
import typings.graphql.graphqlStrings.FIELD_REMOVED
import typings.graphql.graphqlStrings.IMPLEMENTED_INTERFACE_REMOVED
import typings.graphql.graphqlStrings.REQUIRED_ARG_ADDED
import typings.graphql.graphqlStrings.REQUIRED_DIRECTIVE_ARG_ADDED
import typings.graphql.graphqlStrings.REQUIRED_INPUT_FIELD_ADDED
import typings.graphql.graphqlStrings.TYPE_CHANGED_KIND
import typings.graphql.graphqlStrings.TYPE_REMOVED
import typings.graphql.graphqlStrings.TYPE_REMOVED_FROM_UNION
import typings.graphql.graphqlStrings.VALUE_REMOVED_FROM_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARGCHANGEDKIND extends js.Object {
  var ARG_CHANGED_KIND: typings.graphql.graphqlStrings.ARG_CHANGED_KIND = js.native
  var ARG_REMOVED: typings.graphql.graphqlStrings.ARG_REMOVED = js.native
  var DIRECTIVE_ARG_REMOVED: typings.graphql.graphqlStrings.DIRECTIVE_ARG_REMOVED = js.native
  var DIRECTIVE_LOCATION_REMOVED: typings.graphql.graphqlStrings.DIRECTIVE_LOCATION_REMOVED = js.native
  var DIRECTIVE_REMOVED: typings.graphql.graphqlStrings.DIRECTIVE_REMOVED = js.native
  var DIRECTIVE_REPEATABLE_REMOVED: typings.graphql.graphqlStrings.DIRECTIVE_REPEATABLE_REMOVED = js.native
  var FIELD_CHANGED_KIND: typings.graphql.graphqlStrings.FIELD_CHANGED_KIND = js.native
  var FIELD_REMOVED: typings.graphql.graphqlStrings.FIELD_REMOVED = js.native
  var IMPLEMENTED_INTERFACE_REMOVED: typings.graphql.graphqlStrings.IMPLEMENTED_INTERFACE_REMOVED = js.native
  var REQUIRED_ARG_ADDED: typings.graphql.graphqlStrings.REQUIRED_ARG_ADDED = js.native
  var REQUIRED_DIRECTIVE_ARG_ADDED: typings.graphql.graphqlStrings.REQUIRED_DIRECTIVE_ARG_ADDED = js.native
  var REQUIRED_INPUT_FIELD_ADDED: typings.graphql.graphqlStrings.REQUIRED_INPUT_FIELD_ADDED = js.native
  var TYPE_CHANGED_KIND: typings.graphql.graphqlStrings.TYPE_CHANGED_KIND = js.native
  var TYPE_REMOVED: typings.graphql.graphqlStrings.TYPE_REMOVED = js.native
  var TYPE_REMOVED_FROM_UNION: typings.graphql.graphqlStrings.TYPE_REMOVED_FROM_UNION = js.native
  var VALUE_REMOVED_FROM_ENUM: typings.graphql.graphqlStrings.VALUE_REMOVED_FROM_ENUM = js.native
}

object ARGCHANGEDKIND {
  @scala.inline
  def apply(
    ARG_CHANGED_KIND: ARG_CHANGED_KIND,
    ARG_REMOVED: ARG_REMOVED,
    DIRECTIVE_ARG_REMOVED: DIRECTIVE_ARG_REMOVED,
    DIRECTIVE_LOCATION_REMOVED: DIRECTIVE_LOCATION_REMOVED,
    DIRECTIVE_REMOVED: DIRECTIVE_REMOVED,
    DIRECTIVE_REPEATABLE_REMOVED: DIRECTIVE_REPEATABLE_REMOVED,
    FIELD_CHANGED_KIND: FIELD_CHANGED_KIND,
    FIELD_REMOVED: FIELD_REMOVED,
    IMPLEMENTED_INTERFACE_REMOVED: IMPLEMENTED_INTERFACE_REMOVED,
    REQUIRED_ARG_ADDED: REQUIRED_ARG_ADDED,
    REQUIRED_DIRECTIVE_ARG_ADDED: REQUIRED_DIRECTIVE_ARG_ADDED,
    REQUIRED_INPUT_FIELD_ADDED: REQUIRED_INPUT_FIELD_ADDED,
    TYPE_CHANGED_KIND: TYPE_CHANGED_KIND,
    TYPE_REMOVED: TYPE_REMOVED,
    TYPE_REMOVED_FROM_UNION: TYPE_REMOVED_FROM_UNION,
    VALUE_REMOVED_FROM_ENUM: VALUE_REMOVED_FROM_ENUM
  ): ARGCHANGEDKIND = {
    val __obj = js.Dynamic.literal(ARG_CHANGED_KIND = ARG_CHANGED_KIND.asInstanceOf[js.Any], ARG_REMOVED = ARG_REMOVED.asInstanceOf[js.Any], DIRECTIVE_ARG_REMOVED = DIRECTIVE_ARG_REMOVED.asInstanceOf[js.Any], DIRECTIVE_LOCATION_REMOVED = DIRECTIVE_LOCATION_REMOVED.asInstanceOf[js.Any], DIRECTIVE_REMOVED = DIRECTIVE_REMOVED.asInstanceOf[js.Any], DIRECTIVE_REPEATABLE_REMOVED = DIRECTIVE_REPEATABLE_REMOVED.asInstanceOf[js.Any], FIELD_CHANGED_KIND = FIELD_CHANGED_KIND.asInstanceOf[js.Any], FIELD_REMOVED = FIELD_REMOVED.asInstanceOf[js.Any], IMPLEMENTED_INTERFACE_REMOVED = IMPLEMENTED_INTERFACE_REMOVED.asInstanceOf[js.Any], REQUIRED_ARG_ADDED = REQUIRED_ARG_ADDED.asInstanceOf[js.Any], REQUIRED_DIRECTIVE_ARG_ADDED = REQUIRED_DIRECTIVE_ARG_ADDED.asInstanceOf[js.Any], REQUIRED_INPUT_FIELD_ADDED = REQUIRED_INPUT_FIELD_ADDED.asInstanceOf[js.Any], TYPE_CHANGED_KIND = TYPE_CHANGED_KIND.asInstanceOf[js.Any], TYPE_REMOVED = TYPE_REMOVED.asInstanceOf[js.Any], TYPE_REMOVED_FROM_UNION = TYPE_REMOVED_FROM_UNION.asInstanceOf[js.Any], VALUE_REMOVED_FROM_ENUM = VALUE_REMOVED_FROM_ENUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARGCHANGEDKIND]
  }
  @scala.inline
  implicit class ARGCHANGEDKINDOps[Self <: ARGCHANGEDKIND] (val x: Self) extends AnyVal {
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
    def setARG_CHANGED_KIND(value: ARG_CHANGED_KIND): Self = this.set("ARG_CHANGED_KIND", value.asInstanceOf[js.Any])
    @scala.inline
    def setARG_REMOVED(value: ARG_REMOVED): Self = this.set("ARG_REMOVED", value.asInstanceOf[js.Any])
    @scala.inline
    def setDIRECTIVE_ARG_REMOVED(value: DIRECTIVE_ARG_REMOVED): Self = this.set("DIRECTIVE_ARG_REMOVED", value.asInstanceOf[js.Any])
    @scala.inline
    def setDIRECTIVE_LOCATION_REMOVED(value: DIRECTIVE_LOCATION_REMOVED): Self = this.set("DIRECTIVE_LOCATION_REMOVED", value.asInstanceOf[js.Any])
    @scala.inline
    def setDIRECTIVE_REMOVED(value: DIRECTIVE_REMOVED): Self = this.set("DIRECTIVE_REMOVED", value.asInstanceOf[js.Any])
    @scala.inline
    def setDIRECTIVE_REPEATABLE_REMOVED(value: DIRECTIVE_REPEATABLE_REMOVED): Self = this.set("DIRECTIVE_REPEATABLE_REMOVED", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIELD_CHANGED_KIND(value: FIELD_CHANGED_KIND): Self = this.set("FIELD_CHANGED_KIND", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIELD_REMOVED(value: FIELD_REMOVED): Self = this.set("FIELD_REMOVED", value.asInstanceOf[js.Any])
    @scala.inline
    def setIMPLEMENTED_INTERFACE_REMOVED(value: IMPLEMENTED_INTERFACE_REMOVED): Self = this.set("IMPLEMENTED_INTERFACE_REMOVED", value.asInstanceOf[js.Any])
    @scala.inline
    def setREQUIRED_ARG_ADDED(value: REQUIRED_ARG_ADDED): Self = this.set("REQUIRED_ARG_ADDED", value.asInstanceOf[js.Any])
    @scala.inline
    def setREQUIRED_DIRECTIVE_ARG_ADDED(value: REQUIRED_DIRECTIVE_ARG_ADDED): Self = this.set("REQUIRED_DIRECTIVE_ARG_ADDED", value.asInstanceOf[js.Any])
    @scala.inline
    def setREQUIRED_INPUT_FIELD_ADDED(value: REQUIRED_INPUT_FIELD_ADDED): Self = this.set("REQUIRED_INPUT_FIELD_ADDED", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_CHANGED_KIND(value: TYPE_CHANGED_KIND): Self = this.set("TYPE_CHANGED_KIND", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_REMOVED(value: TYPE_REMOVED): Self = this.set("TYPE_REMOVED", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_REMOVED_FROM_UNION(value: TYPE_REMOVED_FROM_UNION): Self = this.set("TYPE_REMOVED_FROM_UNION", value.asInstanceOf[js.Any])
    @scala.inline
    def setVALUE_REMOVED_FROM_ENUM(value: VALUE_REMOVED_FROM_ENUM): Self = this.set("VALUE_REMOVED_FROM_ENUM", value.asInstanceOf[js.Any])
  }
  
}

