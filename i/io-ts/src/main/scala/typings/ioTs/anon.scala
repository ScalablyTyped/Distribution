package typings.ioTs

import typings.ioTs.decodeErrorMod.DecodeError
import typings.ioTs.decodeErrorMod.Kind
import typings.ioTs.freeSemigroupMod.FreeSemigroup
import typings.ioTs.ioTsNumbers.`4`
import typings.ioTs.ioTsNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var length: typings.ioTs.ioTsNumbers.`3`
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal(length = 3)
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: typings.ioTs.ioTsNumbers.`3`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var length: `4`
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal(length = 4)
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: `4`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var length: `5`
  }
  object `2` {
    
    @scala.inline
    def apply(): `2` = {
      val __obj = js.Dynamic.literal(length = 5)
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: `5`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var length: typings.ioTs.ioTsNumbers.`1`
  }
  object `3` {
    
    @scala.inline
    def apply(): `3` = {
      val __obj = js.Dynamic.literal(length = 1)
      __obj.asInstanceOf[`3`]
    }
    
    @scala.inline
    implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: typings.ioTs.ioTsNumbers.`1`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index[E, R] extends StObject {
    
    def Index(index: Double, kind: Kind, errors: FreeSemigroup[DecodeError[E]]): R
    
    def Key(key: String, kind: Kind, errors: FreeSemigroup[DecodeError[E]]): R
    
    def Lazy(id: String, errors: FreeSemigroup[DecodeError[E]]): R
    
    def Leaf(input: js.Any, error: E): R
    
    def Member(index: Double, errors: FreeSemigroup[DecodeError[E]]): R
    
    def Wrap(error: E, errors: FreeSemigroup[DecodeError[E]]): R
  }
  object Index {
    
    @scala.inline
    def apply[E, R](
      Index: (Double, Kind, FreeSemigroup[DecodeError[E]]) => R,
      Key: (String, Kind, FreeSemigroup[DecodeError[E]]) => R,
      Lazy: (String, FreeSemigroup[DecodeError[E]]) => R,
      Leaf: (js.Any, E) => R,
      Member: (Double, FreeSemigroup[DecodeError[E]]) => R,
      Wrap: (E, FreeSemigroup[DecodeError[E]]) => R
    ): Index[E, R] = {
      val __obj = js.Dynamic.literal(Index = js.Any.fromFunction3(Index), Key = js.Any.fromFunction3(Key), Lazy = js.Any.fromFunction2(Lazy), Leaf = js.Any.fromFunction2(Leaf), Member = js.Any.fromFunction2(Member), Wrap = js.Any.fromFunction2(Wrap))
      __obj.asInstanceOf[Index[E, R]]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index[?, ?], E, R] (val x: Self & (Index[E, R])) extends AnyVal {
      
      @scala.inline
      def setIndex(value: (Double, Kind, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Index", js.Any.fromFunction3(value))
      
      @scala.inline
      def setKey(value: (String, Kind, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Key", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLazy(value: (String, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Lazy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeaf(value: (js.Any, E) => R): Self = StObject.set(x, "Leaf", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMember(value: (Double, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Member", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWrap(value: (E, FreeSemigroup[DecodeError[E]]) => R): Self = StObject.set(x, "Wrap", js.Any.fromFunction2(value))
    }
  }
  
  trait Length extends StObject {
    
    var length: typings.ioTs.ioTsNumbers.`2`
  }
  object Length {
    
    @scala.inline
    def apply(): Length = {
      val __obj = js.Dynamic.literal(length = 2)
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: typings.ioTs.ioTsNumbers.`2`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var props: js.Any
  }
  object Props {
    
    @scala.inline
    def apply(props: js.Any): Props = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
