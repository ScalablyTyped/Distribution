package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSTreeStaticDefaultsCore extends StObject {
  
  /**
    * the open / close animation duration in milliseconds - set this to `false` to disable the animation (default is `200`)
    * @name $.jstree.defaults.core.animation
    */
  var animation: js.UndefOr[Any] = js.undefined
  
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
  var check_callback: js.UndefOr[Any] = js.undefined
  
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
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Should the node be toggled if the text is double clicked. Defaults to `true`
    * @name $.jstree.defaults.core.dblclick_toggle
    */
  var dblclick_toggle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a callback called with a single object parameter in the instance's scope when something goes wrong
    * (operation prevented, ajax failed, etc)
    * @name $.jstree.defaults.core.error
    */
  def error(): Any
  
  /**
    * if left as `true` all parents of all selected nodes will be opened once the tree loads
    * (so that all selected nodes are visible to the user)
    * @name $.jstree.defaults.core.expand_selected_onload
    */
  var expand_selected_onload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Force node text to plain text (and escape HTML). Defaults to `false`
    * @name $.jstree.defaults.core.force_text
    */
  var force_text: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default keyboard shortcuts (an object where each key is the button name or combo - like 'enter', 'ctrl-space', 'p', etc
    * and the value is the function to execute in the instance's scope)
    * @name $.jstree.defaults.core.keyboard
    */
  var keyboard: js.UndefOr[JSTreeStaticDefaultsCoreKeyboard] = js.undefined
  
  /**
    * Should the loaded nodes be part of the state. Defaults to `false`
    * @name $.jstree.defaults.core.dblclick_toggle
    */
  var loaded_state: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a boolean indicating if multiple nodes can be selected
    * @name $.jstree.defaults.core.multiple
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the last active node be focused when the tree container is blurred and the focused again.
    * This helps working with screen readers. Defaults to `true`
    * @name $.jstree.defaults.core.restore_focus
    */
  var restore_focus: js.UndefOr[Boolean] = js.undefined
  
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
  var strings: js.UndefOr[Any] = js.undefined
  
  /**
    * theme configuration object
    * @name $.jstree.defaults.core.themes
    */
  var themes: js.UndefOr[JSTreeStaticDefaultsCoreThemes] = js.undefined
  
  /**
    * if left as `true` web workers will be used to parse incoming JSON data where possible,
    * so that the UI will not be blocked by large requests.
    * Workers are however about 30% slower. Defaults to `true`
    * @name $.jstree.defaults.core.worker
    */
  var worker: js.UndefOr[Boolean] = js.undefined
}
object JSTreeStaticDefaultsCore {
  
  inline def apply(error: () => Any): JSTreeStaticDefaultsCore = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction0(error))
    __obj.asInstanceOf[JSTreeStaticDefaultsCore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSTreeStaticDefaultsCore] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCheck_callback(value: Any): Self = StObject.set(x, "check_callback", value.asInstanceOf[js.Any])
    
    inline def setCheck_callbackUndefined: Self = StObject.set(x, "check_callback", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDblclick_toggle(value: Boolean): Self = StObject.set(x, "dblclick_toggle", value.asInstanceOf[js.Any])
    
    inline def setDblclick_toggleUndefined: Self = StObject.set(x, "dblclick_toggle", js.undefined)
    
    inline def setError(value: () => Any): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
    
    inline def setExpand_selected_onload(value: Boolean): Self = StObject.set(x, "expand_selected_onload", value.asInstanceOf[js.Any])
    
    inline def setExpand_selected_onloadUndefined: Self = StObject.set(x, "expand_selected_onload", js.undefined)
    
    inline def setForce_text(value: Boolean): Self = StObject.set(x, "force_text", value.asInstanceOf[js.Any])
    
    inline def setForce_textUndefined: Self = StObject.set(x, "force_text", js.undefined)
    
    inline def setKeyboard(value: JSTreeStaticDefaultsCoreKeyboard): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setLoaded_state(value: Boolean): Self = StObject.set(x, "loaded_state", value.asInstanceOf[js.Any])
    
    inline def setLoaded_stateUndefined: Self = StObject.set(x, "loaded_state", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setRestore_focus(value: Boolean): Self = StObject.set(x, "restore_focus", value.asInstanceOf[js.Any])
    
    inline def setRestore_focusUndefined: Self = StObject.set(x, "restore_focus", js.undefined)
    
    inline def setStrings(value: Any): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setThemes(value: JSTreeStaticDefaultsCoreThemes): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    
    inline def setThemesUndefined: Self = StObject.set(x, "themes", js.undefined)
    
    inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
