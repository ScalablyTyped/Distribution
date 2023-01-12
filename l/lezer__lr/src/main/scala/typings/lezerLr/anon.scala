package typings.lezerLr

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.lezerCommon.mod.Tree
import typings.lezerLr.distStackMod.Stack
import typings.lezerLr.distTokenMod.ExternalTokenizer
import typings.lezerLr.distTokenMod.InputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object From {
    
    inline def apply(from: Double, to: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromTo extends StObject {
    
    def from(value: String, stack: Stack): Double
    
    def to(value: String, stack: Stack): Double
  }
  object FromTo {
    
    inline def apply(from: (String, Stack) => Double, to: (String, Stack) => Double): FromTo = {
      val __obj = js.Dynamic.literal(from = js.Any.fromFunction2(from), to = js.Any.fromFunction2(to))
      __obj.asInstanceOf[FromTo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromTo] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: (String, Stack) => Double): Self = StObject.set(x, "from", js.Any.fromFunction2(value))
      
      inline def setTo(value: (String, Stack) => Double): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    }
  }
  
  trait Hash[T] extends StObject {
    
    var hash: js.UndefOr[js.Function1[/* context */ T, Double]] = js.undefined
    
    var reduce: js.UndefOr[
        js.Function4[/* context */ T, /* term */ Double, /* stack */ Stack, /* input */ InputStream, T]
      ] = js.undefined
    
    var reuse: js.UndefOr[
        js.Function4[/* context */ T, /* node */ Tree, /* stack */ Stack, /* input */ InputStream, T]
      ] = js.undefined
    
    var shift: js.UndefOr[
        js.Function4[/* context */ T, /* term */ Double, /* stack */ Stack, /* input */ InputStream, T]
      ] = js.undefined
    
    var start: T
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Hash {
    
    inline def apply[T](start: T): Hash[T] = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hash[?], T] (val x: Self & Hash[T]) extends AnyVal {
      
      inline def setHash(value: /* context */ T => Double): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setReduce(value: (/* context */ T, /* term */ Double, /* stack */ Stack, /* input */ InputStream) => T): Self = StObject.set(x, "reduce", js.Any.fromFunction4(value))
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setReuse(value: (/* context */ T, /* node */ Tree, /* stack */ Stack, /* input */ InputStream) => T): Self = StObject.set(x, "reuse", js.Any.fromFunction4(value))
      
      inline def setReuseUndefined: Self = StObject.set(x, "reuse", js.undefined)
      
      inline def setShift(value: (/* context */ T, /* term */ Double, /* stack */ Stack, /* input */ InputStream) => T): Self = StObject.set(x, "shift", js.Any.fromFunction4(value))
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setStart(value: T): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable[T /* <: NumberDictionary[Double] */]
    extends StObject
       with Instantiable1[/* n */ Double, T]
  
  trait To extends StObject {
    
    var from: ExternalTokenizer
    
    var to: ExternalTokenizer
  }
  object To {
    
    inline def apply(from: ExternalTokenizer, to: ExternalTokenizer): To = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[To]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: To] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: ExternalTokenizer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: ExternalTokenizer): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
