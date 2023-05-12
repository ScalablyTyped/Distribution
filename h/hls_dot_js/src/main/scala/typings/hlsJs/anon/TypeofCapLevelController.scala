package typings.hlsJs.anon

import org.scalablytyped.runtime.Instantiable1
import typings.hlsJs.mod.CapLevelController
import typings.hlsJs.mod.Hls
import typings.hlsJs.mod.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCapLevelController
  extends StObject
     with Instantiable1[/* hls */ Hls, CapLevelController] {
  
  def getMaxLevelByMediaSize(levels: js.Array[Level], width: Double, height: Double): Double = js.native
}
