package typings.lodash

import typings.lodash.mod.ArrayIterator
import typings.lodash.mod.Collection
import typings.lodash.mod.List
import typings.lodash.mod.ListIterator
import typings.lodash.mod.MapCacheConstructor
import typings.lodash.mod.MemoizedFunction
import typings.lodash.mod.Object
import typings.lodash.mod.ObjectIterator
import typings.lodash.mod.StringIterator
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply[T /* <: js.Function1[/* args */ js.Any, _] */](func: T): T with MemoizedFunction = js.native
    def apply[T /* <: js.Function1[/* args */ js.Any, _] */](func: T, resolver: js.Function1[/* args */ Parameters[T], _]): T with MemoizedFunction = js.native
    
    var Cache: MapCacheConstructor = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(collection: String): String = js.native
    def apply(collection: String, iteratee: StringIterator[_]): String = js.native
    def apply[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
    def apply[T /* <: js.Object */](collection: T): T = js.native
    def apply[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): T = js.native
    def apply[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
    def apply[T](collection: js.Array[T]): js.Array[T] = js.native
    def apply[T](collection: js.Array[T], iteratee: ArrayIterator[T, _]): js.Array[T] = js.native
    def apply[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
    def apply[T](collection: List[T]): List[T] = js.native
    def apply[T](collection: List[T], iteratee: ListIterator[T, _]): List[T] = js.native
  }
  
  @js.native
  trait Length extends StObject {
    
    var length: Double = js.native
  }
  object Length {
    
    @scala.inline
    def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LodashAnyHack extends StObject {
    
    var __lodashAnyHack: js.Any = js.native
  }
  object LodashAnyHack {
    
    @scala.inline
    def apply(__lodashAnyHack: js.Any): LodashAnyHack = {
      val __obj = js.Dynamic.literal(__lodashAnyHack = __lodashAnyHack.asInstanceOf[js.Any])
      __obj.asInstanceOf[LodashAnyHack]
    }
    
    @scala.inline
    implicit class LodashAnyHackMutableBuilder[Self <: LodashAnyHack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__lodashAnyHack(value: js.Any): Self = StObject.set(x, "__lodashAnyHack", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrapAny extends StObject {
    
    var __trapAny: js.Any = js.native
  }
  object TrapAny {
    
    @scala.inline
    def apply(__trapAny: js.Any): TrapAny = {
      val __obj = js.Dynamic.literal(__trapAny = __trapAny.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrapAny]
    }
    
    @scala.inline
    implicit class TrapAnyMutableBuilder[Self <: TrapAny] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__trapAny(value: js.Any): Self = StObject.set(x, "__trapAny", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoflodash extends StObject {
    
    def apply(): typings.lodash.mod.String = js.native
    def apply(value: String): typings.lodash.mod.String = js.native
    def apply[T /* <: js.Object */](value: T): Object[T] = js.native
    def apply[T](value: List[T]): Collection[T] = js.native
  }
}
