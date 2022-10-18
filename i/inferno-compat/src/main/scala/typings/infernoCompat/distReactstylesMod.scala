package typings.infernoCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReactstylesMod {
  
  @JSImport("inferno-compat/dist/reactstyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNumberStyleValue(style: String, value: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberStyleValue")(style.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def hyphenCase(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenCase")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
}
