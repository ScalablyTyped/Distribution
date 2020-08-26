package typings.hapiVision.mod.hapiHapiAugmentingMod

import typings.hapiVision.mod.RenderMethod
import typings.hapiVision.mod.ServerViewsConfiguration
import typings.hapiVision.mod.ViewManager
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
    * Returns the closest views manager to your realm (either on your realm or inherited from an ancestor realm)
    *
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#servergetviewsmanager}
    */
  def getViewsManager(): ViewManager = js.native
  /**
    * Utilizes the server views manager to render a template
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverrendertemplate-context-options-callback}
    */
  def render(template: String): js.Promise[String] = js.native
  def render(template: String, context: js.UndefOr[scala.Nothing], options: ServerViewsConfiguration): js.Promise[String] = js.native
  def render(template: String, context: js.Any): js.Promise[String] = js.native
  def render(template: String, context: js.Any, options: ServerViewsConfiguration): js.Promise[String] = js.native
  /**
    * Initializes the server views manager
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions}
    */
  def views(options: ServerViewsConfiguration): ViewManager = js.native
}

