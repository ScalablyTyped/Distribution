package typings.hlsJs.anon

import typings.hlsJs.mod.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCapLevelController extends StObject {
  
  /* static member */
  def getMaxLevelByMediaSize(levels: js.Array[Level], width: Double, height: Double): Double = js.native
  
  /* static member */
  def isLevelAllowed(level: Double): Boolean = js.native
  def isLevelAllowed(level: Double, restrictedLevels: js.Array[Double]): Boolean = js.native
}
