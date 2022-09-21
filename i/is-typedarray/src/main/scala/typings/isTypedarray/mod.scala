package typings.isTypedarray

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(candidate: Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = ^.asInstanceOf[js.Dynamic].apply(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is is-typedarray.is-typedarray.TypedArray */ Boolean]
  
  @JSImport("is-typedarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loose(candidate: Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loose")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is is-typedarray.is-typedarray.TypedArray */ Boolean]
  
  inline def strict(candidate: Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("strict")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is is-typedarray.is-typedarray.TypedArray */ Boolean]
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | Buffer
}
