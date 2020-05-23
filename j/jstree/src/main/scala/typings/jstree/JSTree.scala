package typings.jstree

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTree extends JQuery {
  /**
    * example usage in angular:
    * public sourceTreeNativeElement: JSTree;
    * this.sourceTreeNativeElement = $(this.sourceTree.nativeElement) as JSTree;
    * this.sourceTreeNativeElement.jstree(true).settings.core.data = [];
    * this.sourceTreeNativeElement.jstree(true).refresh();
    */
  var settings: js.UndefOr[JSTreeStaticDefaults] = js.native
  /**
    * appends HTML content to the tree. Used internally.
    * @private
    * @name _append_html_data(obj, data)
    * @param  {mixed} obj the node to append to
    * @param  {String} data the HTML string to parse and append
    * @param {function} callback function which takes boolean flag executes after append (AP: originally lack of comment)
    * @trigger model.jstree, changed.jstree
    */
  def _append_html_data(dom: js.Any, data: String, cb: js.Function1[/* flag */ Boolean, Unit]): Unit = js.native
  /**
    * appends JSON content to the tree. Used internally.
    * @private
    * @name _append_json_data(obj, data)
    * @param  {mixed} dom the node to append to
    * @param  {String} data the JSON object to parse and append
    * @param  {function} cb function which takes boolean flag executes after append (AP: originally lack of comment)
    * @param  {Boolean} force_processing internal param - do not set
    * @trigger model.jstree, changed.jstree
    */
  def _append_json_data(dom: js.Any, data: String, cb: js.Function1[/* flag */ Boolean, Unit], force_processing: Boolean): Unit = js.native
  /**
    * Cascades checked state to a node and all its descendants. This function does NOT affect hidden and disabled nodes (or their descendants).
    * However if these unaffected nodes are already selected their ids will be included in the returned array.
    * @private
    * @param {string} id the node ID
    * @param {bool} checkedState should the nodes be checked or not
    * @returns {Array} Array of all node id's (in this tree branch) that are checked.
    */
  def _cascade_new_checked_state(id: String, checkedState: Boolean): js.Array[String] = js.native
  /**
    * Create a prototype node
    * @name _create_prototype_node()
    * @return {DOMElement}
    */
  def _create_prototype_node(): HTMLElement = js.native
  /**
    * gets the first child of a DOM node. Used internally.
    * @private
    * @name _firstChild(dom)
    * @param  {DOMElement} dom
    * @return {DOMElement}
    */
  def _firstChild(dom: HTMLElement): HTMLElement = js.native
  def _kbevent_to_func(e: Event): js.Function1[/* e */ Event, Unit] = js.native
  /**
    * handles the actual loading of a node. Used only internally.
    * @private
    * @name _load_node(obj [, callback])
    * @param  {mixed} obj
    * @param  {function} callback a function to be executed once loading is complete, the function is executed in the instance's scope and receives one argument - a boolean status
    * @return {Boolean}
    */
  def _load_node(obj: js.Any): Boolean = js.native
  def _load_node(obj: js.Any, callback: js.Function1[/* status */ Boolean, Unit]): Boolean = js.native
  /**
    * load an array of nodes (will also load unavailable nodes as soon as they appear in the structure). Used internally.
    * @private
    * @name _load_nodes(nodes [, callback])
    * @param  {array} nodes
    * @param  {function} callback a function to be executed once loading is complete, the function is executed in the instance's scope and receives one argument - the array passed to _load_nodes
    * @param  {Boolean} is_callback - if false reloads node (AP - original comment missing in source code)
    * @param  {Boolean} force_reload - if true force reloads node (AP - original comment missing in source code)
    */
  def _load_nodes(nodes: js.Array[_]): Unit = js.native
  def _load_nodes(nodes: js.Array[_], callback: js.Function1[/* nodes */ js.Array[_], Unit]): Unit = js.native
  def _load_nodes(nodes: js.Array[_], callback: js.Function1[/* nodes */ js.Array[_], Unit], is_callback: Boolean): Unit = js.native
  def _load_nodes(
    nodes: js.Array[_],
    callback: js.Function1[/* nodes */ js.Array[_], Unit],
    is_callback: Boolean,
    force_reload: Boolean
  ): Unit = js.native
  /**
    * gets the next sibling of a DOM node. Used internally.
    * @private
    * @name _nextSibling(dom)
    * @param  {DOMElement} dom
    * @return {DOMElement}
    */
  def _nextSibling(dom: HTMLElement): HTMLElement = js.native
  /**
    * adds a node to the list of nodes to redraw. Used only internally.
    * @private
    * @name _node_changed(obj)
    * @param  {mixed} obj
    */
  def _node_changed(obj: js.Any): Unit = js.native
  /**
    * opens every parent of a node (node should be loaded)
    * @name _open_to(obj)
    * @param {mixed} obj the node to reveal
    * @private
    */
  def _open_to(obj: js.Any): Unit = js.native
  /**
    * parses a node from a JSON object (used when dealing with flat data, which has no nesting of children,
    * but has id and parent properties) and appends it to the in memory tree model. Used internally.
    * @private
    * @name _parse_model_from_flat_json(d [, p, ps])
    * @param  {Object} d the JSON object to parse
    * @param  {String} p the parent ID
    * @param  {Array} ps list of all parents
    * @return {String} the ID of the object added to the model
    */
  def _parse_model_from_flat_json(d: js.Any): String = js.native
  def _parse_model_from_flat_json(d: js.Any, p: String): String = js.native
  def _parse_model_from_flat_json(d: js.Any, p: String, ps: js.Array[_]): String = js.native
  /**
    * parses a node from a jQuery object and appends them to the in memory tree model. Used internally.
    * @private
    * @name _parse_model_from_html(d [, p, ps])
    * @param  {jQuery} d the jQuery object to parse
    * @param  {String} p the parent ID
    * @param  {Array} ps list of all parents
    * @return {String} the ID of the object added to the model
    */
  def _parse_model_from_html(d: JQuery): String = js.native
  def _parse_model_from_html(d: JQuery, p: String): String = js.native
  def _parse_model_from_html(d: JQuery, p: String, ps: js.Array[_]): String = js.native
  /**
    * parses a node from a JSON object and appends it to the in memory tree model. Used internally.
    * @private
    * @name _parse_model_from_json(d [, p, ps])
    * @param  {Object} d the JSON object to parse
    * @param  {String} p the parent ID
    * @param  {Array} ps list of all parents
    * @return {String} the ID of the object added to the model
    */
  def _parse_model_from_json(d: js.Any): String = js.native
  def _parse_model_from_json(d: js.Any, p: String): String = js.native
  def _parse_model_from_json(d: js.Any, p: String, ps: js.Array[_]): String = js.native
  /**
    * gets the previous sibling of a DOM node. Used internally.
    * @private
    * @name _previousSibling(dom)
    * @param  {DOMElement} dom
    * @return {DOMElement}
    */
  def _previousSibling(dom: HTMLElement): HTMLElement = js.native
  /**
    * redraws all nodes that need to be redrawn. Used internally.
    * @private
    * @name _redraw()
    * @trigger redraw.jstree
    */
  def _redraw(): Unit = js.native
  /**
    * opens nodes that need to be opened to reveal the search results. Used only internally.
    * @private
    * @name _search_open(d)
    * @param {Array} d an array of node IDs
    * @plugin search
    */
  def _search_open(d: js.Array[String]): Unit = js.native
  /**
    * show the prepared context menu for a node
    * @name _show_contextmenu(obj, x, y, i)
    * @param {mixed} obj the node
    * @param {Number} x the x-coordinate relative to the document to show the menu at
    * @param {Number} y the y-coordinate relative to the document to show the menu at
    * @param {Number} i the object of items to show
    * @plugin contextmenu
    * @trigger show_contextmenu.jstree
    * @private
    */
  def _show_contextmenu(obj: js.Any, x: Double, y: Double, i: Double): Unit = js.native
  /**
    * set the undetermined state where and if necessary. Used internally.
    * @private
    * @name _undetermined()
    * @plugin checkbox
    */
  def _undetermined(): Unit = js.native
  /**
    * called when a node is selected by the user. Used internally.
    * @private
    * @name activate_node(obj, e)
    * @param {mixed} obj the node
    * @param {Object} e the related event
    * @trigger activate_node.jstree, changed.jstree
    */
  def activate_node(obj: js.Any, e: js.Any): Unit = js.native
  /**
    * bind all events. Used internally.
    * @private
    * @name bind()
    */
  def bind(): js.Any = js.native
  /**
    * check if there is something in the buffer to paste
    * @name can_paste()
    * @return {Boolean}
    */
  def can_paste(): Boolean = js.native
  /**
    * check if an operation is premitted on the tree. Used internally.
    * @private
    * @name check(chk, obj, par, pos)
    * @param  {String} chk the operation to check, can be "create_node", "rename_node", "delete_node", "copy_node" or "move_node"
    * @param  {mixed} obj the node
    * @param  {mixed} par the parent
    * @param  {mixed} pos the position to insert at, or if "rename_node" - the new name
    * @param  {mixed} more some various additional information, for example if a "move_node" operations is triggered by DND this will be the hovered node
    * @return {Boolean}
    */
  def check(chk: String, obj: js.Any, par: js.Any, pos: js.Any, more: js.Any): Boolean = js.native
  /**
    * checks all nodes in the tree (only if tie_selection in checkbox settings is false, otherwise select_all will be called internally)
    * @name check_all()
    * @trigger check_all.jstree, changed.jstree
    * @plugin checkbox
    */
  def check_all(): js.Any = js.native
  /**
    * check a node (only if tie_selection in checkbox settings is false, otherwise select_node will be called internally)
    * @name check_node(obj)
    * @param {mixed} obj an array can be used to check multiple nodes
    * @trigger check_node.jstree
    * @plugin checkbox
    */
  def check_node(obj: js.Any, e: js.Any): js.Any = js.native
  /**
    * clear the buffer of previously copied or cut nodes
    * @name clear_buffer()
    * @trigger clear_buffer.jstree
    */
  def clear_buffer(): Unit = js.native
  /**
    * used to clear the last search (removes classes and shows all nodes if filtering is on)
    * @name clear_search()
    * @plugin search
    * @trigger clear_search.jstree
    */
  def clear_search(): Unit = js.native
  /**
    * clear the state on the user's computer
    * @name clear_state()
    * @plugin state
    */
  def clear_state(): Unit = js.native
  /**
    * closes all nodes within a node (or the tree), revealing their children
    * @name close_all([obj, animation])
    * @param {mixed} obj the node to close recursively, omit to close all nodes in the tree
    * @param {Number} animation the animation duration in milliseconds when closing the nodes, the default is no animation
    * @trigger close_all.jstree
    */
  def close_all(): Unit = js.native
  def close_all(obj: js.Any): Unit = js.native
  def close_all(obj: js.Any, animation: Double): Unit = js.native
  /**
    * closes a node, hiding its children
    * @name close_node(obj [, animation])
    * @param {mixed} obj the node to close
    * @param {Number} animation the animation duration in milliseconds
    * when closing the node (overrides the `core.animation` setting). Use `false` for no animation.
    * @trigger close_node.jstree, after_close.jstree
    */
  def close_node(obj: js.Any): Unit = js.native
  def close_node(obj: js.Any, animation: js.Any): Unit = js.native
  /**
    * ### Conditionalclose plugin
    *
    * This plugin allows defining a callback to allow or deny node close by user input (close node method).
    */
  def conditionalclose(options: js.Any, parent: js.Any): js.Any = js.native
  /**
    * ### Conditionalselect plugin
    *
    * This plugin allows defining a callback to allow or deny node selection by user input (activate node method).
    */
  def conditionalselect(options: js.Any, parent: js.Any): js.Any = js.native
  /**
    * copy a node (a later call to `paste(obj)` would copy the node)
    * @name copy(obj)
    * @param  {mixed} obj multiple objects can be passed using an array
    * @trigger copy.jstre
    */
  def copy(obj: js.Any): Unit = js.native
  /**
    * copy a node to a new parent
    * @name copy_node(obj, par [, pos, callback, is_loaded])
    * @param  {mixed} obj the node to copy, pass an array to copy multiple nodes
    * @param  {mixed} par the new parent
    * @param  {mixed} pos the position to insert at (besides integer values, "first" and "last" are supported, as well as "before" and "after"), defaults to integer `0`
    * @param  {function} callback a function to call once the move is completed, receives 3 arguments - the node, the new parent and the position
    * @param  {Boolean} is_loaded internal parameter indicating if the parent node has been loaded
    * @param  {Boolean} skip_redraw internal parameter indicating if the tree should be redrawn
    * @param  {Boolean} instance internal parameter indicating if the node comes from another instance
    * @trigger model.jstree copy_node.jstree
    */
  def copy_node(obj: js.Any, par: js.Any): Unit = js.native
  def copy_node(obj: js.Any, par: js.Any, pos: js.Any): Unit = js.native
  def copy_node(
    obj: js.Any,
    par: js.Any,
    pos: js.Any,
    callback: js.Function3[/* node */ js.Any, /* new_par */ js.Any, /* pos */ js.Any, Unit]
  ): Unit = js.native
  def copy_node(
    obj: js.Any,
    par: js.Any,
    pos: js.Any,
    callback: js.Function3[/* node */ js.Any, /* new_par */ js.Any, /* pos */ js.Any, Unit],
    is_loaded: Boolean
  ): Unit = js.native
  def copy_node(
    obj: js.Any,
    par: js.Any,
    pos: js.Any,
    callback: js.Function3[/* node */ js.Any, /* new_par */ js.Any, /* pos */ js.Any, Unit],
    is_loaded: Boolean,
    skip_redraw: Boolean
  ): Unit = js.native
  def copy_node(
    obj: js.Any,
    par: js.Any,
    pos: js.Any,
    callback: js.Function3[/* node */ js.Any, /* new_par */ js.Any, /* pos */ js.Any, Unit],
    is_loaded: Boolean,
    skip_redraw: Boolean,
    origin: Boolean
  ): Unit = js.native
  /**
    * create a new node (do not confuse with load_node)
    * @name create_node([obj, node, pos, callback, is_loaded])
    * @param  {mixed}   par       the parent node (to create a root node use either "#" (string) or `null`)
    * @param  {mixed}   node      the data for the new node (a valid JSON object, or a simple string with the name)
    * @param  {mixed}   pos       the index at which to insert the node, "first" and "last" are also supported, default is "last"
    * @param  {Function} callback a function to be called once the node is created
    * @param  {Boolean} is_loaded internal argument indicating if the parent node was succesfully loaded
    * @return {String}            the ID of the newly create node
    * @trigger model.jstree, create_node.jstree
    */
  def create_node(): String = js.native
  def create_node(par: js.Any): String = js.native
  def create_node(par: js.Any, node: js.Any): String = js.native
  def create_node(par: js.Any, node: js.Any, pos: js.Any): String = js.native
  def create_node(par: js.Any, node: js.Any, pos: js.Any, callback: js.Any): String = js.native
  def create_node(par: js.Any, node: js.Any, pos: js.Any, callback: js.Any, is_loaded: Boolean): String = js.native
  /**
    * cut a node (a later call to `paste(obj)` would move the node)
    * @name cut(obj)
    * @param  {mixed} obj multiple objects can be passed using an array
    * @trigger cut.jstree
    */
  def cut(obj: js.Any): Unit = js.native
  /**
    * removes the hover state from a nodecalled when a node is no longer hovered by the user. Used internally.
    * @private
    * @name dehover_node(obj)
    * @param {mixed} obj
    * @trigger dehover_node.jstree
    */
  def dehover_node(obj: js.Any): Unit = js.native
  /**
    * remove a node
    * @name delete_node(obj)
    * @param  {mixed} obj the node, you can pass an array to delete multiple nodes
    * @return {Boolean}
    * @trigger delete_node.jstree, changed.jstree
    */
  def delete_node(obj: js.Any): Boolean = js.native
  /**
    * deselect all selected nodes
    * @name deselect_all([supress_event])
    * @param {Boolean} supress_event if set to `true` the `changed.jstree` event won't be triggered
    * @trigger deselect_all.jstree, changed.jstree
    */
  def deselect_all(): Unit = js.native
  def deselect_all(supress_event: Boolean): Unit = js.native
  /**
    * deselect a node
    * @name deselect_node(obj [, supress_event])
    * @param {mixed} obj an array can be used to deselect multiple nodes
    * @param {Boolean} supress_event if set to `true` the `changed.jstree` event won't be triggered
    * @trigger deselect_node.jstree, changed.jstree
    */
  def deselect_node(obj: js.Any): Unit = js.native
  def deselect_node(obj: js.Any, supress_event: Boolean): Unit = js.native
  def deselect_node(obj: js.Any, supress_event: Boolean, e: js.Any): Unit = js.native
  /**
    * destroy an instance
    * @name destroy()
    * @param  {Boolean} keep_html if not set to `true` the container will be emptied, otherwise the current DOM elements will be kept intact
    */
  def destroy(): Unit = js.native
  def destroy(keep_html: Boolean): Unit = js.native
  /**
    * disable a node's checkbox
    * @name disable_checkbox(obj)
    * @param {mixed} obj an array can be used too
    * @trigger disable_checkbox.jstree
    * @plugin checkbox
    */
  def disable_checkbox(obj: js.Any): Boolean = js.native
  /**
    * disables a node - so that it can not be selected
    * @name disable_node(obj)
    * @param {mixed} obj the node to disable
    * @trigger disable_node.jstree
    */
  def disable_node(obj: js.Any): Boolean = js.native
  /**
    * redraws a single node's children. Used internally.
    * @private
    * @name draw_children(node)
    * @param {mixed} node the node whose children will be redrawn
    */
  def draw_children(node: js.Any): Unit = js.native
  /**
    * put a node in edit mode (input field to rename the node)
    * @name edit(obj [, default_text, callback])
    * @param  {mixed} obj
    * @param  {String} default_text the text to populate the input with (if omitted or set to a non-string value the node's text value is used)
    * @param  {Function} callback a function to be called once the text box is blurred,
    * it is called in the instance's scope and receives the node, a status parameter (true if the rename is successful, false otherwise)
    * and a boolean indicating if the user cancelled the edit. You can access the node's title using .text
    */
  def edit(obj: js.Any): Unit = js.native
  def edit(obj: js.Any, default_text: String): Unit = js.native
  def edit(
    obj: js.Any,
    default_text: String,
    callback: js.Function3[/* node */ js.Any, /* status */ Boolean, /* canceled */ Boolean, Unit]
  ): Unit = js.native
  /**
    * enable a node's checkbox
    * @name enable_checkbox(obj)
    * @param {mixed} obj an array can be used too
    * @trigger enable_checkbox.jstree
    * @plugin checkbox
    */
  def enable_checkbox(obj: js.Any): Boolean = js.native
  /**
    * enables a node - so that it can be selected
    * @name enable_node(obj)
    * @param {mixed} obj the node to enable
    * @trigger enable_node.jstree
    */
  def enable_node(obj: js.Any): Boolean = js.native
  /**
    * get an array of all bottom level checked nodes (ignoring selected parents) (if tie_selection is on in the settings this function will return the same as get_bottom_selected)
    * @name get_bottom_checked([full])
    * @param  {mixed}  full if set to `true` the returned array will consist of the full node objects, otherwise - only IDs will be returned
    * @return {Array}
    * @plugin checkbox
    */
  def get_bottom_checked(full: js.Any): js.Array[_] = js.native
  /**
    * get an array of all bottom level selected nodes (ignoring selected parents)
    * @name get_top_selected([full])
    * @param  {mixed}  full if set to `true` the returned array will consist of the full node objects, otherwise - only IDs will be returned
    * @return {Array}
    */
  def get_bottom_selected(): js.Array[_] = js.native
  def get_bottom_selected(full: js.Any): js.Array[_] = js.native
  /**
    * get the current buffer (any nodes that are waiting for a paste operation)
    * @name get_buffer()
    * @return {Object} an object consisting of `mode` ("copy_node" or "move_node"), `node` (an array of objects) and `inst` (the instance)
    */
  def get_buffer(): Buffer = js.native
  /**
    * get an array of all checked nodes (if tie_selection is on in the settings this function will return the same as get_selected)
    * @name get_checked([full])
    * @param  {mixed}  full if set to `true` the returned array will consist of the full node objects, otherwise - only IDs will be returned
    * @return {Array}
    * @plugin checkbox
    */
  def get_checked(full: js.Any): js.Array[_] = js.native
  /**
    * Gets ids of nodes selected in branch (of tree) specified by id (does not include the node specified by id)
    * @name get_checked_descendants(obj)
    * @param {string} id the node ID
    * @return {Array} array of IDs
    * @plugin checkbox
    */
  def get_checked_descendants(id: String): js.Array[String] = js.native
  /**
    * get a jQuery collection of all the children of a node (node must be rendered), returns false on error
    * @name get_children_dom(obj)
    * @param  {mixed} obj
    * @return {jQuery}
    */
  def get_children_dom(obj: js.Any): JQuery | Boolean = js.native
  /**
    * trigger an event. Used internally.
    * @private
    * @name trigger(ev [, data])
    * @param  {String} ev the name of the event to trigger
    * @param  {Object} data additional data to pass with the event
    */
  /*
    * defined in JQuery
    */
  // trigger: (ev: string, data?: Object) => any;
  /**
    * returns the jQuery extended instance container
    * @name get_container()
    * @return {jQuery}
    */
  def get_container(): JQuery = js.native
  /**
    * returns the jQuery extended main UL node inside the instance container. Used internally.
    * @private
    * @name get_container_ul()
    * @return {jQuery}
    */
  def get_container_ul(): JQuery = js.native
  /**
    * get the node icon for a node
    * @name get_icon(obj)
    * @param {mixed} obj
    * @return {String}
    */
  def get_icon(obj: js.Any): String = js.native
  /**
    * gets a JSON representation of a node (or the whole tree)
    * @name get_json([obj, options])
    * @param  {mixed} obj
    * @param  {Object} options
    * @param  {Boolean} options.no_state do not return state information
    * @param  {Boolean} options.no_id do not return ID
    * @param  {Boolean} options.no_children do not include children
    * @param  {Boolean} options.no_data do not include node data
    * @param  {Boolean} options.no_li_attr do not include LI attributes
    * @param  {Boolean} options.no_a_attr do not include A attributes
    * @param  {Boolean} options.flat return flat JSON instead of nested
    * @return {Object}
    */
  def get_json(): js.Any = js.native
  def get_json(obj: js.Any): js.Any = js.native
  def get_json(obj: js.Any, options: JSTreeGetJsonOptions): js.Any = js.native
  def get_json(obj: js.Any, options: JSTreeGetJsonOptions, flat: Boolean): js.Any = js.native
  /**
    * get the next visible node that is below the `obj` node. If `strict` is set to `true` only sibling nodes are returned.
    * @name get_next_dom(obj [, strict])
    * @param  {mixed} obj
    * @param  {Boolean} strict
    * @return {jQuery}
    */
  def get_next_dom(obj: js.Any): JQuery = js.native
  def get_next_dom(obj: js.Any, strict: Boolean): JQuery = js.native
  /**
    * get the JSON representation of a node (or the actual jQuery extended DOM node) by using any input (child DOM element, ID string, selector, etc)
    * @name get_node(obj [, as_dom])
    * @param  {mixed} obj
    * @param  {Boolean} as_dom
    * @return {Object|jQuery}
    */
  def get_node(obj: js.Any): js.Any = js.native
  def get_node(obj: js.Any, as_dom: Boolean): js.Any = js.native
  /**
    * get the parent ID of a node
    * @name get_parent(obj)
    * @param  {mixed} obj
    * @return {String}
    */
  def get_parent(obj: js.Any): String = js.native
  /**
    * get the path to a node, either consisting of node texts, or of node IDs, optionally glued together (otherwise an array)
    * @name get_path(obj [, glue, ids])
    * @param  {mixed} obj the node
    * @param  {String} glue if you want the path as a string - pass the glue here (for example '/'), if a falsy value is supplied here, an array is returned
    * @param  {Boolean} ids if set to true build the path using ID, otherwise node text is used
    * @return {mixed}
    */
  def get_path(obj: js.Any): js.Any = js.native
  def get_path(obj: js.Any, glue: String): js.Any = js.native
  def get_path(obj: js.Any, glue: String, ids: Boolean): js.Any = js.native
  /**
    * get the previous visible node that is above the `obj` node. If `strict` is set to `true` only sibling nodes are returned.
    * @name get_prev_dom(obj [, strict])
    * @param  {mixed} obj
    * @param  {Boolean} strict
    * @return {jQuery}
    */
  def get_prev_dom(obj: js.Any): JQuery = js.native
  def get_prev_dom(obj: js.Any, strict: Boolean): JQuery = js.native
  /**
    * types plugin
    */
  /**
    * used to retrieve the type settings object for a node
    * @name get_rules(obj)
    * @param {mixed} obj the node to find the rules for
    * @return {Object}
    * @plugin types
    */
  def get_rules(obj: js.Any): js.Any = js.native
  /**
    * get an array of all selected nodes
    * @name get_selected([full])
    * @param  {mixed}  full if set to `true` the returned array will consist of the full node objects, otherwise - only IDs will be returned
    * @return {Array}
    */
  def get_selected(): js.Array[_] = js.native
  def get_selected(full: js.Any): js.Array[_] = js.native
  /**
    * gets the current state of the tree so that it can be restored later with `set_state(state)`. Used internally.
    * @name get_state()
    * @private
    * @return {Object}
    */
  def get_state(): js.Any = js.native
  /**
    * gets string replacements (localization). Used internally.
    * @private
    * @name get_string(key)
    * @param  {String} key
    * @return {String}
    */
  def get_string(key: String): String = js.native
  /**
    * get the text value of a node
    * @name get_text(obj)
    * @param  {mixed} obj the node
    * @return {String}
    */
  def get_text(obj: js.Any): String = js.native
  /**
    * gets the name of the currently applied theme name
    * @name get_theme()
    * @return {String}
    */
  def get_theme(): String = js.native
  /**
    * gets the name of the currently applied theme variant
    * @name get_theme()
    * @return {String}
    */
  def get_theme_variant(): String = js.native
  /**
    * get an array of all top level checked nodes (ignoring children of checked nodes) (if tie_selection is on in the settings this function will return the same as get_top_selected)
    * @name get_top_checked([full])
    * @param  {mixed}  full if set to `true` the returned array will consist of the full node objects, otherwise - only IDs will be returned
    * @return {Array}
    * @plugin checkbox
    */
  def get_top_checked(full: js.Any): js.Array[_] = js.native
  /**
    * get an array of all top level selected nodes (ignoring children of selected nodes)
    * @name get_top_selected([full])
    * @param  {mixed}  full if set to `true` the returned array will consist of the full node objects, otherwise - only IDs will be returned
    * @return {Array}
    */
  def get_top_selected(): js.Array[_] = js.native
  def get_top_selected(full: js.Any): js.Array[_] = js.native
  /**
    * used to retrieve the type string or settings object for a node
    * @name get_type(obj [, rules])
    * @param {mixed} obj the node to find the rules for
    * @param {Boolean} rules if set to `true` instead of a string the settings object will be returned
    * @return {String|Object}
    * @plugin types
    */
  def get_type(obj: js.Any): js.Any = js.native
  def get_type(obj: js.Any, rules: js.Any): js.Any = js.native
  /**
    * checkbox plugin
    */
  /**
    * get an array of all nodes whose state is "undetermined"
    * @name get_undetermined([full])
    * @param  {boolean} full: if set to `true` the returned array will consist of the full node objects, otherwise - only IDs will be returned
    * @return {Array}
    * @plugin checkbox
    */
  def get_undetermined(full: Boolean): js.Array[_] = js.native
  /**
    * hides all nodes
    * @name hide_all()
    * @trigger hide_all.jstree
    */
  def hide_all(skip_redraw: Boolean): Boolean = js.native
  /**
    * hide the node checkbox icons
    * @name hide_checkboxes()
    * @plugin checkbox
    */
  def hide_checkboxes(): Unit = js.native
  /**
    * hides the connecting dots
    * @name hide_dots()
    */
  def hide_dots(): Unit = js.native
  /**
    * hide the node ellipsis
    * @name hide_ellipsis()
    */
  def hide_ellipsis(): Unit = js.native
  /**
    * hide the icon on an individual node
    * @name hide_icon(obj)
    * @param {mixed} obj
    */
  def hide_icon(obj: js.Any): Unit = js.native
  /**
    * hide the node icons
    * @name hide_icons()
    */
  def hide_icons(): Unit = js.native
  /**
    * hides a node - it is still in the structure but will not be visible
    * @name hide_node(obj)
    * @param {mixed} obj the node to hide
    * @param {Boolean} skip_redraw internal parameter controlling if redraw is called
    * @trigger hide_node.jstree
    */
  def hide_node(obj: js.Any, skip_redraw: Boolean): Boolean = js.native
  /**
    * hides the striped background on the container
    * @name hide_stripes()
    */
  def hide_stripes(): Unit = js.native
  /**
    * applies the hover state on a node, called when a node is hovered by the user. Used internally.
    * @private
    * @name hover_node(obj)
    * @param {mixed} obj
    * @trigger hover_node.jstree
    */
  def hover_node(obj: js.Any): Unit = js.native
  def init(el: String, options: js.Any): Unit = js.native
  def init(el: JQuery, options: js.Any): Unit = js.native
  /**
    * used to decorate an instance with a plugin. Used internally.
    * @private
    * @name init(el, options)
    * @param {DOMElement|jQuery|String} el the element we are transforming
    * @param {Object} options options for this instance
    * @trigger init.jstree, loading.jstree, loaded.jstree, ready.jstree, changed.jstree
    */
  def init(el: HTMLElement, options: js.Any): Unit = js.native
  /**
    * checks if a node is checked (if tie_selection is on in the settings this function will return the same as is_selected)
    * @name is_checked(obj)
    * @param  {mixed}  obj
    * @return {Boolean}
    * @plugin checkbox
    */
  def is_checked(obj: js.Any): Boolean = js.native
  /**
    * check if a node is in a closed state
    * @name is_closed(obj)
    * @param  {mixed} obj
    * @return {Boolean}
    */
  def is_closed(obj: js.Any): Boolean = js.native
  /**
    * checks if a node is disabled (not selectable)
    * @name is_disabled(obj)
    * @param  {mixed} obj
    * @return {Boolean}
    */
  def is_disabled(obj: js.Any): Boolean = js.native
  /**
    * determines if a node is hidden
    * @name is_hidden(obj)
    * @param {mixed} obj the node
    */
  def is_hidden(obj: js.Any): Boolean = js.native
  /**
    * check if a node has no children
    * @name is_leaf(obj)
    * @param  {mixed} obj
    * @return {Boolean}
    */
  def is_leaf(obj: js.Any): Boolean = js.native
  /**
    * checks if a node is loaded (its children are available)
    * @name is_loaded(obj)
    * @param  {mixed} obj
    * @return {Boolean}
    */
  def is_loaded(obj: js.Any): Boolean = js.native
  /**
    * check if a node is currently loading (fetching children)
    * @name is_loading(obj)
    * @param  {mixed} obj
    * @return {Boolean}
    */
  def is_loading(obj: js.Any): Boolean = js.native
  /**
    * check if a node is opened
    * @name is_open(obj)
    * @param  {mixed} obj
    * @return {Boolean}
    */
  def is_open(obj: js.Any): Boolean = js.native
  /**
    * checks if a node has children
    * @name is_parent(obj)
    * @param  {mixed} obj
    * @return {Boolean}
    */
  def is_parent(obj: js.Any): Boolean = js.native
  /**
    * checks if a node is selected
    * @name is_selected(obj)
    * @param  {mixed}  obj
    * @return {Boolean}
    */
  def is_selected(obj: js.Any): Boolean = js.native
  /**
    * checks if a node is in an undetermined state
    * @name is_undetermined(obj)
    * @param  {mixed} obj
    * @return {Boolean}
    */
  def is_undetermined(obj: js.Any): Boolean = js.native
  /**
    * get the last error
    * @name last_error()
    * @return {Object}
    */
  def last_error(): js.Any = js.native
  /**
    * loads all unloaded nodes
    * @name load_all([obj, callback])
    * @param {mixed} obj the node to load recursively, omit to load all nodes in the tree
    * @param {function} callback a function to be executed once loading all the nodes is complete,
    * @trigger load_all.jstree
    */
  def load_all(obj: js.Any, callback: js.Function0[Unit]): Unit = js.native
  /**
    * loads a node (fetches its children using the `core.data` setting). Multiple nodes can be passed to by using an array.
    * @name load_node(obj [, callback])
    * @param  {mixed} obj
    * @param  {function} callback a function to be executed once loading is conplete, the function is executed in the instance's scope
    * and receives two arguments - the node and a boolean status
    * @return {Boolean}
    * @trigger load_node.jstree
    */
  def load_node(obj: js.Any, callback: js.Function2[/* node */ js.Any, /* status */ Boolean, Unit]): Boolean = js.native
  /**
    * move a node to a new parent
    * @name move_node(obj, par [, pos, callback, is_loaded])
    * @param  {mixed} obj the node to move, pass an array to move multiple nodes
    * @param  {mixed} par the new parent
    * @param  {mixed} pos the position to insert at (besides integer values, "first" and "last" are supported, as well as "before" and "after"), defaults to integer `0`
    * @param  {function} callback a function to call once the move is completed, receives 3 arguments - the node, the new parent and the position
    * @param  {Boolean} is_loaded internal parameter indicating if the parent node has been loaded
    * @param  {Boolean} skip_redraw internal parameter indicating if the tree should be redrawn
    * @param  {Boolean} instance internal parameter indicating if the node comes from another instance
    * @trigger move_node.jstree
    */
  def move_node(obj: js.Any, par: js.Any): Unit = js.native
  def move_node(obj: js.Any, par: js.Any, pos: js.Any): Unit = js.native
  def move_node(
    obj: js.Any,
    par: js.Any,
    pos: js.Any,
    callback: js.Function3[/* node */ js.Any, /* new_par */ js.Any, /* pos */ js.Any, Unit]
  ): Unit = js.native
  def move_node(
    obj: js.Any,
    par: js.Any,
    pos: js.Any,
    callback: js.Function3[/* node */ js.Any, /* new_par */ js.Any, /* pos */ js.Any, Unit],
    is_loaded: Boolean
  ): Unit = js.native
  def move_node(
    obj: js.Any,
    par: js.Any,
    pos: js.Any,
    callback: js.Function3[/* node */ js.Any, /* new_par */ js.Any, /* pos */ js.Any, Unit],
    is_loaded: Boolean,
    skip_redraw: Boolean
  ): Unit = js.native
  def move_node(
    obj: js.Any,
    par: js.Any,
    pos: js.Any,
    callback: js.Function3[/* node */ js.Any, /* new_par */ js.Any, /* pos */ js.Any, Unit],
    is_loaded: Boolean,
    skip_redraw: Boolean,
    origin: Boolean
  ): Unit = js.native
  /**
    * opens all nodes within a node (or the tree), revealing their children. If the node is not loaded it will be loaded and opened once ready.
    * @name open_all([obj, animation, original_obj])
    * @param {mixed} obj the node to open recursively, omit to open all nodes in the tree
    * @param {Number} animation the animation duration in milliseconds when opening the nodes, the default is no animation
    * @param {jQuery} reference to the node that started the process (internal use)
    * @trigger open_all.jstree
    */
  def open_all(): Unit = js.native
  def open_all(obj: js.Any): Unit = js.native
  def open_all(obj: js.Any, animation: Double): Unit = js.native
  def open_all(obj: js.Any, animation: Double, original_obj: js.Any): Unit = js.native
  /**
    * opens a node, revealing its children. If the node is not loaded it will be loaded and opened once ready.
    * @name open_node(obj [, callback, animation])
    * @param {mixed} obj the node to open
    * @param {Function} callback a function to execute once the node is opened
    * @param {Number} animation the animation duration in milliseconds
    * when opening the node (overrides the `core.animation` setting). Use `false` for no animation.
    * @trigger open_node.jstree, after_open.jstree, before_open.jstree
    */
  def open_node(obj: js.Any): Unit = js.native
  def open_node(obj: js.Any, callback: js.Any): Unit = js.native
  def open_node(obj: js.Any, callback: js.Any, animation: js.Any): Unit = js.native
  /**
    * copy or move the previously cut or copied nodes to a new parent
    * @name paste(obj [, pos])
    * @param  {mixed} obj the new parent
    * @param  {mixed} pos the position to insert at (besides integer, "first" and "last" are supported), defaults to integer `0`
    * @trigger paste.jstree
    */
  def paste(obj: js.Any, pos: js.Any): Unit = js.native
  /**
    * used to decorate an instance with a plugin. Used internally.
    * @private
    * @name plugin(deco [, opts])
    * @param  {String} deco the plugin to decorate with
    * @param  {Object} opts options for the plugin
    * @return {jsTree}
    */
  def plugin(deco: String): JSTree = js.native
  def plugin(deco: String, opts: js.Any): JSTree = js.native
  /**
    * redraws all nodes that need to be redrawn or optionally - the whole tree
    * @name redraw([full])
    * @param {Boolean} full if set to `true` all nodes are redrawn.
    */
  def redraw(): Unit = js.native
  def redraw(full: Boolean): Unit = js.native
  /**
    * redraws a single node. Used internally.
    * @private
    * @name redraw_node(node, deep, is_callback, force_render)
    * @param {mixed} node the node to redraw
    * @param {Boolean} deep should child nodes be redrawn too
    * @param {Boolean} is_callback is this a recursion call
    * @param {Boolean} force_render should children of closed parents be drawn anyway
    */
  def redraw_node(node: js.Any, deep: Boolean, is_callback: Boolean, force_render: Boolean): Unit = js.native
  /**
    * refreshes the tree - all nodes are reloaded with calls to `load_node`.
    * @name refresh()
    * @param {Boolean} skip_loading an option to skip showing the loading indicator
    * @param {Mixed} forget_state if set to `true` state will not be reapplied,
    * if set to a function (receiving the current state as argument) the result of that function will be used as state
    * @trigger refresh.jstree
    */
  def refresh(): Unit = js.native
  def refresh(skip_loading: Boolean): Unit = js.native
  def refresh(skip_loading: Boolean, forget_state: js.Any): Unit = js.native
  /**
    * refreshes a node in the tree (reload its children) all opened nodes inside that node are reloaded with calls to `load_node`.
    * @name refresh_node(obj)
    * @param  {mixed} obj the node
    * @trigger refresh_node.jstree
    */
  def refresh_node(obj: js.Any): Unit = js.native
  /**
    * set the text value of a node
    * @name rename_node(obj, val)
    * @param  {mixed} obj the node, you can pass an array to rename multiple nodes to the same name
    * @param  {String} val the new text value
    * @return {Boolean}
    * @trigger rename_node.jstree
    */
  def rename_node(obj: js.Any, `val`: String): Boolean = js.native
  /**
    * restore the state from the user's computer
    * @name restore_state()
    * @plugin state
    */
  def restore_state(): Unit = js.native
  /**
    * state plugin
    */
  /**
    * save the state
    * @name save_state()
    * @plugin state
    */
  def save_state(): Unit = js.native
  /**
    * search plugin
    */
  /**
    * used to search the tree nodes for a given string
    * @name search(str [, skip_async])
    * @param {String} str the search string
    * @param {Boolean} skip_async if set to true server will not be queried even if configured
    * @param {Boolean} show_only_matches if set to true only matching nodes will be shown (keep in mind this can be very slow on large trees or old browsers)
    * @param {mixed} inside an optional node to whose children to limit the search
    * @param {Boolean} append if set to true the results of this search are appended to the previous search
    * @param {Boolean} show_only_matches_children show only matched children
    * @plugin search
    * @trigger search.jstree
    */
  def search(str: String): Unit = js.native
  def search(str: String, skip_async: Boolean): Unit = js.native
  def search(str: String, skip_async: Boolean, show_only_matches: Boolean): Unit = js.native
  def search(str: String, skip_async: Boolean, show_only_matches: Boolean, inside: js.Any): Unit = js.native
  def search(str: String, skip_async: Boolean, show_only_matches: Boolean, inside: js.Any, append: Boolean): Unit = js.native
  def search(
    str: String,
    skip_async: Boolean,
    show_only_matches: Boolean,
    inside: js.Any,
    append: Boolean,
    show_only_matches_children: Boolean
  ): Unit = js.native
  /**
    * select all nodes in the tree
    * @name select_all([supress_event])
    * @param {Boolean} supress_event if set to `true` the `changed.jstree` event won't be triggered
    * @trigger select_all.jstree, changed.jstree
    */
  def select_all(): Unit = js.native
  def select_all(supress_event: Boolean): Unit = js.native
  /**
    * select a node
    * @name select_node(obj [, supress_event, prevent_open])
    * @param {mixed} obj an array can be used to select multiple nodes
    * @param {Boolean} supress_event if set to `true` the `changed.jstree` event won't be triggered
    * @param {Boolean} prevent_open if set to `true` parents of the selected node won't be opened
    * @trigger select_node.jstree, changed.jstree
    */
  def select_node(obj: js.Any): js.Any = js.native
  def select_node(obj: js.Any, supress_event: Boolean): js.Any = js.native
  def select_node(obj: js.Any, supress_event: Boolean, prevent_open: Boolean): js.Any = js.native
  def select_node(obj: js.Any, supress_event: Boolean, prevent_open: Boolean, e: js.Any): js.Any = js.native
  /**
    * set the node icon for a node
    * @name set_icon(obj, icon)
    * @param {mixed} obj
    * @param {String} icon the new icon - can be a path to an icon or a className,
    * if using an image that is in the current directory use a `./` prefix, otherwise it will be detected as a class
    */
  def set_icon(obj: js.Any, icon: String): Unit = js.native
  /**
    * set (change) the ID of a node
    * @name set_id(obj, id)
    * @param  {mixed} obj the node
    * @param  {String} id the new ID
    * @return {Boolean}
    */
  def set_id(obj: js.Any, id: String): Boolean = js.native
  /**
    * sets the state of the tree. Used internally.
    * @name set_state(state [, callback])
    * @private
    * @param {Object} state the state to restore
    * @param {Function} callback an optional function to execute once the state is restored.
    * @trigger set_state.jstree
    */
  def set_state(state: js.Any, callback: js.Function0[Unit]): Unit = js.native
  /**
    * set the text value of a node. Used internally, please use `rename_node(obj, val)`.
    * @private
    * @name set_text(obj, val)
    * @param  {mixed} obj the node, you can pass an array to set the text on multiple nodes
    * @param  {String} val the new text value
    * @return {Boolean}
    * @trigger set_text.jstree
    */
  def set_text(obj: js.Any, `val`: String): Boolean = js.native
  /**
    * changes the theme
    * @name set_theme(theme_name [, theme_url])
    * @param {String} theme_name the name of the new theme to apply
    * @param {mixed} theme_url  the location of the CSS file for this theme. Omit or set to `false`
    * if you manually included the file. Set to `true` to autoload from the `core.themes.dir` directory.
    * @trigger set_theme.jstree
    */
  def set_theme(theme_name: String): Unit = js.native
  def set_theme(theme_name: String, theme_url: js.Any): Unit = js.native
  /**
    * changes the theme variant (if the theme has variants)
    * @name set_theme_variant(variant_name)
    * @param {String|Boolean} variant_name the variant to apply (if `false` is used the current variant is removed)
    */
  def set_theme_variant(variant_name: js.Any): Unit = js.native
  /**
    * used to change a node's type
    * @name set_type(obj, type)
    * @param {mixed} obj the node to change
    * @param {String} type the new type
    * @plugin types
    */
  def set_type(obj: js.Any, `type`: String): js.Any = js.native
  /**
    * shows all nodes
    * @name show_all()
    * @trigger show_all.jstree
    */
  def show_all(skip_redraw: Boolean): Boolean = js.native
  /**
    * show the node checkbox icons
    * @name show_checkboxes()
    * @plugin checkbox
    */
  def show_checkboxes(): Unit = js.native
  /**
    * context menu plugin
    */
  /**
    * prepare and show the context menu for a node
    * @name show_contextmenu(obj [, x, y])
    * @param {mixed} obj the node
    * @param {Number} x the x-coordinate relative to the document to show the menu at
    * @param {Number} y the y-coordinate relative to the document to show the menu at
    * @param {Object} e the event if available that triggered the contextmenu
    * @plugin contextmenu
    * @trigger show_contextmenu.jstree
    */
  def show_contextmenu(obj: js.Any): Unit = js.native
  def show_contextmenu(obj: js.Any, x: Double): Unit = js.native
  def show_contextmenu(obj: js.Any, x: Double, y: Double): Unit = js.native
  def show_contextmenu(obj: js.Any, x: Double, y: Double, e: js.Any): Unit = js.native
  /**
    * shows the connecting dots (if the theme supports it)
    * @name show_dots()
    */
  def show_dots(): Unit = js.native
  /**
    * show the node ellipsis
    * @name show_icons()
    */
  def show_ellipsis(): Unit = js.native
  /**
    * show the icon on an individual node
    * @name show_icon(obj)
    * @param {mixed} obj
    */
  def show_icon(obj: js.Any): Unit = js.native
  /**
    * show the node icons
    * @name show_icons()
    */
  def show_icons(): Unit = js.native
  /**
    * shows a node
    * @name show_node(obj)
    * @param {mixed} obj the node to show
    * @param {Boolean} skip_redraw internal parameter controlling if redraw is called
    * @trigger show_node.jstree
    */
  def show_node(obj: js.Any, skip_redraw: Boolean): Boolean = js.native
  /**
    * shows a striped background on the container (if the theme supports it)
    * @name show_stripes()
    */
  def show_stripes(): Unit = js.native
  /**
    * sort plugin
    */
  /**
    * used to sort a node's children
    * @private
    * @name sort(obj [, deep])
    * @param  {mixed} obj the node
    * @param {Boolean} deep if set to `true` nodes are sorted recursively.
    * @plugin sort
    * @trigger search.jstree
    */
  def sort(obj: js.Any): Unit = js.native
  def sort(obj: js.Any, deep: Boolean): Unit = js.native
  /**
    * part of the destroying of an instance. Used internally.
    * @private
    * @name teardown()
    */
  def teardown(): Unit = js.native
  /**
    * toggle the node icons
    * @name toggle_checkboxes()
    * @plugin checkbox
    */
  def toggle_checkboxes(): Unit = js.native
  /**
    * toggles the connecting dots
    * @name toggle_dots()
    */
  def toggle_dots(): Unit = js.native
  /**
    * toggle the node ellipsis
    * @name toggle_icons()
    */
  def toggle_ellipsis(): Unit = js.native
  /**
    * toggle the node icons
    * @name toggle_icons()
    */
  def toggle_icons(): Unit = js.native
  /**
    * toggles a node - closing it if it is open, opening it if it is closed
    * @name toggle_node(obj)
    * @param {mixed} obj the node to toggle
    */
  def toggle_node(obj: js.Any): Unit = js.native
  /**
    * toggles the striped background on the container
    * @name toggle_stripes()
    */
  def toggle_stripes(): Unit = js.native
  /**
    * part of the destroying of an instance. Used internally.
    * @private
    * @name unbind()
    */
  def unbind(): js.Any = js.native
  /**
    * uncheck all checked nodes (only if tie_selection in checkbox settings is false, otherwise deselect_all will be called internally)
    * @name uncheck_all()
    * @trigger uncheck_all.jstree
    * @plugin checkbox
    */
  def uncheck_all(): js.Any = js.native
  /**
    * uncheck a node (only if tie_selection in checkbox settings is false, otherwise deselect_node will be called internally)
    * @name deselect_node(obj)
    * @param {mixed} obj an array can be used to deselect multiple nodes
    * @trigger uncheck_node.jstree
    * @plugin checkbox
    */
  def uncheck_node(obj: js.Any, e: js.Any): js.Any = js.native
}

