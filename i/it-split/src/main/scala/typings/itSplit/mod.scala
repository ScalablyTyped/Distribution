package typings.itSplit

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[js.typedarray.Uint8Array]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
  inline def default(source: js.Iterable[js.typedarray.Uint8Array], options: SplitOptions): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
  inline def default(source: AsyncIterable[js.typedarray.Uint8Array]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
  inline def default(source: AsyncIterable[js.typedarray.Uint8Array], options: SplitOptions): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
  
  trait SplitOptions extends StObject {
    
    var delimiter: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object SplitOptions {
    
    inline def apply(): SplitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitOptions]
    }
    
    extension [Self <: SplitOptions](x: Self) {
      
      inline def setDelimiter(value: js.typedarray.Uint8Array): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    }
  }
}
