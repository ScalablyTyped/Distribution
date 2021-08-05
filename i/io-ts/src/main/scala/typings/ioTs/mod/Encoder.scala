package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoder[A, O] extends StObject {
  
  def encode(a: A): O
}
object Encoder {
  
  inline def apply[A, O](encode: A => O): Encoder[A, O] = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Encoder[A, O]]
  }
  
  extension [Self <: Encoder[?, ?], A, O](x: Self & (Encoder[A, O])) {
    
    inline def setEncode(value: A => O): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
