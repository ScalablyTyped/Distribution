package typings.itHandshake

import typings.itPushable.mod.Pushable_
import typings.itReader.mod.Reader_
import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-handshake", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handshake[TSink /* <: Uint8ArrayList | js.typedarray.Uint8Array */](stream: Duplex[Uint8ArrayList | js.typedarray.Uint8Array, TSink, js.Promise[Unit]]): Handshake_[TSink] = ^.asInstanceOf[js.Dynamic].applyDynamic("handshake")(stream.asInstanceOf[js.Any]).asInstanceOf[Handshake_[TSink]]
  
  trait Handshake_[TSink] extends StObject {
    
    def read(): js.Promise[js.UndefOr[Uint8ArrayList]]
    
    var reader: Reader_
    
    def rest(): Source[TSink]
    
    var stream: Duplex[Uint8ArrayList, TSink, js.Promise[Unit]]
    
    def write(data: TSink): Unit
    
    var writer: Pushable_[TSink]
  }
  object Handshake_ {
    
    inline def apply[TSink](
      read: () => js.Promise[js.UndefOr[Uint8ArrayList]],
      reader: Reader_,
      rest: () => Source[TSink],
      stream: Duplex[Uint8ArrayList, TSink, js.Promise[Unit]],
      write: TSink => Unit,
      writer: Pushable_[TSink]
    ): Handshake_[TSink] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), reader = reader.asInstanceOf[js.Any], rest = js.Any.fromFunction0(rest), stream = stream.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), writer = writer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handshake_[TSink]]
    }
    
    extension [Self <: Handshake_[?], TSink](x: Self & Handshake_[TSink]) {
      
      inline def setRead(value: () => js.Promise[js.UndefOr[Uint8ArrayList]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setReader(value: Reader_): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
      
      inline def setRest(value: () => Source[TSink]): Self = StObject.set(x, "rest", js.Any.fromFunction0(value))
      
      inline def setStream(value: Duplex[Uint8ArrayList, TSink, js.Promise[Unit]]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: TSink => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setWriter(value: Pushable_[TSink]): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
}
