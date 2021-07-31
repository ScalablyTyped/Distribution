package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoder[A, O] extends StObject {
  
  def encode(a: A): O
}
object Encoder {
  
  @scala.inline
  def apply[A, O](encode: A => O): Encoder[A, O] = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Encoder[A, O]]
  }
  
  @scala.inline
  implicit class EncoderMutableBuilder[Self <: Encoder[?, ?], A, O] (val x: Self & (Encoder[A, O])) extends AnyVal {
    
    @scala.inline
    def setEncode(value: A => O): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
