package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def attribute: js.Object = typings.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("attribute").asInstanceOf[js.Object]

@scala.inline
def attributes: js.Object = typings.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("attributes").asInstanceOf[js.Object]

@scala.inline
def enums: js.Object = typings.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("enums").asInstanceOf[js.Object]

@scala.inline
def keywords: js.Object = typings.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("keywords").asInstanceOf[js.Object]

@scala.inline
def operations: js.Object = typings.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("operations").asInstanceOf[js.Object]

@scala.inline
def parse(buf: typings.node.Buffer): typings.ipp.mod.ParsedBuffer = typings.ipp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.ipp.mod.ParsedBuffer]

@scala.inline
def request(
  opts: java.lang.String,
  buffer: typings.node.Buffer,
  cb: js.Function2[
  /* error */ typings.std.Error | scala.Null, 
  /* response */ typings.ipp.mod.ParsedBuffer, 
  scala.Unit
]
): scala.Unit = (typings.ipp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("request")(opts.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def request(
  opts: typings.node.urlMod.UrlWithStringQuery,
  buffer: typings.node.Buffer,
  cb: js.Function2[
  /* error */ typings.std.Error | scala.Null, 
  /* response */ typings.ipp.mod.ParsedBuffer, 
  scala.Unit
]
): scala.Unit = (typings.ipp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("request")(opts.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def serialize(msg: js.Object): typings.node.Buffer = typings.ipp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(msg.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]

@scala.inline
def statusCodes: js.Object = typings.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("statusCodes").asInstanceOf[js.Object]

@scala.inline
def tags: js.Object = typings.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("tags").asInstanceOf[js.Object]

@scala.inline
def versions: js.Object = typings.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("versions").asInstanceOf[js.Object]

type Resolution = js.Tuple3[scala.Double, scala.Double, java.lang.String]
