package typings.knockout.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModelFactoryFunction extends js.Object {
  def createViewModel(params: js.Any, componentInfo: ComponentInfo): js.Any
}

object ViewModelFactoryFunction {
  @scala.inline
  def apply(createViewModel: (js.Any, ComponentInfo) => js.Any): ViewModelFactoryFunction = {
    val __obj = js.Dynamic.literal(createViewModel = js.Any.fromFunction2(createViewModel))
  
    __obj.asInstanceOf[ViewModelFactoryFunction]
  }
}

