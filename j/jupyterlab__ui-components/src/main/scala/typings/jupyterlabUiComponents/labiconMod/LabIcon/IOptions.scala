package typings.jupyterlabUiComponents.labiconMod.LabIcon

import typings.luminoVirtualdom.anon.Attrs
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface defining the parameters to be passed to the LabIcon
  * constructor
  */
/* Inlined parent @jupyterlab/ui-components.@jupyterlab/ui-components/lib/icon/labicon.LabIcon.IIcon */
/* Inlined parent std.Partial<@lumino/virtualdom.@lumino/virtualdom.VirtualElement.IRenderer> */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The name of the icon. By convention, the icon name will be namespaced
    * as so:
    *
    *     "pkg-name:icon-name"
    */
  val name: String = js.native
  
  var render: js.UndefOr[js.Function1[/* host */ HTMLElement, Unit]] = js.native
  
  /**
    * A string containing the raw contents of an svg file.
    */
  var svgstr: String = js.native
  
  var unrender: js.UndefOr[js.Function2[/* host */ HTMLElement, /* options */ js.UndefOr[Attrs], Unit]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(name: String, svgstr: String): IOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setSvgstr(value: String): Self = this.set("svgstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: /* host */ HTMLElement => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setUnrender(value: (/* host */ HTMLElement, /* options */ js.UndefOr[Attrs]) => Unit): Self = this.set("unrender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUnrender: Self = this.set("unrender", js.undefined)
  }
}
