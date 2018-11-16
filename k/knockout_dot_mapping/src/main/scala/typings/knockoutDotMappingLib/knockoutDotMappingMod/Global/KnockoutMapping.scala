package typings
package knockoutDotMappingLib.knockoutDotMappingMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutMapping extends js.Object {
  def defaultOptions(): KnockoutMappingOptions = js.native
  def fromJS[T](jsObject: T): KnockoutObservableType[T] = js.native
  def fromJS[T](jsObject: T, inputOptions: js.Any, target: js.Any): KnockoutObservableType[T] = js.native
  def fromJS[T](jsObject: T, targetOrOptions: js.Any): KnockoutObservableType[T] = js.native
  def fromJS[T](jsObject: js.Array[T]): knockoutLib.KnockoutObservableArray[KnockoutObservableType[T]] = js.native
  def fromJS[T](jsObject: js.Array[T], inputOptions: js.Any, target: js.Any): knockoutLib.KnockoutObservableArray[KnockoutObservableType[T]] = js.native
  def fromJS[T](jsObject: js.Array[T], targetOrOptions: js.Any): knockoutLib.KnockoutObservableArray[KnockoutObservableType[T]] = js.native
  def fromJSON(jsonString: java.lang.String): js.Any = js.native
  def fromJSON(jsonString: java.lang.String, inputOptions: js.Any, target: js.Any): js.Any = js.native
  def fromJSON(jsonString: java.lang.String, targetOrOptions: js.Any): js.Any = js.native
  def getType(x: js.Any): js.Any = js.native
  def isMapped(viewModel: js.Any): scala.Boolean = js.native
  def resetDefaultOptions(): scala.Unit = js.native
  def toJS[T](viewModel: T): T = js.native
  def toJS[T](viewModel: T, options: KnockoutMappingOptions): T = js.native
  def toJS[T](viewModel: js.Array[T | KnockoutObservableType[T]]): js.Array[T] = js.native
  def toJS[T](viewModel: js.Array[T | KnockoutObservableType[T]], options: KnockoutMappingOptions): js.Array[T] = js.native
  def toJS[T](viewModel: KnockoutObservableType[T]): T = js.native
  def toJS[T](viewModel: KnockoutObservableType[T], options: KnockoutMappingOptions): T = js.native
  def toJS[T](viewModel: knockoutLib.KnockoutObservable[T | KnockoutObservableType[T]]): T = js.native
  def toJS[T](viewModel: knockoutLib.KnockoutObservableArray[T | KnockoutObservableType[T]]): js.Array[T] = js.native
  def toJS[T](
    viewModel: knockoutLib.KnockoutObservableArray[T | KnockoutObservableType[T]],
    options: KnockoutMappingOptions
  ): js.Array[T] = js.native
  def toJS[T](
    viewModel: knockoutLib.KnockoutObservable[T | KnockoutObservableType[T]],
    options: KnockoutMappingOptions
  ): T = js.native
  def toJSON(rootObject: js.Any): java.lang.String = js.native
  def toJSON(rootObject: js.Any, options: KnockoutMappingOptions): java.lang.String = js.native
  def visitModel(rootObject: js.Any, callback: js.Function): js.Any = js.native
  def visitModel(rootObject: js.Any, callback: js.Function, options: knockoutDotMappingLib.Anon_VisitedObjects): js.Any = js.native
}

