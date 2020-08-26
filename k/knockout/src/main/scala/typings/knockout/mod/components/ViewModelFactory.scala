package typings.knockout.mod.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModelFactory extends ViewModelConfig {
  @JSName("createViewModel")
  var createViewModel_Original: CreateViewModel = js.native
  def createViewModel(params: ViewModelParams, componentInfo: ComponentInfo): ViewModel = js.native
}

