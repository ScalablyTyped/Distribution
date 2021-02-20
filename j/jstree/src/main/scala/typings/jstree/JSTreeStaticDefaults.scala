package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeStaticDefaults extends StObject {
  
  /**
    * stores all defaults for the checkbox plugin
    */
  var checkbox: js.UndefOr[JSTreeStaticDefaultsCheckbox] = js.native
  
  /**
    * a callback (function) which is invoked in the instance's scope and receives two arguments
    * - the node and the event that triggered the `close_node` call.
    * Returning false prevents working with the node, returning true allows invoking close_node.
    * Defaults to returning `true`.
    * @name $.jstree.defaults.conditionalclose
    * @plugin conditionalclose
    */
  var conditionalclose: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * a callback (function) which is invoked in the instance's scope and receives two arguments
    * - the node and the event that triggered the `activate_node` call.
    * Returning false prevents working with the node, returning true allows invoking activate_node.
    * Defaults to returning `true`.
    * @name $.jstree.defaults.conditionalselect
    * @plugin conditionalselect
    */
  var conditionalselect: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * stores all defaults for the contextmenu plugin
    */
  var contextmenu: js.UndefOr[JSTreeStaticDefaultsContextMenu] = js.native
  
  /**
    * stores all defaults for the core
    * @name $.jstree.defaults.core
    */
  var core: JSTreeStaticDefaultsCore = js.native
  
  /**
    * stores all defaults for the drag'n'drop plugin
    */
  var dnd: js.UndefOr[JSTreeStaticDefaultsDragNDrop] = js.native
  
  /**
    * Adds massload functionality to jsTree, so that multiple nodes can be loaded in a single request (only useful with lazy loading).
    */
  var massload: js.UndefOr[JSTreeStaticDefaultsMassload] = js.native
  
  /**
    * configure which plugins will be active on an instance.
    * Should be an array of strings, where each element is a plugin name.
    * The default is `[]`
    * @name $.jstree.defaults.plugins
    */
  var plugins: js.Array[String] = js.native
  
  /**
    * stores all defaults for the search plugin
    */
  var search: js.UndefOr[JSTreeStaticDefaultsSearch] = js.native
  
  /**
    * the settings function used to sort the nodes.
    * It is executed in the tree's context, accepts two nodes as arguments and should return `1` or `-1`.
    * @name $.jstree.defaults.sort
    * @plugin sort
    */
  var sort: js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, Double]] = js.native
  
  /**
    * stores all defaults for the state plugin
    */
  var state: js.UndefOr[JSTreeStaticDefaultsState] = js.native
  
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
  var types: js.UndefOr[js.Any] = js.native
  
  /**
    * stores all defaults for the unique plugin
    * @name $.jstree.defaults.unique
    * @plugin unique
    */
  var unique: js.UndefOr[JSTreeStaticDefaultsUnique] = js.native
}
object JSTreeStaticDefaults {
  
  @scala.inline
  def apply(core: JSTreeStaticDefaultsCore, plugins: js.Array[String]): JSTreeStaticDefaults = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaults]
  }
  
  @scala.inline
  implicit class JSTreeStaticDefaultsMutableBuilder[Self <: JSTreeStaticDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckbox(value: JSTreeStaticDefaultsCheckbox): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    @scala.inline
    def setConditionalclose(value: () => Boolean): Self = StObject.set(x, "conditionalclose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConditionalcloseUndefined: Self = StObject.set(x, "conditionalclose", js.undefined)
    
    @scala.inline
    def setConditionalselect(value: () => Boolean): Self = StObject.set(x, "conditionalselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConditionalselectUndefined: Self = StObject.set(x, "conditionalselect", js.undefined)
    
    @scala.inline
    def setContextmenu(value: JSTreeStaticDefaultsContextMenu): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    @scala.inline
    def setCore(value: JSTreeStaticDefaultsCore): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnd(value: JSTreeStaticDefaultsDragNDrop): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    @scala.inline
    def setMassload(value: JSTreeStaticDefaultsMassload): Self = StObject.set(x, "massload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassloadUndefined: Self = StObject.set(x, "massload", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setSearch(value: JSTreeStaticDefaultsSearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSort(value: (/* x */ js.Any, /* y */ js.Any) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setState(value: JSTreeStaticDefaultsState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setUnique(value: JSTreeStaticDefaultsUnique): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
