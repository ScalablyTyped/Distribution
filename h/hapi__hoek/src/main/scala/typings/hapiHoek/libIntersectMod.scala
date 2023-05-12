package typings.hapiHoek

import typings.hapiHoek.mod.intersect.Array
import typings.hapiHoek.mod.intersect.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntersectMod {
  
  inline def apply[T1, T2](array1: Array[T1], array2: Array[T2]): T1 | T2 = (^.asInstanceOf[js.Dynamic].apply(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[T1 | T2]
  inline def apply[T1, T2](array1: Array[T1], array2: Array[T2], options: Options): T1 | T2 = (^.asInstanceOf[js.Dynamic].apply(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T1 | T2]
  
  @JSImport("@hapi/hoek/lib/intersect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
