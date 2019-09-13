package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaults extends js.Object {
  /**
    * stores all defaults for the checkbox plugin
    */
  var checkbox: js.UndefOr[JSTreeStaticDefaultsCheckbox] = js.undefined
  /**
    * a callback (function) which is invoked in the instance's scope and receives two arguments
    * - the node and the event that triggered the `close_node` call.
    * Returning false prevents working with the node, returning true allows invoking close_node.
    * Defaults to returning `true`.
    * @name $.jstree.defaults.conditionalclose
    * @plugin conditionalclose
    */
  var conditionalclose: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * a callback (function) which is invoked in the instance's scope and receives two arguments
    * - the node and the event that triggered the `activate_node` call.
    * Returning false prevents working with the node, returning true allows invoking activate_node.
    * Defaults to returning `true`.
    * @name $.jstree.defaults.conditionalselect
    * @plugin conditionalselect
    */
  var conditionalselect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * stores all defaults for the contextmenu plugin
    */
  var contextmenu: js.UndefOr[JSTreeStaticDefaultsContextMenu] = js.undefined
  /**
    * stores all defaults for the core
    * @name $.jstree.defaults.core
    */
  var core: JSTreeStaticDefaultsCore
  /**
    * stores all defaults for the drag'n'drop plugin
    */
  var dnd: js.UndefOr[JSTreeStaticDefaultsDragNDrop] = js.undefined
  /**
    * Adds massload functionality to jsTree, so that multiple nodes can be loaded in a single request (only useful with lazy loading).
    */
  var massload: js.UndefOr[JSTreeStaticDefaultsMassload] = js.undefined
  /**
    * configure which plugins will be active on an instance.
    * Should be an array of strings, where each element is a plugin name.
    * The default is `[]`
    * @name $.jstree.defaults.plugins
    */
  var plugins: js.Array[String]
  /**
    * stores all defaults for the search plugin
    */
  var search: js.UndefOr[JSTreeStaticDefaultsSearch] = js.undefined
  /**
    * the settings function used to sort the nodes.
    * It is executed in the tree's context, accepts two nodes as arguments and should return `1` or `-1`.
    * @name $.jstree.defaults.sort
    * @plugin sort
    */
  var sort: js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, Double]] = js.undefined
  /**
    * stores all defaults for the state plugin
    */
  var state: js.UndefOr[JSTreeStaticDefaultsState] = js.undefined
  /**
    * An object storing all types as key value pairs,
    * where the key is the type name and the value is an object
    * that could contain following keys (all optional).
    * max_children the maximum number of immediate children this node type can have.
    * Do not specify or set to -1 for unlimited.
    * max_depth the maximum number of nesting this node type can have.
    * A value of 1 would mean that the node can have children, but no grandchildren.
    * Do not specify or set to -1 for unlimited.
    * valid_children an array of node type strings, that nodes of this type can have as children.
    * Do not specify or set to -1 for no limits.
    * icon a string - can be a path to an icon or a className, if using an image
    * that is in the current directory use a ./ prefix, otherwise it will be detected as a class.
    * Omit to use the default icon from your theme.
    * There are two predefined types:
    * # represents the root of the tree, for example max_children would control the maximum number of root nodes.
    * default represents the default node - any settings here will be applied to all nodes that do not have a type specified.
    */
  var types: js.UndefOr[js.Any] = js.undefined
  /**
    * stores all defaults for the unique plugin
    * @name $.jstree.defaults.unique
    * @plugin unique
    */
  var unique: js.UndefOr[JSTreeStaticDefaultsUnique] = js.undefined
}

object JSTreeStaticDefaults {
  @scala.inline
  def apply(
    core: JSTreeStaticDefaultsCore,
    plugins: js.Array[String],
    checkbox: JSTreeStaticDefaultsCheckbox = null,
    conditionalclose: () => Boolean = null,
    conditionalselect: () => Boolean = null,
    contextmenu: JSTreeStaticDefaultsContextMenu = null,
    dnd: JSTreeStaticDefaultsDragNDrop = null,
    massload: JSTreeStaticDefaultsMassload = null,
    search: JSTreeStaticDefaultsSearch = null,
    sort: (/* x */ js.Any, /* y */ js.Any) => Double = null,
    state: JSTreeStaticDefaultsState = null,
    types: js.Any = null,
    unique: JSTreeStaticDefaultsUnique = null
  ): JSTreeStaticDefaults = {
    val __obj = js.Dynamic.literal(core = core, plugins = plugins)
    if (checkbox != null) __obj.updateDynamic("checkbox")(checkbox)
    if (conditionalclose != null) __obj.updateDynamic("conditionalclose")(js.Any.fromFunction0(conditionalclose))
    if (conditionalselect != null) __obj.updateDynamic("conditionalselect")(js.Any.fromFunction0(conditionalselect))
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu)
    if (dnd != null) __obj.updateDynamic("dnd")(dnd)
    if (massload != null) __obj.updateDynamic("massload")(massload)
    if (search != null) __obj.updateDynamic("search")(search)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (state != null) __obj.updateDynamic("state")(state)
    if (types != null) __obj.updateDynamic("types")(types)
    if (unique != null) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[JSTreeStaticDefaults]
  }
}

