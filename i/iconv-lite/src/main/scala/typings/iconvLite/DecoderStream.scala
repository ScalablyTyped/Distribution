package typings.iconvLite

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoderStream extends StObject {
  
  def end(): js.UndefOr[String] = js.native
  
  def write(buf: Buffer): String = js.native
}
object DecoderStream {
  
  @scala.inline
  def apply(end: () => js.UndefOr[String], write: Buffer => String): DecoderStream = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DecoderStream]
  }
  
  @scala.inline
  implicit class DecoderStreamMutableBuilder[Self <: DecoderStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: () => js.UndefOr[String]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: Buffer => String): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
