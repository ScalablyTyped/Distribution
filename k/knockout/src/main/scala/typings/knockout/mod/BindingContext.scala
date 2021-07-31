package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingContext[T]
  extends StObject
     with /* option */ StringDictionary[js.Any] {
  
  @JSName("$component")
  var $component: js.UndefOr[js.Any] = js.native
  
  @JSName("$data")
  var $data: T = js.native
  
  @JSName("$index")
  var $index: js.UndefOr[Observable_[Double]] = js.native
  
  @JSName("$parent")
  var $parent: js.UndefOr[js.Any] = js.native
  
  @JSName("$parentContext")
  var $parentContext: js.UndefOr[BindingContext[js.Any]] = js.native
  
  @JSName("$parents")
  var $parents: js.Array[js.Any] = js.native
  
  @JSName("$rawData")
  var $rawData: T | Observable_[T] = js.native
  
  @JSName("$root")
  var $root: js.Any = js.native
  
  def createChildContext[X](accessor: js.Function0[T | Observable_[T]]): BindingContext[X] = js.native
  def createChildContext[X](accessor: js.Function0[T | Observable_[T]], dataItemAlias: String): BindingContext[X] = js.native
  def createChildContext[X](
    accessor: js.Function0[T | Observable_[T]],
    dataItemAlias: String,
    extendCallback: BindingContextExtendCallback[X]
  ): BindingContext[X] = js.native
  def createChildContext[X](
    accessor: js.Function0[T | Observable_[T]],
    dataItemAlias: Unit,
    extendCallback: BindingContextExtendCallback[X]
  ): BindingContext[X] = js.native
  def createChildContext[X](accessor: js.Function0[T | Observable_[T]], options: BindingChildContextOptions[X]): BindingContext[X] = js.native
  def createChildContext[X](dataItem: T): BindingContext[X] = js.native
  def createChildContext[X](dataItem: T, dataItemAlias: String): BindingContext[X] = js.native
  def createChildContext[X](dataItem: T, dataItemAlias: String, extendCallback: BindingContextExtendCallback[X]): BindingContext[X] = js.native
  def createChildContext[X](dataItem: T, dataItemAlias: Unit, extendCallback: BindingContextExtendCallback[X]): BindingContext[X] = js.native
  def createChildContext[X](dataItem: T, options: BindingChildContextOptions[X]): BindingContext[X] = js.native
  def createChildContext[X](dataItem: Observable_[T]): BindingContext[X] = js.native
  def createChildContext[X](dataItem: Observable_[T], dataItemAlias: String): BindingContext[X] = js.native
  def createChildContext[X](dataItem: Observable_[T], dataItemAlias: String, extendCallback: BindingContextExtendCallback[X]): BindingContext[X] = js.native
  def createChildContext[X](dataItem: Observable_[T], dataItemAlias: Unit, extendCallback: BindingContextExtendCallback[X]): BindingContext[X] = js.native
  def createChildContext[X](dataItem: Observable_[T], options: BindingChildContextOptions[X]): BindingContext[X] = js.native
  
  def extend(properties: js.Function1[/* self */ BindingContext[T], js.Object]): BindingContext[T] = js.native
  def extend(properties: js.Object): BindingContext[T] = js.native
  
  var ko: js.Any = js.native
}
