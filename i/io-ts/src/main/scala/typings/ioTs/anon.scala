package typings.ioTs

import typings.ioTs.decodeErrorMod.DecodeError
import typings.ioTs.decodeErrorMod.Kind
import typings.ioTs.freeSemigroupMod.FreeSemigroup
import typings.ioTs.ioTsInts.`4`
import typings.ioTs.ioTsInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var length: typings.ioTs.ioTsInts.`3`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(length = 3)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setLength(value: typings.ioTs.ioTsInts.`3`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var length: `4`
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(length = 4)
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setLength(value: `4`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var length: `5`
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal(length = 5)
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setLength(value: `5`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var length: typings.ioTs.ioTsInts.`1`
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal(length = 1)
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setLength(value: typings.ioTs.ioTsInts.`1`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    extension [Self <: Index[?, ?], E, R](x: Self & (Index[E, R])) {
      
      inline def setIndex(value: (Double, Kind, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Index", js.Any.fromFunction3(value))
      
      inline def setKey(value: (String, Kind, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Key", js.Any.fromFunction3(value))
      
      inline def setLazy(value: (String, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Lazy", js.Any.fromFunction2(value))
      
      inline def setLeaf(value: (Any, E) => R): Self = StObject.set(x, "Leaf", js.Any.fromFunction2(value))
      
      inline def setMember(value: (Double, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Member", js.Any.fromFunction2(value))
      
      inline def setWrap(value: (E, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Wrap", js.Any.fromFunction2(value))
    }
  }
  
  trait Length extends StObject {
    
    var length: typings.ioTs.ioTsInts.`2`
  }
  object Length {
    
    inline def apply(): Length = {
      val __obj = js.Dynamic.literal(length = 2)
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: typings.ioTs.ioTsInts.`2`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Props](x: Self) {
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
