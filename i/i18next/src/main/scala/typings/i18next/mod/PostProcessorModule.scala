package typings.i18next.mod

import typings.i18next.i18nextStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostProcessorModule extends Module {
  /** Unique name */
  var name: String = js.native
  @JSName("type")
  var type_PostProcessorModule: postProcessor = js.native
  def process(value: String, key: String, options: TOptions[StringMap], translator: js.Any): String = js.native
}

object PostProcessorModule {
  @scala.inline
  def apply(
    name: String,
    process: (String, String, TOptions[StringMap], js.Any) => String,
    `type`: postProcessor
  ): PostProcessorModule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], process = js.Any.fromFunction4(process))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProcessorModule]
  }
  @scala.inline
  implicit class PostProcessorModuleOps[Self <: PostProcessorModule] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcess(value: (String, String, TOptions[StringMap], js.Any) => String): Self = this.set("process", js.Any.fromFunction4(value))
    @scala.inline
    def setType(value: postProcessor): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

