package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retroMod {
  
  @JSImport("@lumino/algorithm/types/retro", "RetroArrayIterator")
  @js.native
  class RetroArrayIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new retro iterator.
      *
      * @param source - The array-like object of interest.
      */
    def this(source: ArrayLike[T]) = this()
    
    var _index: js.Any = js.native
    
    var _source: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/retro", "retro")
  @js.native
  def retro[T](`object`: RetroableOrArrayLike[T]): IIterator[T] = js.native
  
  @js.native
  trait IRetroable[T] extends StObject {
    
    /**
      * Get a reverse iterator over the object's values.
      *
      * @returns An iterator which yields the object's values in reverse.
      */
    def retro(): IIterator[T] = js.native
  }
  object IRetroable {
    
    @scala.inline
    def apply[T](retro: () => IIterator[T]): IRetroable[T] = {
      val __obj = js.Dynamic.literal(retro = js.Any.fromFunction0(retro))
      __obj.asInstanceOf[IRetroable[T]]
    }
    
    @scala.inline
    implicit class IRetroableMutableBuilder[Self <: IRetroable[_], T] (val x: Self with IRetroable[T]) extends AnyVal {
      
      @scala.inline
      def setRetro(value: () => IIterator[T]): Self = StObject.set(x, "retro", js.Any.fromFunction0(value))
    }
  }
  
  type RetroableOrArrayLike[T] = IRetroable[T] | ArrayLike[T]
}
