package typings.libxslt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalDashTypesMod {
  import typings.libxmljs.libxmljsMod.Document
  import typings.libxslt.libxsltMod.Stylesheet
  import typings.std.Error

  type ApplyCallback = js.Function2[/* err */ Error, /* result */ ApplyResult, Unit]
  type ApplyDocumentCallback = js.Function2[/* err */ Error, /* result */ Document, Unit]
  type ApplyResult = String | Document
  type ApplyStringCallback = js.Function2[/* err */ Error, /* result */ String, Unit]
  type ParseCallback = js.Function2[/* err */ Error, /* stylesheet */ Stylesheet, Unit]
}
