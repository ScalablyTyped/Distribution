package typings.ionicons

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("ionicons/dist/types/components/icon/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValid(elm: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(elm.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateContent(svgContent: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateContent")(svgContent.asInstanceOf[js.Any]).asInstanceOf[String]
}
