package typings.itHandshake

import typings.itPushable.mod.Pushable_
import typings.itReader.mod.Reader_
import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-handshake", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handshake[TSink /* <: Uint8ArrayList | js.typedarray.Uint8Array */](
    stream: Duplex[
      AsyncIterable[Uint8ArrayList | js.typedarray.Uint8Array], 
      Source[TSink], 
      js.Promise[Unit]
    ]
  ): Handshake_[TSink] = ^.asInstanceOf[js.Dynamic].applyDynamic("handshake")(stream.asInstanceOf[js.Any]).asInstanceOf[Handshake_[TSink]]
  
  trait Handshake_[TSink] extends StObject {
    
    def read(): js.Promise[js.UndefOr[Uint8ArrayList]]
    
    var reader: Reader_
    
    def rest(): Source[TSink]
    
    var stream: Duplex[
        AsyncGenerator[Uint8ArrayList | js.typedarray.Uint8Array, Any, Any], 
        Source[TSink], 
        js.Promise[Unit]
      ]
    
    def write(data: TSink): Unit
    
    var writer: Pushable_[TSink, Unit, Any]
  }
  object Handshake_ {
    
    inline def apply[TSink](
      read: () => js.Promise[js.UndefOr[Uint8ArrayList]],
      reader: Reader_,
      rest: () => Source[TSink],
      stream: Duplex[
          AsyncGenerator[Uint8ArrayList | js.typedarray.Uint8Array, Any, Any], 
          Source[TSink], 
          js.Promise[Unit]
        ],
      write: TSink => Unit,
      writer: Pushable_[TSink, Unit, Any]
    ): Handshake_[TSink] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), reader = reader.asInstanceOf[js.Any], rest = js.Any.fromFunction0(rest), stream = stream.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), writer = writer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handshake_[TSink]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handshake_[?], TSink] (val x: Self & Handshake_[TSink]) extends AnyVal {
      
      inline def setRead(value: () => js.Promise[js.UndefOr[Uint8ArrayList]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setReader(value: Reader_): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
      
      inline def setRest(value: () => Source[TSink]): Self = StObject.set(x, "rest", js.Any.fromFunction0(value))
      
      inline def setStream(
        value: Duplex[
              AsyncGenerator[Uint8ArrayList | js.typedarray.Uint8Array, Any, Any], 
              Source[TSink], 
              js.Promise[Unit]
            ]
      ): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: TSink => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setWriter(value: Pushable_[TSink, Unit, Any]): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
}
