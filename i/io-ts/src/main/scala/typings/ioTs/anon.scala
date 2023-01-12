package typings.ioTs

import typings.ioTs.libDecodeErrorMod.DecodeError
import typings.ioTs.libDecodeErrorMod.Kind
import typings.ioTs.libFreeSemigroupMod.FreeSemigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index[E, R] extends StObject {
    
    def Index(index: Double, kind: Kind, errors: FreeSemigroup[DecodeError[E]]): R
    
    def Key(key: String, kind: Kind, errors: FreeSemigroup[DecodeError[E]]): R
    
    def Lazy(id: String, errors: FreeSemigroup[DecodeError[E]]): R
    
    def Leaf(input: Any, error: E): R
    
    def Member(index: Double, errors: FreeSemigroup[DecodeError[E]]): R
    
    def Wrap(error: E, errors: FreeSemigroup[DecodeError[E]]): R
  }
  object Index {
    
    inline def apply[E, R](
      Index: (Double, Kind, FreeSemigroup[DecodeError[E]]) => R,
      Key: (String, Kind, FreeSemigroup[DecodeError[E]]) => R,
      Lazy: (String, FreeSemigroup[DecodeError[E]]) => R,
      Leaf: (Any, E) => R,
      Member: (Double, FreeSemigroup[DecodeError[E]]) => R,
      Wrap: (E, FreeSemigroup[DecodeError[E]]) => R
    ): Index[E, R] = {
      val __obj = js.Dynamic.literal(Index = js.Any.fromFunction3(Index), Key = js.Any.fromFunction3(Key), Lazy = js.Any.fromFunction2(Lazy), Leaf = js.Any.fromFunction2(Leaf), Member = js.Any.fromFunction2(Member), Wrap = js.Any.fromFunction2(Wrap))
      __obj.asInstanceOf[Index[E, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index[?, ?], E, R] (val x: Self & (Index[E, R])) extends AnyVal {
      
      inline def setIndex(value: (Double, Kind, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Index", js.Any.fromFunction3(value))
      
      inline def setKey(value: (String, Kind, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Key", js.Any.fromFunction3(value))
      
      inline def setLazy(value: (String, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Lazy", js.Any.fromFunction2(value))
      
      inline def setLeaf(value: (Any, E) => R): Self = StObject.set(x, "Leaf", js.Any.fromFunction2(value))
      
      inline def setMember(value: (Double, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Member", js.Any.fromFunction2(value))
      
      inline def setWrap(value: (E, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Wrap", js.Any.fromFunction2(value))
    }
  }
  
  trait Props extends StObject {
    
    var props: Any
  }
  object Props {
    
    inline def apply(props: Any): Props = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
