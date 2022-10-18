package typings.ionicCliFrameworkOutput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("@ionic/cli-framework-output/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dropWhile[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def dropWhile[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def enforceLF(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceLF")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatHrTime(hrtime: js.Tuple2[Double, Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHrTime")(hrtime.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def identity[T](v: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[T]
}
