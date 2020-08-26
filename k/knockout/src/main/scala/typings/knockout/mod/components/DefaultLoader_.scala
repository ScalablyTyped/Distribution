package typings.knockout.mod.components

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultLoader_ extends Loader {
  @JSName("getConfig")
  def getConfig_MDefaultLoader_(componentName: String, callback: js.Function1[/* config */ Config | js.Object, Unit]): Unit = js.native
  @JSName("loadComponent")
  def loadComponent_MDefaultLoader_(componentName: String, config: Config, callback: js.Function1[/* component */ Component, Unit]): Unit = js.native
  @JSName("loadTemplate")
  def loadTemplate_MDefaultLoader_(
    componentName: String,
    config: TemplateConfig,
    callback: js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]
  ): Unit = js.native
  @JSName("loadViewModel")
  def loadViewModel_MDefaultLoader_(
    componentName: String,
    config: ViewModelConfig,
    callback: js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]
  ): Unit = js.native
}

object DefaultLoader_ {
  @scala.inline
  def apply(
    getConfig: (String, js.Function1[/* config */ Config | js.Object, Unit]) => Unit,
    loadComponent: (String, Config, js.Function1[/* component */ Component, Unit]) => Unit,
    loadTemplate: (String, TemplateConfig, js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]) => Unit,
    loadViewModel: (String, ViewModelConfig, js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]) => Unit
  ): DefaultLoader_ = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction2(getConfig), loadComponent = js.Any.fromFunction3(loadComponent), loadTemplate = js.Any.fromFunction3(loadTemplate), loadViewModel = js.Any.fromFunction3(loadViewModel))
    __obj.asInstanceOf[DefaultLoader_]
  }
  @scala.inline
  implicit class DefaultLoader_Ops[Self <: DefaultLoader_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetConfig(value: (String, js.Function1[/* config */ Config | js.Object, Unit]) => Unit): Self = this.set("getConfig", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadComponent(value: (String, Config, js.Function1[/* component */ Component, Unit]) => Unit): Self = this.set("loadComponent", js.Any.fromFunction3(value))
    @scala.inline
    def setLoadTemplate(value: (String, TemplateConfig, js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]) => Unit): Self = this.set("loadTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setLoadViewModel(
      value: (String, ViewModelConfig, js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]) => Unit
    ): Self = this.set("loadViewModel", js.Any.fromFunction3(value))
  }
  
}

