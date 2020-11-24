package typings.knockout.mod.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModelFactory extends ViewModelConfig {
  
  def createViewModel(params: ViewModelParams, componentInfo: ComponentInfo): ViewModel = js.native
  @JSName("createViewModel")
  var createViewModel_Original: CreateViewModel = js.native
}
