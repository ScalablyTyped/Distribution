package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decoder[I, A] extends StObject {
  
  def decode(i: I): Validation[A]
  
  val name: String
  
  def validate(i: I, context: Context): Validation[A]
}
object Decoder {
  
  @scala.inline
  def apply[I, A](decode: I => Validation[A], name: String, validate: (I, Context) => Validation[A]): Decoder[I, A] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), name = name.asInstanceOf[js.Any], validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[Decoder[I, A]]
  }
  
  @scala.inline
  implicit class DecoderMutableBuilder[Self <: Decoder[?, ?], I, A] (val x: Self & (Decoder[I, A])) extends AnyVal {
    
    @scala.inline
    def setDecode(value: I => Validation[A]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: (I, Context) => Validation[A]): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
  }
}
