package typings.itTar

import typings.itTar.mod.TarEntryHeader
import typings.std.Record
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractHeadersMod {
  
  @JSImport("it-tar/dist/src/extract-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buf: js.typedarray.Uint8Array): TarEntryHeader | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[TarEntryHeader | Null]
  inline def decode(
    buf: js.typedarray.Uint8Array,
    filenameEncoding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedEncodings */ Any
  ): TarEntryHeader | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any], filenameEncoding.asInstanceOf[js.Any])).asInstanceOf[TarEntryHeader | Null]
  inline def decode(buf: Uint8ArrayList): TarEntryHeader | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[TarEntryHeader | Null]
  inline def decode(
    buf: Uint8ArrayList,
    filenameEncoding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedEncodings */ Any
  ): TarEntryHeader | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any], filenameEncoding.asInstanceOf[js.Any])).asInstanceOf[TarEntryHeader | Null]
  
  inline def decodeLongPath(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeLongPath")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeLongPath(
    buf: js.typedarray.Uint8Array,
    encoding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedEncodings */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeLongPath")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeLongPath(buf: Uint8ArrayList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeLongPath")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeLongPath(
    buf: Uint8ArrayList,
    encoding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedEncodings */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeLongPath")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodePax(buf: js.typedarray.Uint8Array): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePax")(buf.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  inline def decodePax(
    buf: js.typedarray.Uint8Array,
    encoding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedEncodings */ Any
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePax")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def decodePax(buf: Uint8ArrayList): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePax")(buf.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  inline def decodePax(
    buf: Uint8ArrayList,
    encoding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedEncodings */ Any
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePax")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
}
