package typings.itTar

import typings.itTar.mod.TarEntryHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPackHeadersMod {
  
  @JSImport("it-tar/dist/src/pack-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encode(opts: TarEntryHeader): js.typedarray.Uint8Array | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(opts.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def encodePax(opts: TarEntryHeader): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePax")(opts.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
