package typings.knockoutPreRendered

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutBindingContext extends StObject {
  
  @JSName("$component")
  var $component: Any = js.native
  
  @JSName("$componentTemplateNodes")
  var $componentTemplateNodes: js.Array[Node] = js.native
  
  @JSName("$data")
  var $data: Any = js.native
  
  @JSName("$index")
  var $index: js.UndefOr[KnockoutObservable[Double]] = js.native
  
  @JSName("$parent")
  var $parent: Any = js.native
  
  @JSName("$parentContext")
  var $parentContext: js.UndefOr[KnockoutBindingContext] = js.native
  
  @JSName("$parents")
  var $parents: js.Array[Any] = js.native
  
  @JSName("$rawData")
  var $rawData: Any | KnockoutObservable[Any] = js.native
  
  @JSName("$root")
  var $root: Any = js.native
  
  def createChildContext(dataItemOrAccessor: Any): Any = js.native
  def createChildContext(dataItemOrAccessor: Any, dataItemAlias: Any): Any = js.native
  def createChildContext(dataItemOrAccessor: Any, dataItemAlias: Any, extendCallback: js.Function): Any = js.native
  def createChildContext(dataItemOrAccessor: Any, dataItemAlias: Unit, extendCallback: js.Function): Any = js.native
  
  def extend(properties: Any): Any = js.native
}
