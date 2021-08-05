package typings.kuromoji.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizerBuilder[T] extends StObject {
  
  def build(callback: js.Function2[/* err */ Error, /* tokenizer */ Tokenizer[T], Unit]): Unit
}
object TokenizerBuilder {
  
  inline def apply[T](build: js.Function2[/* err */ Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): TokenizerBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
    __obj.asInstanceOf[TokenizerBuilder[T]]
  }
  
  extension [Self <: TokenizerBuilder[?], T](x: Self & TokenizerBuilder[T]) {
    
    inline def setBuild(value: js.Function2[/* err */ Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
  }
}
