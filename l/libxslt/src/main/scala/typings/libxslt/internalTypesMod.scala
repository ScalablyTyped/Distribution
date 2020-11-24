package typings.libxslt

import typings.libxmljs.mod.Document
import typings.libxslt.mod.Stylesheet
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libxslt/internal-types", JSImport.Namespace)
@js.native
object internalTypesMod extends js.Object {
  
  type ApplyCallback = js.Function2[/* err */ Error | Null, /* result */ String | Document, Unit]
  
  type ApplyDocumentCallback = js.Function2[/* err */ Error | Null, /* result */ Document, Unit]
  
  type ApplyStringCallback = js.Function2[/* err */ Error | Null, /* result */ String, Unit]
  
  type ParseCallback = js.Function2[/* err */ Error | Null, /* stylesheet */ Stylesheet, Unit]
}
