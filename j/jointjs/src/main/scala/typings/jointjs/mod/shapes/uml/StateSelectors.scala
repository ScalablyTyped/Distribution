package typings.jointjs.mod.shapes.uml

import typings.jointjs.mod.attributes.SVGPathAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateSelectors extends Selectors {
  @JSName(".uml-state-body")
  var `Dotuml-state-body`: js.UndefOr[SVGRectAttributes] = js.native
  @JSName(".uml-state-events")
  var `Dotuml-state-events`: js.UndefOr[SVGTextAttributes] = js.native
  @JSName(".uml-state-name")
  var `Dotuml-state-name`: js.UndefOr[SVGTextAttributes] = js.native
  @JSName(".uml-state-separator")
  var `Dotuml-state-separator`: js.UndefOr[SVGPathAttributes] = js.native
}

object StateSelectors {
  @scala.inline
  def apply(): StateSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateSelectors]
  }
  @scala.inline
  implicit class StateSelectorsOps[Self <: StateSelectors] (val x: Self) extends AnyVal {
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
    def `setDotuml-state-body`(value: SVGRectAttributes): Self = this.set(".uml-state-body", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDotuml-state-body`: Self = this.set(".uml-state-body", js.undefined)
    @scala.inline
    def `setDotuml-state-events`(value: SVGTextAttributes): Self = this.set(".uml-state-events", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDotuml-state-events`: Self = this.set(".uml-state-events", js.undefined)
    @scala.inline
    def `setDotuml-state-name`(value: SVGTextAttributes): Self = this.set(".uml-state-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDotuml-state-name`: Self = this.set(".uml-state-name", js.undefined)
    @scala.inline
    def `setDotuml-state-separator`(value: SVGPathAttributes): Self = this.set(".uml-state-separator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDotuml-state-separator`: Self = this.set(".uml-state-separator", js.undefined)
  }
  
}

