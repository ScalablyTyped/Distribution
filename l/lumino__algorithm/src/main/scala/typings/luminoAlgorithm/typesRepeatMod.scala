package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepeatMod {
  
  @JSImport("@lumino/algorithm/types/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def once[T](value: T): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(value.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  
  inline def repeat[T](value: T, count: Double): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(value.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
}
