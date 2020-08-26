package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaultsCheckbox extends js.Object {
  /**
    * This setting controls how cascading and undetermined nodes are applied.
    * If 'up' is in the string - cascading up is enabled, if 'down' is in the string - cascading down is enabled,
    * if 'undetermined' is in the string - undetermined nodes will be used.
    * If `three_state` is set to `true` this setting is automatically set to 'up+down+undetermined'. Defaults to ''.
    * @name $.jstree.defaults.checkbox.cascade
    * @plugin checkbox
    */
  var cascade: String = js.native
  /**
    * This setting controls if cascading down affects disabled checkboxes
    * @name $.jstree.defaults.checkbox.cascade_to_disabled
    * @plugin checkbox
    */
  var cascade_to_disabled: Boolean = js.native
  /**
    * This setting controls if cascading down affects hidden checkboxes
    * @name $.jstree.defaults.checkbox.cascade_to_hidden
    * @plugin checkbox
    */
  var cascade_to_hidden: Boolean = js.native
  /**
    * a boolean indicating if the selected style of a node should be kept, or removed. Defaults to `true`.
    * @name $.jstree.defaults.checkbox.keep_selected_style
    * @plugin checkbox
    */
  var keep_selected_style: Boolean = js.native
  /**
    * a boolean indicating if checkboxes should cascade down and have an undetermined state. Defaults to `true`.
    * @name $.jstree.defaults.checkbox.three_state
    * @plugin checkbox
    */
  var three_state: Boolean = js.native
  /**
    * This setting controls if checkbox are bound to the general tree selection
    * or to an internal array maintained by the checkbox plugin.
    * Defaults to `true`, only set to `false` if you know exactly what you are doing.
    * @name $.jstree.defaults.checkbox.tie_selection
    * @plugin checkbox
    */
  var tie_selection: Boolean = js.native
  /**
    * a boolean indicating if checkboxes should be visible (can be changed at a later time
    * using `show_checkboxes()` and `hide_checkboxes`). Defaults to `true`.
    * @name $.jstree.defaults.checkbox.visible
    * @plugin checkbox
    */
  var visible: Boolean = js.native
  /**
    * a boolean indicating if clicking anywhere on the node should act as clicking on the checkbox. Defaults to `true`.
    * @name $.jstree.defaults.checkbox.whole_node
    * @plugin checkbox
    */
  var whole_node: Boolean = js.native
}

object JSTreeStaticDefaultsCheckbox {
  @scala.inline
  def apply(
    cascade: String,
    cascade_to_disabled: Boolean,
    cascade_to_hidden: Boolean,
    keep_selected_style: Boolean,
    three_state: Boolean,
    tie_selection: Boolean,
    visible: Boolean,
    whole_node: Boolean
  ): JSTreeStaticDefaultsCheckbox = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cascade_to_disabled = cascade_to_disabled.asInstanceOf[js.Any], cascade_to_hidden = cascade_to_hidden.asInstanceOf[js.Any], keep_selected_style = keep_selected_style.asInstanceOf[js.Any], three_state = three_state.asInstanceOf[js.Any], tie_selection = tie_selection.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], whole_node = whole_node.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsCheckbox]
  }
  @scala.inline
  implicit class JSTreeStaticDefaultsCheckboxOps[Self <: JSTreeStaticDefaultsCheckbox] (val x: Self) extends AnyVal {
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
    def setCascade(value: String): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def setCascade_to_disabled(value: Boolean): Self = this.set("cascade_to_disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCascade_to_hidden(value: Boolean): Self = this.set("cascade_to_hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeep_selected_style(value: Boolean): Self = this.set("keep_selected_style", value.asInstanceOf[js.Any])
    @scala.inline
    def setThree_state(value: Boolean): Self = this.set("three_state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTie_selection(value: Boolean): Self = this.set("tie_selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhole_node(value: Boolean): Self = this.set("whole_node", value.asInstanceOf[js.Any])
  }
  
}

