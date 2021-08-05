package typings.iconvLite

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecoderStream extends StObject {
  
  def end(): js.UndefOr[String]
  
  def write(buf: Buffer): String
}
object DecoderStream {
  
  inline def apply(end: () => js.UndefOr[String], write: Buffer => String): DecoderStream = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DecoderStream]
  }
  
  extension [Self <: DecoderStream](x: Self) {
    
    inline def setEnd(value: () => js.UndefOr[String]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setWrite(value: Buffer => String): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
