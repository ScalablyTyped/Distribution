package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssItypedescriptorMod.ITypeDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssTypesColorMod {
  
  @JSImport("html2canvas/dist/types/css/types/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asString(color: Color_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("html2canvas/dist/types/css/types/color", "color")
  @js.native
  val color: ITypeDescriptor[Color_] = js.native
  
  inline def isTransparent(color: Color_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransparent")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pack(r: Double, g: Double, b: Double, a: Double): Color_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Color_]
  
  inline def parseColor(context: Context, value: String): Color_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parseColor")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Color_]
  
  type Color_ = Double
}
