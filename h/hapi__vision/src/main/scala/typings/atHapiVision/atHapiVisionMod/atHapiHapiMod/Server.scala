package typings.atHapiVision.atHapiVisionMod.atHapiHapiMod

import typings.atHapiVision.atHapiVisionMod.RenderMethod
import typings.atHapiVision.atHapiVisionMod.ServerViewsConfiguration
import typings.atHapiVision.atHapiVisionMod.ViewManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  /**
    * Utilizes the server views manager to render a template
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverrendertemplate-context-options-callback}
    */
  @JSName("render")
  var render_Original: RenderMethod = js.native
  /**
    * Utilizes the server views manager to render a template
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverrendertemplate-context-options-callback}
    */
  def render(template: String): js.Promise[String] = js.native
  def render(template: String, context: js.Any): js.Promise[String] = js.native
  def render(template: String, context: js.Any, options: ServerViewsConfiguration): js.Promise[String] = js.native
  /**
    * Initializes the server views manager
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions}
    */
  def views(options: ServerViewsConfiguration): ViewManager = js.native
}

