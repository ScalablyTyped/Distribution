package typings.knockout.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ViewModel extends js.Object

object _ViewModel {
  @scala.inline
  def ViewModelSharedInstance(instance: js.Any): _ViewModel = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ViewModel]
  }
  @scala.inline
  def ViewModelFactoryFunction(createViewModel: (js.Any, ComponentInfo) => js.Any): _ViewModel = {
    val __obj = js.Dynamic.literal(createViewModel = js.Any.fromFunction2(createViewModel))
    __obj.asInstanceOf[_ViewModel]
  }
  @scala.inline
  def AMDModule(require: String): _ViewModel = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ViewModel]
  }
}

