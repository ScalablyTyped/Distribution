package typings.itStreamTypes

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Duplex[TSource, TSink, RSink] extends StObject {
    
    def sink(source: TSink): RSink
    @JSName("sink")
    var sink_Original: Sink[TSink, RSink]
    
    var source: TSource
  }
  object Duplex {
    
    inline def apply[TSource, TSink, RSink](sink: TSink => RSink, source: TSource): Duplex[TSource, TSink, RSink] = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duplex[TSource, TSink, RSink]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duplex[?, ?, ?], TSource, TSink, RSink] (val x: Self & (Duplex[TSource, TSink, RSink])) extends AnyVal {
      
      inline def setSink(value: TSink => RSink): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
      
      inline def setSource(value: TSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type Sink[Source, R] = js.Function1[/* source */ Source, R]
  
  type Source[T] = AsyncIterable[T] | js.Iterable[T]
  
  type Transform[A, B] = js.Function1[/* source */ A, B]
}
