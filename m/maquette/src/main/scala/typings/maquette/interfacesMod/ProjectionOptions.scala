package typings.maquette.interfacesMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectionOptions extends ProjectorOptions {
  /**
    * May be used to intercept registration of event-handlers.
    *
    * Used by the [[Projector]] to wrap eventHandler-calls to call [[scheduleRender]] as well.
    *
    * @param propertyName             The name of the property to be assigned, for example onclick
    * @param eventHandler             The function that was registered on the [[VNode]]
    * @param domNode                  The real DOM element
    * @param properties               The whole set of properties that was put on the VNode
    * @returns                        The function that is to be placed on the DOM node as the event handler, instead of `eventHandler`.
    */
  var eventHandlerInterceptor: js.UndefOr[EventHandlerInterceptor] = js.native
  /**
    * Only for internal use. Used for rendering SVG Nodes.
    */
  val namespace: js.UndefOr[String] = js.native
}

object ProjectionOptions {
  @scala.inline
  def apply(): ProjectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectionOptions]
  }
  @scala.inline
  implicit class ProjectionOptionsOps[Self <: ProjectionOptions] (val x: Self) extends AnyVal {
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
    def setEventHandlerInterceptor(
      value: (/* propertyName */ String, /* eventHandler */ js.Function, /* domNode */ Node, /* properties */ VNodeProperties) => js.UndefOr[js.Function]
    ): Self = this.set("eventHandlerInterceptor", js.Any.fromFunction4(value))
    @scala.inline
    def deleteEventHandlerInterceptor: Self = this.set("eventHandlerInterceptor", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
  
}

