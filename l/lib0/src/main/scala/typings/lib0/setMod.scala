package typings.lib0

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
  @JSImport("lib0/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Set[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Set[Any]]
  
  inline def first[T](set: Set[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(set.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def from[T](entries: js.Iterable[T]): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(entries.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
  
  inline def toArray[T](set: Set[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
