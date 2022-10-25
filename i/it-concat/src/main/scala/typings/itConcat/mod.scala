package typings.itConcat

import typings.itConcat.anon.Type
import typings.itConcat.anon.`0`
import typings.std.AsyncIterable
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[String | js.typedarray.Uint8Array | Uint8ArrayList]): js.Promise[Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8ArrayList]]
  inline def default(source: js.Iterable[String | js.typedarray.Uint8Array | Uint8ArrayList], options: Type): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(source: js.Iterable[String | js.typedarray.Uint8Array | Uint8ArrayList], options: `0`): js.Promise[Uint8ArrayList] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Uint8ArrayList]]
  inline def default(source: AsyncIterable[String | js.typedarray.Uint8Array | Uint8ArrayList]): js.Promise[Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8ArrayList]]
  inline def default(source: AsyncIterable[String | js.typedarray.Uint8Array | Uint8ArrayList], options: Type): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(source: AsyncIterable[String | js.typedarray.Uint8Array | Uint8ArrayList], options: `0`): js.Promise[Uint8ArrayList] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Uint8ArrayList]]
}
