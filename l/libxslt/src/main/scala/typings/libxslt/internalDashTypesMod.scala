package typings.libxslt

import typings.libxmljs.libxmljsMod.Document
import typings.libxslt.internalDashTypesMod.ApplyResult
import typings.libxslt.libxsltMod.Stylesheet
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt/internal-types", JSImport.Namespace)
@js.native
object internalDashTypesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.libxslt.libxsltStrings.document
    - typings.libxslt.libxsltStrings.string
  */
  trait OutputFormat extends js.Object
  
  type ApplyCallback = js.Function2[/* err */ Error, /* result */ ApplyResult, Unit]
  type ApplyDocumentCallback = js.Function2[/* err */ Error, /* result */ Document, Unit]
  type ApplyResult = String | Document
  type ApplyStringCallback = js.Function2[/* err */ Error, /* result */ String, Unit]
  type ParseCallback = js.Function2[/* err */ Error, /* stylesheet */ Stylesheet, Unit]
}

