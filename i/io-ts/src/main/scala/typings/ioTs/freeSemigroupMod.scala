package typings.ioTs

import typings.fpTs.semigroupMod.Semigroup
import typings.ioTs.ioTsStrings.Concat
import typings.ioTs.ioTsStrings.Of
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object freeSemigroupMod {
  
  @JSImport("io-ts/lib/FreeSemigroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def concat[A](left: FreeSemigroup[A], right: FreeSemigroup[A]): FreeSemigroup[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[FreeSemigroup[A]]
  
  @scala.inline
  def fold[A, R](
    onOf: js.Function1[/* value */ A, R],
    onConcat: js.Function2[/* left */ FreeSemigroup[A], /* right */ FreeSemigroup[A], R]
  ): js.Function1[/* f */ FreeSemigroup[A], R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onOf.asInstanceOf[js.Any], onConcat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ FreeSemigroup[A], R]]
  
  @scala.inline
  def getSemigroup[A](): Semigroup[FreeSemigroup[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[FreeSemigroup[A]]]
  
  @scala.inline
  def of[A](a: A): FreeSemigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[FreeSemigroup[A]]
  
  trait Concat_[A]
    extends StObject
       with FreeSemigroup[A] {
    
    val _tag: Concat
    
    val left: FreeSemigroup[A]
    
    val right: FreeSemigroup[A]
  }
  object Concat_ {
    
    @scala.inline
    def apply[A](left: FreeSemigroup[A], right: FreeSemigroup[A]): Concat_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Concat", left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Concat_[A]]
    }
    
    @scala.inline
    implicit class Concat_MutableBuilder[Self <: Concat_[?], A] (val x: Self & Concat_[A]) extends AnyVal {
      
      @scala.inline
      def setLeft(value: FreeSemigroup[A]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: FreeSemigroup[A]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Concat): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ioTs.freeSemigroupMod.Of_[A]
    - typings.ioTs.freeSemigroupMod.Concat_[A]
  */
  trait FreeSemigroup[A] extends StObject
  object FreeSemigroup {
    
    @scala.inline
    def Concat_[A](left: FreeSemigroup[A], right: FreeSemigroup[A]): typings.ioTs.freeSemigroupMod.Concat_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Concat", left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.freeSemigroupMod.Concat_[A]]
    }
    
    @scala.inline
    def Of_[A](value: A): typings.ioTs.freeSemigroupMod.Of_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Of", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.freeSemigroupMod.Of_[A]]
    }
  }
  
  trait Of_[A]
    extends StObject
       with FreeSemigroup[A] {
    
    val _tag: Of
    
    val value: A
  }
  object Of_ {
    
    @scala.inline
    def apply[A](value: A): Of_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Of", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Of_[A]]
    }
    
    @scala.inline
    implicit class Of_MutableBuilder[Self <: Of_[?], A] (val x: Self & Of_[A]) extends AnyVal {
      
      @scala.inline
      def setValue(value: A): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Of): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
}
