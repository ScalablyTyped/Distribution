package typings.itTar

import typings.itTar.mod.TarEntryHeader
import typings.std.Record
import typings.uint8arraylist.mod.Uint8ArrayList
import typings.uint8arrays.distSrcUtilBasesMod.SupportedEncodings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcExtractHeadersMod {
  
  @JSImport("it-tar/dist/src/extract-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buf: js.typedarray.Uint8Array): TarEntryHeader | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[TarEntryHeader | Null]
  inline def decode(buf: js.typedarray.Uint8Array, filenameEncoding: SupportedEncodings): TarEntryHeader | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any], filenameEncoding.asInstanceOf[js.Any])).asInstanceOf[TarEntryHeader | Null]
  inline def decode(buf: Uint8ArrayList): TarEntryHeader | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[TarEntryHeader | Null]
  inline def decode(buf: Uint8ArrayList, filenameEncoding: SupportedEncodings): TarEntryHeader | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any], filenameEncoding.asInstanceOf[js.Any])).asInstanceOf[TarEntryHeader | Null]
  
  inline def decodeLongPath(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeLongPath")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeLongPath(buf: js.typedarray.Uint8Array, encoding: SupportedEncodings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeLongPath")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeLongPath(buf: Uint8ArrayList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeLongPath")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeLongPath(buf: Uint8ArrayList, encoding: SupportedEncodings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeLongPath")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodePax(buf: js.typedarray.Uint8Array): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePax")(buf.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  inline def decodePax(buf: js.typedarray.Uint8Array, encoding: SupportedEncodings): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePax")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def decodePax(buf: Uint8ArrayList): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePax")(buf.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  inline def decodePax(buf: Uint8ArrayList, encoding: SupportedEncodings): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePax")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
}
