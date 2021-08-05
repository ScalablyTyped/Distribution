package typings.hullJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pointSet: js.Array[js.Array[Double] | js.Object]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].apply(pointSet.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def apply(pointSet: js.Array[js.Array[Double] | js.Object], concavity: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(pointSet.asInstanceOf[js.Any], concavity.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(pointSet: js.Array[js.Array[Double] | js.Object], concavity: Double, format: js.Array[String]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(pointSet.asInstanceOf[js.Any], concavity.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(pointSet: js.Array[js.Array[Double] | js.Object], concavity: Unit, format: js.Array[String]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(pointSet.asInstanceOf[js.Any], concavity.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("hull.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
