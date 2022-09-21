package typings.isStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDuplexStream(stream: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DuplexStream * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuplexStream")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DuplexStream * / any */ Boolean]
  
  inline def isReadableStream(stream: Any): /* is std.ReadableStream<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadableStream")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is std.ReadableStream<any> */ Boolean]
  
  inline def isStream(stream: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStream")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream * / any */ Boolean]
  
  inline def isTransformStream(stream: Any): /* is std.TransformStream<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransformStream")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is std.TransformStream<any, any> */ Boolean]
  
  inline def isWritableStream(stream: Any): /* is std.WritableStream<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWritableStream")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is std.WritableStream<any> */ Boolean]
}
