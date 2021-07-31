package typings.isTypedarray

import typings.node.Buffer
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = ^.asInstanceOf[js.Dynamic].apply(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is is-typedarray.is-typedarray.TypedArray */ Boolean]
  
  @JSImport("is-typedarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loose(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loose")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is is-typedarray.is-typedarray.TypedArray */ Boolean]
  
  @scala.inline
  def strict(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("strict")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is is-typedarray.is-typedarray.TypedArray */ Boolean]
  
  type TypedArray = Int8Array | Int16Array | Int32Array | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Float32Array | Float64Array | Buffer
}
