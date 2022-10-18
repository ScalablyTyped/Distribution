package typings.ioTs

import typings.fpTs.libSemigroupMod.Semigroup
import typings.ioTs.ioTsStrings.Concat
import typings.ioTs.ioTsStrings.Of
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFreeSemigroupMod {
  
  @JSImport("io-ts/lib/FreeSemigroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat[A](left: FreeSemigroup[A], right: FreeSemigroup[A]): FreeSemigroup[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[FreeSemigroup[A]]
  
  inline def fold[A, R](
    onOf: js.Function1[/* value */ A, R],
    onConcat: js.Function2[/* left */ FreeSemigroup[A], /* right */ FreeSemigroup[A], R]
  ): js.Function1[/* f */ FreeSemigroup[A], R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onOf.asInstanceOf[js.Any], onConcat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ FreeSemigroup[A], R]]
  
  inline def getSemigroup[A](): Semigroup[FreeSemigroup[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[FreeSemigroup[A]]]
  
  inline def of[A](a: A): FreeSemigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[FreeSemigroup[A]]
  
  trait Concat_[A]
    extends StObject
       with FreeSemigroup[A] {
    
    val _tag: Concat
    
    val left: FreeSemigroup[A]
    
    val right: FreeSemigroup[A]
  }
  object Concat_ {
    
    inline def apply[A](left: FreeSemigroup[A], right: FreeSemigroup[A]): Concat_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Concat", left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Concat_[A]]
    }
    
    extension [Self <: Concat_[?], A](x: Self & Concat_[A]) {
      
      inline def setLeft(value: FreeSemigroup[A]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: FreeSemigroup[A]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: Concat): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ioTs.libFreeSemigroupMod.Of_[A]
    - typings.ioTs.libFreeSemigroupMod.Concat_[A]
  */
  trait FreeSemigroup[A] extends StObject
  object FreeSemigroup {
    
    inline def Concat_[A](left: FreeSemigroup[A], right: FreeSemigroup[A]): typings.ioTs.libFreeSemigroupMod.Concat_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Concat", left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.libFreeSemigroupMod.Concat_[A]]
    }
    
    inline def Of_[A](value: A): typings.ioTs.libFreeSemigroupMod.Of_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Of", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.libFreeSemigroupMod.Of_[A]]
    }
  }
  
  trait Of_[A]
    extends StObject
       with FreeSemigroup[A] {
    
    val _tag: Of
    
    val value: A
  }
  object Of_ {
    
    inline def apply[A](value: A): Of_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Of", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Of_[A]]
    }
    
    extension [Self <: Of_[?], A](x: Self & Of_[A]) {
      
      inline def setValue(value: A): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: Of): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
}
