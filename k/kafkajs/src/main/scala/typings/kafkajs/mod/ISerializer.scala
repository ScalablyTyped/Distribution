package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISerializer[T] extends StObject {
  
  def decode(buffer: Buffer): T | Null
  
  def encode(value: T): Buffer
}
object ISerializer {
  
  inline def apply[T](decode: Buffer => T | Null, encode: T => Buffer): ISerializer[T] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[ISerializer[T]]
  }
  
  extension [Self <: ISerializer[?], T](x: Self & ISerializer[T]) {
    
    inline def setDecode(value: Buffer => T | Null): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: T => Buffer): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
