package typings.mapboxMaki

import typings.mapboxMaki.anon.All
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/maki", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Object that can be used to organize and display icons in your app or website */
  @JSImport("@mapbox/maki", "layouts")
  @js.native
  def layouts: All = js.native
  inline def layouts_=(x: All): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layouts")(x.asInstanceOf[js.Any])
  
  @JSImport("@mapbox/maki", "svgArray")
  @js.native
  def svgArray: js.Array[SvgContent] = js.native
  inline def svgArray_=(x: js.Array[SvgContent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svgArray")(x.asInstanceOf[js.Any])
  
  type IconName = String
  
  type SvgContent = String
}
