package typings.iconvLite

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncoderStream extends StObject {
  
  def end(): js.UndefOr[Buffer]
  
  def write(str: String): Buffer
}
object EncoderStream {
  
  inline def apply(end: () => js.UndefOr[Buffer], write: String => Buffer): EncoderStream = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[EncoderStream]
  }
  
  extension [Self <: EncoderStream](x: Self) {
    
    inline def setEnd(value: () => js.UndefOr[Buffer]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setWrite(value: String => Buffer): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
