package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsCheckbox extends js.Object {
  /**
    * This setting controls how cascading and undetermined nodes are applied.
    * If 'up' is in the string - cascading up is enabled, if 'down' is in the string - cascading down is enabled, if 'undetermined' is in the string - undetermined nodes will be used.
    * If `three_state` is set to `true` this setting is automatically set to 'up+down+undetermined'. Defaults to ''.
    * @name $.jstree.defaults.checkbox.cascade
    * @plugin checkbox
    */
  var cascade: java.lang.String
  /**
    * This setting controls if cascading down affects disabled checkboxes
    * @name $.jstree.defaults.checkbox.cascade_to_disabled
    * @plugin checkbox
    */
  var cascade_to_disabled: scala.Boolean
  /**
    * This setting controls if cascading down affects hidden checkboxes
    * @name $.jstree.defaults.checkbox.cascade_to_hidden
    * @plugin checkbox
    */
  var cascade_to_hidden: scala.Boolean
  /**
    * a boolean indicating if the selected style of a node should be kept, or removed. Defaults to `true`.
    * @name $.jstree.defaults.checkbox.keep_selected_style
    * @plugin checkbox
    */
  var keep_selected_style: scala.Boolean
  /**
    * a boolean indicating if checkboxes should cascade down and have an undetermined state. Defaults to `true`.
    * @name $.jstree.defaults.checkbox.three_state
    * @plugin checkbox
    */
  var three_state: scala.Boolean
  /**
    * This setting controls if checkbox are bound to the general tree selection
    * or to an internal array maintained by the checkbox plugin.
    * Defaults to `true`, only set to `false` if you know exactly what you are doing.
    * @name $.jstree.defaults.checkbox.tie_selection
    * @plugin checkbox
    */
  var tie_selection: scala.Boolean
  /**
    * a boolean indicating if checkboxes should be visible (can be changed at a later time using `show_checkboxes()` and `hide_checkboxes`). Defaults to `true`.
    * @name $.jstree.defaults.checkbox.visible
    * @plugin checkbox
    */
  var visible: scala.Boolean
  /**
    * a boolean indicating if clicking anywhere on the node should act as clicking on the checkbox. Defaults to `true`.
    * @name $.jstree.defaults.checkbox.whole_node
    * @plugin checkbox
    */
  var whole_node: scala.Boolean
}

