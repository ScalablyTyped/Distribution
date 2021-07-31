package typings.ioTs

import typings.fpTs.semigroupMod.Semigroup
import typings.ioTs.anon.Index
import typings.ioTs.freeSemigroupMod.FreeSemigroup
import typings.ioTs.ioTsStrings.Key
import typings.ioTs.ioTsStrings.Lazy
import typings.ioTs.ioTsStrings.Leaf
import typings.ioTs.ioTsStrings.Member
import typings.ioTs.ioTsStrings.Wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeErrorMod {
  
  @JSImport("io-ts/lib/DecodeError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fold[E, R](patterns: Index[E, R]): js.Function1[/* e */ DecodeError[E], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* e */ DecodeError[E], R]]
  
  @scala.inline
  def getSemigroup[E](): Semigroup[FreeSemigroup[DecodeError[E]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[FreeSemigroup[DecodeError[E]]]]
  
  @scala.inline
  def index[E](index: Double, kind: Kind, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(index.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  @scala.inline
  def key[E](key: String, kind: Kind, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  @scala.inline
  def `lazy`[E](id: String, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  @scala.inline
  def leaf[E](actual: js.Any, error: E): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("leaf")(actual.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  @scala.inline
  def member[E](index: Double, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("member")(index.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  @JSImport("io-ts/lib/DecodeError", "optional")
  @js.native
  val optional: typings.ioTs.ioTsStrings.optional = js.native
  
  @JSImport("io-ts/lib/DecodeError", "required")
  @js.native
  val required: typings.ioTs.ioTsStrings.required = js.native
  
  @scala.inline
  def wrap[E](error: E, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(error.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ioTs.decodeErrorMod.Leaf_[E]
    - typings.ioTs.decodeErrorMod.Key_[E]
    - typings.ioTs.decodeErrorMod.Index_[E]
    - typings.ioTs.decodeErrorMod.Member_[E]
    - typings.ioTs.decodeErrorMod.Lazy_[E]
    - typings.ioTs.decodeErrorMod.Wrap_[E]
  */
  trait DecodeError[E] extends StObject
  object DecodeError {
    
    @scala.inline
    def Index_[E](errors: FreeSemigroup[DecodeError[E]], index: Double, kind: Kind): typings.ioTs.decodeErrorMod.Index_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Index", errors = errors.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.decodeErrorMod.Index_[E]]
    }
    
    @scala.inline
    def Key_[E](errors: FreeSemigroup[DecodeError[E]], key: String, kind: Kind): typings.ioTs.decodeErrorMod.Key_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Key", errors = errors.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.decodeErrorMod.Key_[E]]
    }
    
    @scala.inline
    def Lazy_[E](errors: FreeSemigroup[DecodeError[E]], id: String): typings.ioTs.decodeErrorMod.Lazy_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Lazy", errors = errors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.decodeErrorMod.Lazy_[E]]
    }
    
    @scala.inline
    def Leaf_[E](actual: js.Any, error: E): typings.ioTs.decodeErrorMod.Leaf_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Leaf", actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.decodeErrorMod.Leaf_[E]]
    }
    
    @scala.inline
    def Member_[E](errors: FreeSemigroup[DecodeError[E]], index: Double): typings.ioTs.decodeErrorMod.Member_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Member", errors = errors.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.decodeErrorMod.Member_[E]]
    }
    
    @scala.inline
    def Wrap_[E](error: E, errors: FreeSemigroup[DecodeError[E]]): typings.ioTs.decodeErrorMod.Wrap_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Wrap", error = error.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ioTs.decodeErrorMod.Wrap_[E]]
    }
  }
  
  trait Index_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: typings.ioTs.ioTsStrings.Index
    
    val errors: FreeSemigroup[DecodeError[E]]
    
    val index: Double
    
    val kind: Kind
  }
  object Index_ {
    
    @scala.inline
    def apply[E](errors: FreeSemigroup[DecodeError[E]], index: Double, kind: Kind): Index_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Index", errors = errors.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index_[E]]
    }
    
    @scala.inline
    implicit class Index_MutableBuilder[Self <: Index_[?], E] (val x: Self & Index_[E]) extends AnyVal {
      
      @scala.inline
      def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: typings.ioTs.ioTsStrings.Index): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Key
    
    val errors: FreeSemigroup[DecodeError[E]]
    
    val key: String
    
    val kind: Kind
  }
  object Key_ {
    
    @scala.inline
    def apply[E](errors: FreeSemigroup[DecodeError[E]], key: String, kind: Kind): Key_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Key", errors = errors.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key_[E]]
    }
    
    @scala.inline
    implicit class Key_MutableBuilder[Self <: Key_[?], E] (val x: Self & Key_[E]) extends AnyVal {
      
      @scala.inline
      def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Key): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ioTs.ioTsStrings.required
    - typings.ioTs.ioTsStrings.optional
  */
  trait Kind extends StObject
  object Kind {
    
    @scala.inline
    def optional: typings.ioTs.ioTsStrings.optional = "optional".asInstanceOf[typings.ioTs.ioTsStrings.optional]
    
    @scala.inline
    def required: typings.ioTs.ioTsStrings.required = "required".asInstanceOf[typings.ioTs.ioTsStrings.required]
  }
  
  trait Lazy_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Lazy
    
    val errors: FreeSemigroup[DecodeError[E]]
    
    val id: String
  }
  object Lazy_ {
    
    @scala.inline
    def apply[E](errors: FreeSemigroup[DecodeError[E]], id: String): Lazy_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Lazy", errors = errors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lazy_[E]]
    }
    
    @scala.inline
    implicit class Lazy_MutableBuilder[Self <: Lazy_[?], E] (val x: Self & Lazy_[E]) extends AnyVal {
      
      @scala.inline
      def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Lazy): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Leaf_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Leaf
    
    val actual: js.Any
    
    val error: E
  }
  object Leaf_ {
    
    @scala.inline
    def apply[E](actual: js.Any, error: E): Leaf_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Leaf", actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Leaf_[E]]
    }
    
    @scala.inline
    implicit class Leaf_MutableBuilder[Self <: Leaf_[?], E] (val x: Self & Leaf_[E]) extends AnyVal {
      
      @scala.inline
      def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: E): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Leaf): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Member_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Member
    
    val errors: FreeSemigroup[DecodeError[E]]
    
    val index: Double
  }
  object Member_ {
    
    @scala.inline
    def apply[E](errors: FreeSemigroup[DecodeError[E]], index: Double): Member_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Member", errors = errors.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Member_[E]]
    }
    
    @scala.inline
    implicit class Member_MutableBuilder[Self <: Member_[?], E] (val x: Self & Member_[E]) extends AnyVal {
      
      @scala.inline
      def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Member): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Wrap_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Wrap
    
    val error: E
    
    val errors: FreeSemigroup[DecodeError[E]]
  }
  object Wrap_ {
    
    @scala.inline
    def apply[E](error: E, errors: FreeSemigroup[DecodeError[E]]): Wrap_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Wrap", error = error.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wrap_[E]]
    }
    
    @scala.inline
    implicit class Wrap_MutableBuilder[Self <: Wrap_[?], E] (val x: Self & Wrap_[E]) extends AnyVal {
      
      @scala.inline
      def setError(value: E): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Wrap): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
}
