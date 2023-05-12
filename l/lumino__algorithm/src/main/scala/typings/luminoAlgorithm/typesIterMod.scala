package typings.luminoAlgorithm

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIterMod {
  
  @JSImport("@lumino/algorithm/types/iter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def each[T](`object`: js.Iterable[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def every[T](`object`: js.Iterable[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def some[T](`object`: js.Iterable[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toArray[T](`object`: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toObject[T](`object`: js.Iterable[js.Tuple2[String, T]]): StringDictionary[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[T]]
}
