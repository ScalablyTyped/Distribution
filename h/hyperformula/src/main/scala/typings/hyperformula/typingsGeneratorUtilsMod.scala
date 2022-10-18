package typings.hyperformula

import typings.hyperformula.anon.Rest
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsGeneratorUtilsMod {
  
  @JSImport("hyperformula/typings/generatorUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty[T](): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[IterableIterator[T]]
  
  inline def first[T](iterable: IterableIterator[T]): Maybe[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(iterable.asInstanceOf[js.Any]).asInstanceOf[Maybe[T]]
  
  inline def split[T](iterable: IterableIterator[T]): Rest[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(iterable.asInstanceOf[js.Any]).asInstanceOf[Rest[T]]
}
