package typings.luminoAlgorithm

import typings.std.ArrayLike
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRetroMod {
  
  @JSImport("@lumino/algorithm/types/retro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retro[T](`object`: IRetroable[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retro")(`object`.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  inline def retro[T](`object`: ArrayLike[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retro")(`object`.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  
  trait IRetroable[T] extends StObject {
    
    /**
      * Get a reverse iterator over the object's values.
      *
      * @returns An iterator which yields the object's values in reverse.
      */
    def retro(): IterableIterator[T]
  }
  object IRetroable {
    
    inline def apply[T](retro: () => IterableIterator[T]): IRetroable[T] = {
      val __obj = js.Dynamic.literal(retro = js.Any.fromFunction0(retro))
      __obj.asInstanceOf[IRetroable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRetroable[?], T] (val x: Self & IRetroable[T]) extends AnyVal {
      
      inline def setRetro(value: () => IterableIterator[T]): Self = StObject.set(x, "retro", js.Any.fromFunction0(value))
    }
  }
}
