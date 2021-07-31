package typings.imageQ

import typings.imageQ.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lab2xyzMod {
  
  @JSImport("image-q/dist/conversion/lab2xyz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def lab2xyz(L: Double, a: Double, b: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("lab2xyz")(L.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[X]
}
