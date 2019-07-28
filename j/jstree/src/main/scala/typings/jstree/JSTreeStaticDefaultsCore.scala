package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsCore extends js.Object {
  /**
    * the open / close animation duration in milliseconds - set this to `false` to disable the animation (default is `200`)
    * @name $.jstree.defaults.core.animation
    */
  var animation: js.UndefOr[js.Any] = js.undefined
  /**
    * determines what happens when a user tries to modify the structure of the tree
    * If left as `false` all operations like create, rename, delete, move or copy are prevented.
    * You can set this to `true` to allow all interactions or use a function to have better control.
    *
    * __Examples__
    *
    *	$('#tree').jstree({
    *		'core' : {
    *			'check_callback' : function (operation, node, node_parent, node_position, more) {
    *				// operation can be 'create_node', 'rename_node', 'delete_node', 'move_node', 'copy_node' or 'edit'
    *				// in case of 'rename_node' node_position is filled with the new node name
    *				return operation === 'rename_node' ? true : false;
    *			}
    *		}
    *	});
    *
    * @name $.jstree.defaults.core.check_callback
    */
  var check_callback: js.UndefOr[js.Any] = js.undefined
  /**
    * data configuration
    *
    * If left as `false` the HTML inside the jstree container element is used to populate the tree (that should be an unordered list with list items).
    *
    * You can also pass in a HTML string or a JSON array here.
    *
    * It is possible to pass in a standard jQuery-like AJAX config and jstree will automatically determine if the response is JSON or HTML and use that to populate the tree.
    * In addition to the standard jQuery ajax options here you can suppy functions for `data` and `url`, the functions will be run in the current instance's scope and a param will be passed indicating which node is being loaded, the return value of those functions will be used.
    *
    * The last option is to specify a function, that function will receive the node being loaded as argument and a second param which is a function which should be called with the result.
    *
    * __Examples__
    *
    *	// AJAX
    *	$('#tree').jstree({
    *		'core' : {
    *			'data' : {
    *				'url' : '/get/children/',
    *				'data' : function (node) {
    *					return { 'id' : node.id };
    *				}
    *			}
    *		});
    *
    *	// direct data
    *	$('#tree').jstree({
    *		'core' : {
    *			'data' : [
    *				'Simple root node',
    *				{
    *					'id' : 'node_2',
    *					'text' : 'Root node with options',
    *					'state' : { 'opened' : true, 'selected' : true },
    *					'children' : [ { 'text' : 'Child 1' }, 'Child 2']
    *				}
    *			]
    *		});
    *
    *	// function
    *	$('#tree').jstree({
    *		'core' : {
    *			'data' : function (obj, callback) {
    *				callback.call(this, ['Root 1', 'Root 2']);
    *			}
    *		});
    *
    * @name $.jstree.defaults.core.data
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Should the node should be toggled if the text is double clicked . Defaults to `true`
    * @name $.jstree.defaults.core.dblclick_toggle
    */
  var dblclick_toggle: js.UndefOr[Boolean] = js.undefined
  /**
    * if left as `true` all parents of all selected nodes will be opened once the tree loads (so that all selected nodes are visible to the user)
    * @name $.jstree.defaults.core.expand_selected_onload
    */
  var expand_selected_onload: js.UndefOr[Boolean] = js.undefined
  /**
    * Force node text to plain text (and escape HTML). Defaults to `false`
    * @name $.jstree.defaults.core.force_text
    */
  var force_text: js.UndefOr[Boolean] = js.undefined
  /**
    * a boolean indicating if multiple nodes can be selected
    * @name $.jstree.defaults.core.multiple
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * configure the various strings used throughout the tree
    *
    * You can use an object where the key is the string you need to replace and the value is your replacement.
    * Another option is to specify a function which will be called with an argument of the needed string and should return the replacement.
    * If left as `false` no replacement is made.
    *
    * __Examples__
    *
    *	$('#tree').jstree({
    *		'core' : {
    *			'strings' : {
    *				'Loading ...' : 'Please wait ...'
    *			}
    *		}
    *	});
    *
    * @name $.jstree.defaults.core.strings
    */
  var strings: js.UndefOr[js.Any] = js.undefined
  /**
    * theme configuration object
    * @name $.jstree.defaults.core.themes
    */
  var themes: js.UndefOr[JSTreeStaticDefaultsCoreThemes] = js.undefined
  /**
    * if left as `true` web workers will be used to parse incoming JSON data where possible, so that the UI will not be blocked by large requests.
    * Workers are however about 30% slower. Defaults to `true`
    * @name $.jstree.defaults.core.worker
    */
  var worker: js.UndefOr[Boolean] = js.undefined
  /**
    * a callback called with a single object parameter in the instance's scope when something goes wrong (operation prevented, ajax failed, etc)
    * @name $.jstree.defaults.core.error
    */
  def error(): js.Any
}

object JSTreeStaticDefaultsCore {
  @scala.inline
  def apply(
    error: () => js.Any,
    animation: js.Any = null,
    check_callback: js.Any = null,
    data: js.Any = null,
    dblclick_toggle: js.UndefOr[Boolean] = js.undefined,
    expand_selected_onload: js.UndefOr[Boolean] = js.undefined,
    force_text: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    strings: js.Any = null,
    themes: JSTreeStaticDefaultsCoreThemes = null,
    worker: js.UndefOr[Boolean] = js.undefined
  ): JSTreeStaticDefaultsCore = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction0(error))
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (check_callback != null) __obj.updateDynamic("check_callback")(check_callback)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(dblclick_toggle)) __obj.updateDynamic("dblclick_toggle")(dblclick_toggle)
    if (!js.isUndefined(expand_selected_onload)) __obj.updateDynamic("expand_selected_onload")(expand_selected_onload)
    if (!js.isUndefined(force_text)) __obj.updateDynamic("force_text")(force_text)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (strings != null) __obj.updateDynamic("strings")(strings)
    if (themes != null) __obj.updateDynamic("themes")(themes)
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[JSTreeStaticDefaultsCore]
  }
}

