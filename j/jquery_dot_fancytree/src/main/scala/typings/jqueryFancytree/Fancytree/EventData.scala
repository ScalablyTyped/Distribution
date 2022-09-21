package typings.jqueryFancytree.Fancytree

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Context object passed to events and hook functions. */
trait EventData extends StObject {
  
  /** The node that this call applies to (`null` for tree events) */
  var node: FancytreeNode
  
  // JQueryUI.Widget;
  /** Shortcut to tree.options */
  var options: FancytreeOptions
  
  /** The jQuery Event that initially triggered this call */
  var originalEvent: JQueryEventObject
  
  /** (only for postProcess event) Original ajax response */
  var response: Any
  
  /** (output parameter) Event handlers can return values back to the
    * caller. Used by `lazyLoad`, `postProcess`, ... */
  var result: Any
  
  /** (only for click and dblclick events) 'title' | 'prefix' | 'expander' | 'checkbox' | 'icon' */
  var targetType: String
  
  /** The tree instance */
  var tree: typings.jqueryFancytree.Fancytree.Fancytree
  
  /** The jQuery UI tree widget */
  var widget: Any
}
object EventData {
  
  inline def apply(
    node: FancytreeNode,
    options: FancytreeOptions,
    originalEvent: JQueryEventObject,
    response: Any,
    result: Any,
    targetType: String,
    tree: typings.jqueryFancytree.Fancytree.Fancytree,
    widget: Any
  ): EventData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  
  extension [Self <: EventData](x: Self) {
    
    inline def setNode(value: FancytreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FancytreeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: JQueryEventObject): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTree(value: typings.jqueryFancytree.Fancytree.Fancytree): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setWidget(value: Any): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
  }
}
