package typings.jupyterlabRendermimeInterfaces

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @jupyterlab/rendermime-interfaces.@jupyterlab/rendermime-interfaces.IRenderMime.LabIcon.IIcon & std.Partial<@jupyterlab/rendermime-interfaces.@jupyterlab/rendermime-interfaces.IRenderMime.LabIcon.IRenderer> */
  trait IIconPartialIRenderer extends StObject {
    
    /**
      * The name of the icon. By convention, the icon name will be namespaced
      * as so:
      *
      *     "pkg-name:icon-name"
      */
    val name: String
    
    var render: js.UndefOr[js.Function2[/* container */ HTMLElement, /* options */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * A string containing the raw contents of an svg file.
      */
    var svgstr: String
    
    var unrender: js.UndefOr[js.Function2[/* container */ HTMLElement, /* options */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IIconPartialIRenderer {
    
    inline def apply(name: String, svgstr: String): IIconPartialIRenderer = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconPartialIRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IIconPartialIRenderer] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (/* container */ HTMLElement, /* options */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSvgstr(value: String): Self = StObject.set(x, "svgstr", value.asInstanceOf[js.Any])
      
      inline def setUnrender(value: (/* container */ HTMLElement, /* options */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "unrender", js.Any.fromFunction2(value))
      
      inline def setUnrenderUndefined: Self = StObject.set(x, "unrender", js.undefined)
    }
  }
}
