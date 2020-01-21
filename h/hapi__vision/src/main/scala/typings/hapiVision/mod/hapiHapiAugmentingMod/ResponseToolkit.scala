package typings.hapiVision.mod.hapiHapiAugmentingMod

import typings.hapiHapi.mod.ResponseObject
import typings.hapiVision.mod.ViewHandlerOrReplyOptions
import typings.hapiVision.mod.ViewManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseToolkit extends js.Object {
  /**
    * Returns the closest views manager to your realm (either on your realm or inherited from an ancestor realm)
    *
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#hgetviewsmanager}
    */
  def getViewsManager(): ViewManager = js.native
  /**
    * Concludes the handler activity by returning control over to the router with a templatized view response
    * Returns a response object. The generated response will have the variety property set to view.
    * The response flow control rules apply.
    * @param template  the template filename and path, relative to the templates path configured via the server views manager.
    * @param context  optional object used by the template to render context-specific result. Defaults to no context {}.
    * @param options  optional object used to override the server's views manager configuration for this response.
    *                 Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#replyviewtemplate-context-options}
    */
  def view(templatePath: String): ResponseObject = js.native
  def view(templatePath: String, context: js.Any): ResponseObject = js.native
  def view(templatePath: String, context: js.Any, options: ViewHandlerOrReplyOptions): ResponseObject = js.native
}

