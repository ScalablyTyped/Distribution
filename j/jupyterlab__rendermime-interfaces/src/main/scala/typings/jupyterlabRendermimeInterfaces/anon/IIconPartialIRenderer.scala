package typings.jupyterlabRendermimeInterfaces.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jupyterlab/rendermime-interfaces.@jupyterlab/rendermime-interfaces.IRenderMime.LabIcon.IIcon & std.Partial<@jupyterlab/rendermime-interfaces.@jupyterlab/rendermime-interfaces.IRenderMime.LabIcon.IRenderer> */
trait IIconPartialIRenderer extends js.Object {
  /**
    * The name of the icon. By convention, the icon name will be namespaced
    * as so:
    *
    *     "pkg-name:icon-name"
    */
  val name: String
  var render: js.UndefOr[
    js.Function2[/* container */ HTMLElement, /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /**
    * A string containing the raw contents of an svg file.
    */
  var svgstr: String
  var unrender: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
}

object IIconPartialIRenderer {
  @scala.inline
  def apply(
    name: String,
    svgstr: String,
    render: (/* container */ HTMLElement, /* options */ js.UndefOr[js.Any]) => Unit = null,
    unrender: /* container */ HTMLElement => Unit = null
  ): IIconPartialIRenderer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (unrender != null) __obj.updateDynamic("unrender")(js.Any.fromFunction1(unrender))
    __obj.asInstanceOf[IIconPartialIRenderer]
  }
}

