package typings.libxslt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalTypesMod {
  type ApplyCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* result */ typings.libxslt.internalTypesMod.ApplyResult, 
    scala.Unit
  ]
  type ApplyDocumentCallback = js.Function2[/* err */ typings.std.Error, /* result */ typings.libxmljs.mod.Document, scala.Unit]
  type ApplyResult = java.lang.String | typings.libxmljs.mod.Document
  type ApplyStringCallback = js.Function2[/* err */ typings.std.Error, /* result */ java.lang.String, scala.Unit]
  type ParseCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* stylesheet */ typings.libxslt.mod.Stylesheet, 
    scala.Unit
  ]
}
