package typings.libp2pNoise

import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itPairMod {
  
  type Duplex = js.Tuple2[Stream, Stream]
  
  @js.native
  trait Stream extends StObject {
    
    def sink(source: Iterable[_]): Unit = js.native
    
    var source: Record[String, _] = js.native
  }
  object Stream {
    
    @scala.inline
    def apply(sink: Iterable[_] => Unit, source: Record[String, _]): Stream = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSink(value: Iterable[_] => Unit): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: Record[String, _]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
