package typings.libxslt

import typings.libxmljs.mod.Document
import typings.libxslt.mod.Stylesheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalTypesMod {
  
  type ApplyCallback = js.Function2[/* err */ js.Error | Null, /* result */ String | Document, Unit]
  
  type ApplyDocumentCallback = js.Function2[/* err */ js.Error | Null, /* result */ Document, Unit]
  
  type ApplyStringCallback = js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]
  
  type ParseCallback = js.Function2[/* err */ js.Error | Null, /* stylesheet */ Stylesheet, Unit]
}
