package typings.jqueryFancytree.Fancytree

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Context object passed to events and hook functions. */
@js.native
trait EventData extends StObject {
  
  /** The node that this call applies to (`null` for tree events) */
  var node: FancytreeNode = js.native
  
  // JQueryUI.Widget;
  /** Shortcut to tree.options */
  var options: FancytreeOptions = js.native
  
  /** The jQuery Event that initially triggered this call */
  var originalEvent: JQueryEventObject = js.native
  
  /** (only for postProcess event) Original ajax response */
  var response: js.Any = js.native
  
  /** (output parameter) Event handlers can return values back to the
    * caller. Used by `lazyLoad`, `postProcess`, ... */
  var result: js.Any = js.native
  
  /** (only for click and dblclick events) 'title' | 'prefix' | 'expander' | 'checkbox' | 'icon' */
  var targetType: String = js.native
  
  /** The tree instance */
  var tree: typings.jqueryFancytree.Fancytree.Fancytree = js.native
  
  /** The jQuery UI tree widget */
  var widget: js.Any = js.native
}
object EventData {
  
  @scala.inline
  def apply(
    node: FancytreeNode,
    options: FancytreeOptions,
    originalEvent: JQueryEventObject,
    response: js.Any,
    result: js.Any,
    targetType: String,
    tree: typings.jqueryFancytree.Fancytree.Fancytree,
    widget: js.Any
  ): EventData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  
  @scala.inline
  implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: FancytreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: FancytreeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: JQueryEventObject): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: typings.jqueryFancytree.Fancytree.Fancytree): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidget(value: js.Any): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
  }
}
