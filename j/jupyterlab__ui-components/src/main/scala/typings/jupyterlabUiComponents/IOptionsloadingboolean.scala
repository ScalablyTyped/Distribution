package typings.jupyterlabUiComponents

import typings.luminoVirtualdom.AnonAttrs
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jupyterlab/ui-components.@jupyterlab/ui-components/lib/icon/labicon.LabIcon.IOptions & {  _loading ? :boolean} */
trait IOptionsloadingboolean extends js.Object {
  var _loading: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the icon. By convention, the icon name will be namespaced
    * as so:
    *
    *     "pkg-name:icon-name"
    */
  val name: String
  var render: js.UndefOr[js.Function1[/* host */ HTMLElement, Unit]] = js.undefined
  /**
    * A string containing the raw contents of an svg file.
    */
  var svgstr: String
  var unrender: js.UndefOr[js.Function2[/* host */ HTMLElement, /* options */ js.UndefOr[AnonAttrs], Unit]] = js.undefined
}

object IOptionsloadingboolean {
  @scala.inline
  def apply(
    name: String,
    svgstr: String,
    _loading: js.UndefOr[Boolean] = js.undefined,
    render: /* host */ HTMLElement => Unit = null,
    unrender: (/* host */ HTMLElement, /* options */ js.UndefOr[AnonAttrs]) => Unit = null
  ): IOptionsloadingboolean = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
    if (!js.isUndefined(_loading)) __obj.updateDynamic("_loading")(_loading.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (unrender != null) __obj.updateDynamic("unrender")(js.Any.fromFunction2(unrender))
    __obj.asInstanceOf[IOptionsloadingboolean]
  }
}

