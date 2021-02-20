package typings.jupyterlabRendermime

import typings.jupyterlabRendermime.anon.Math
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latexMod {
  
  @JSImport("@jupyterlab/rendermime/lib/latex", "removeMath")
  @js.native
  def removeMath(text: String): Math = js.native
  
  @JSImport("@jupyterlab/rendermime/lib/latex", "replaceMath")
  @js.native
  def replaceMath(text: String, math: js.Array[String]): String = js.native
}
