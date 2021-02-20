package typings.jupyterlabRendermimeInterfaces

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @jupyterlab/rendermime-interfaces.@jupyterlab/rendermime-interfaces.IRenderMime.LabIcon.IIcon & std.Partial<@jupyterlab/rendermime-interfaces.@jupyterlab/rendermime-interfaces.IRenderMime.LabIcon.IRenderer> */
  @js.native
  trait IIconPartialIRenderer extends StObject {
    
    /**
      * The name of the icon. By convention, the icon name will be namespaced
      * as so:
      *
      *     "pkg-name:icon-name"
      */
    val name: String = js.native
    
    var render: js.UndefOr[
        js.Function2[/* container */ HTMLElement, /* options */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /**
      * A string containing the raw contents of an svg file.
      */
    var svgstr: String = js.native
    
    var unrender: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.native
  }
  object IIconPartialIRenderer {
    
    @scala.inline
    def apply(name: String, svgstr: String): IIconPartialIRenderer = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconPartialIRenderer]
    }
    
    @scala.inline
    implicit class IIconPartialIRendererMutableBuilder[Self <: IIconPartialIRenderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: (/* container */ HTMLElement, /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSvgstr(value: String): Self = StObject.set(x, "svgstr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnrender(value: /* container */ HTMLElement => Unit): Self = StObject.set(x, "unrender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnrenderUndefined: Self = StObject.set(x, "unrender", js.undefined)
    }
  }
}
