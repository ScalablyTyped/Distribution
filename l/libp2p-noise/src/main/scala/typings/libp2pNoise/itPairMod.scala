package typings.libp2pNoise

import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itPairMod {
  
  type Duplex = js.Tuple2[Stream, Stream]
  
  trait Stream extends StObject {
    
    def sink(source: Iterable[js.Any]): Unit
    
    var source: Record[String, js.Any]
  }
  object Stream {
    
    @scala.inline
    def apply(sink: Iterable[js.Any] => Unit, source: Record[String, js.Any]): Stream = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSink(value: Iterable[js.Any] => Unit): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: Record[String, js.Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
