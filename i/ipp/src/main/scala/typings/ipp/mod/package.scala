package typings.ipp.mod

import typings.ipp.mod.^
import typings.node.bufferMod.global.Buffer
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def attribute: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("attribute").asInstanceOf[js.Object]

inline def attributes: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("attributes").asInstanceOf[js.Object]

inline def enums: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("enums").asInstanceOf[js.Object]

inline def keywords: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("keywords").asInstanceOf[js.Object]

inline def operations: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("operations").asInstanceOf[js.Object]

inline def parse(buf: Buffer): ParsedBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buf.asInstanceOf[js.Any]).asInstanceOf[ParsedBuffer]

inline def request(
  opts: String,
  buffer: Buffer,
  cb: js.Function2[/* error */ js.Error | Null, /* response */ ParsedBuffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(opts.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def request(
  opts: UrlWithStringQuery,
  buffer: Buffer,
  cb: js.Function2[/* error */ js.Error | Null, /* response */ ParsedBuffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(opts.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def serialize(msg: js.Object): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def statusCodes: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("statusCodes").asInstanceOf[js.Object]

inline def tags: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("tags").asInstanceOf[js.Object]

inline def versions: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("versions").asInstanceOf[js.Object]

type Resolution = js.Tuple3[Double, Double, String]
