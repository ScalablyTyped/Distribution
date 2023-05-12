package typings.luminoAlgorithm

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesZipMod {
  
  @JSImport("@lumino/algorithm/types/zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zip[T](objects: js.Iterable[T]*): IterableIterator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IterableIterator[js.Array[T]]]
}
