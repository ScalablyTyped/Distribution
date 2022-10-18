package typings.jupyterlabRendermime

import typings.jupyterlabRendermime.anon.Math
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLatexMod {
  
  @JSImport("@jupyterlab/rendermime/lib/latex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeMath(text: String): Math = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMath")(text.asInstanceOf[js.Any]).asInstanceOf[Math]
  
  inline def replaceMath(text: String, math: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceMath")(text.asInstanceOf[js.Any], math.asInstanceOf[js.Any])).asInstanceOf[String]
}
