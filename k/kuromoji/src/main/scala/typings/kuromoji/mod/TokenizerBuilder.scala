package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizerBuilder[T] extends StObject {
  
  def build(callback: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit]): Unit
}
object TokenizerBuilder {
  
  inline def apply[T](build: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): TokenizerBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
    __obj.asInstanceOf[TokenizerBuilder[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenizerBuilder[?], T] (val x: Self & TokenizerBuilder[T]) extends AnyVal {
    
    inline def setBuild(value: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
  }
}
