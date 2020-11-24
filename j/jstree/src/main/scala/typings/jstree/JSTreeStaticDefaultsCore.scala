package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeStaticDefaultsCore extends js.Object {
  
  /**
    * the open / close animation duration in milliseconds - set this to `false` to disable the animation (default is `200`)
    * @name $.jstree.defaults.core.animation
    */
  var animation: js.UndefOr[js.Any] = js.native
  
  /**
    * determines what happens when a user tries to modify the structure of the tree
    * If left as `false` all operations like create, rename, delete, move or copy are prevented.
    * You can set this to `true` to allow all interactions or use a function to have better control.
    *
    * __Examples__
    *
    *  $('#tree').jstree({
    *      'core' : {
    *          'check_callback' : function (operation, node, node_parent, node_position, more) {
    *              // operation can be 'create_node', 'rename_node', 'delete_node', 'move_node', 'copy_node' or 'edit'
    *              // in case of 'rename_node' node_position is filled with the new node name
    *              return operation === 'rename_node' ? true : false;
    *          }
    *      }
    *  });
    *
    * @name $.jstree.defaults.core.check_callback
    */
  var check_callback: js.UndefOr[js.Any] = js.native
  
  /**
    * data configuration
    *
    * If left as `false` the HTML inside the jstree container element is used to populate the tree
    * (that should be an unordered list with list items).
    *
    * You can also pass in a HTML string or a JSON array here.
    *
    * It is possible to pass in a standard jQuery-like AJAX config and jstree will automatically determine
    * if the response is JSON or HTML and use that to populate the tree.
    * In addition to the standard jQuery ajax options here you can suppy functions for `data` and `url`,
    * the functions will be run in the current instance's scope and a param will be passed indicating which node is being loaded,
    * the return value of those functions will be used.
    *
    * The last option is to specify a function, that function will receive the node being loaded as argument
    * and a second param which is a function which should be called with the result.
    *
    * __Examples__
    *
    *  // AJAX
    *  $('#tree').jstree({
    *      'core' : {
    *          'data' : {
    *              'url' : '/get/children/',
    *              'data' : function (node) {
    *                  return { 'id' : node.id };
    *              }
    *          }
    *      });
    *
    *  // direct data
    *  $('#tree').jstree({
    *      'core' : {
    *          'data' : [
    *              'Simple root node',
    *              {
    *                  'id' : 'node_2',
    *                  'text' : 'Root node with options',
    *                  'state' : { 'opened' : true, 'selected' : true },
    *                  'children' : [ { 'text' : 'Child 1' }, 'Child 2']
    *              }
    *          ]
    *      });
    *
    *  // function
    *  $('#tree').jstree({
    *      'core' : {
    *          'data' : function (obj, callback) {
    *              callback.call(this, ['Root 1', 'Root 2']);
    *          }
    *      });
    *
    * @name $.jstree.defaults.core.data
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Should the node be toggled if the text is double clicked. Defaults to `true`
    * @name $.jstree.defaults.core.dblclick_toggle
    */
  var dblclick_toggle: js.UndefOr[Boolean] = js.native
  
  /**
    * a callback called with a single object parameter in the instance's scope when something goes wrong
    * (operation prevented, ajax failed, etc)
    * @name $.jstree.defaults.core.error
    */
  def error(): js.Any = js.native
  
  /**
    * if left as `true` all parents of all selected nodes will be opened once the tree loads
    * (so that all selected nodes are visible to the user)
    * @name $.jstree.defaults.core.expand_selected_onload
    */
  var expand_selected_onload: js.UndefOr[Boolean] = js.native
  
  /**
    * Force node text to plain text (and escape HTML). Defaults to `false`
    * @name $.jstree.defaults.core.force_text
    */
  var force_text: js.UndefOr[Boolean] = js.native
  
  /**
    * Default keyboard shortcuts (an object where each key is the button name or combo - like 'enter', 'ctrl-space', 'p', etc
    * and the value is the function to execute in the instance's scope)
    * @name $.jstree.defaults.core.keyboard
    */
  var keyboard: js.UndefOr[JSTreeStaticDefaultsCoreKeyboard] = js.native
  
  /**
    * Should the loaded nodes be part of the state. Defaults to `false`
    * @name $.jstree.defaults.core.dblclick_toggle
    */
  var loaded_state: js.UndefOr[Boolean] = js.native
  
  /**
    * a boolean indicating if multiple nodes can be selected
    * @name $.jstree.defaults.core.multiple
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the last active node be focused when the tree container is blurred and the focused again.
    * This helps working with screen readers. Defaults to `true`
    * @name $.jstree.defaults.core.restore_focus
    */
  var restore_focus: js.UndefOr[Boolean] = js.native
  
  /**
    * configure the various strings used throughout the tree
    *
    * You can use an object where the key is the string you need to replace and the value is your replacement.
    * Another option is to specify a function which will be called with an argument of the needed string and should return the replacement.
    * If left as `false` no replacement is made.
    *
    * __Examples__
    *
    *  $('#tree').jstree({
    *      'core' : {
    *          'strings' : {
    *              'Loading ...' : 'Please wait ...'
    *          }
    *      }
    *  });
    *
    * @name $.jstree.defaults.core.strings
    */
  var strings: js.UndefOr[js.Any] = js.native
  
  /**
    * theme configuration object
    * @name $.jstree.defaults.core.themes
    */
  var themes: js.UndefOr[JSTreeStaticDefaultsCoreThemes] = js.native
  
  /**
    * if left as `true` web workers will be used to parse incoming JSON data where possible,
    * so that the UI will not be blocked by large requests.
    * Workers are however about 30% slower. Defaults to `true`
    * @name $.jstree.defaults.core.worker
    */
  var worker: js.UndefOr[Boolean] = js.native
}
object JSTreeStaticDefaultsCore {
  
  @scala.inline
  def apply(error: () => js.Any): JSTreeStaticDefaultsCore = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction0(error))
    __obj.asInstanceOf[JSTreeStaticDefaultsCore]
  }
  
  @scala.inline
  implicit class JSTreeStaticDefaultsCoreOps[Self <: JSTreeStaticDefaultsCore] (val x: Self) extends AnyVal {
    
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
    def setError(value: () => js.Any): Self = this.set("error", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setCheck_callback(value: js.Any): Self = this.set("check_callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck_callback: Self = this.set("check_callback", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDblclick_toggle(value: Boolean): Self = this.set("dblclick_toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblclick_toggle: Self = this.set("dblclick_toggle", js.undefined)
    
    @scala.inline
    def setExpand_selected_onload(value: Boolean): Self = this.set("expand_selected_onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand_selected_onload: Self = this.set("expand_selected_onload", js.undefined)
    
    @scala.inline
    def setForce_text(value: Boolean): Self = this.set("force_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce_text: Self = this.set("force_text", js.undefined)
    
    @scala.inline
    def setKeyboard(value: JSTreeStaticDefaultsCoreKeyboard): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setLoaded_state(value: Boolean): Self = this.set("loaded_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaded_state: Self = this.set("loaded_state", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setRestore_focus(value: Boolean): Self = this.set("restore_focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestore_focus: Self = this.set("restore_focus", js.undefined)
    
    @scala.inline
    def setStrings(value: js.Any): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    
    @scala.inline
    def setThemes(value: JSTreeStaticDefaultsCoreThemes): Self = this.set("themes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemes: Self = this.set("themes", js.undefined)
    
    @scala.inline
    def setWorker(value: Boolean): Self = this.set("worker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
  }
}
