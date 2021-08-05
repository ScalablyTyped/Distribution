package typings.jsonld

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonldSpecMod {
  
  type Context = Document
  
  type DOMString = String
  
  type Document = JsonLd | Url
  
  type Frame = JsonLdObj | Url
  
  type Iri = Url
  
  type JsonLd = JsonLdObj | JsonLdArray
  
  type JsonLdArray = js.Array[JsonLdObj]
  
  type JsonLdObj = js.Object
  
  @js.native
  trait JsonLdProcessor extends StObject {
    
    def compact(input: Document, context: Context): js.Promise[JsonLdObj] = js.native
    def compact(input: Document, context: Context, options: Options): js.Promise[JsonLdObj] = js.native
    
    def expand(input: Document): js.Promise[JsonLdArray] = js.native
    def expand(input: Document, options: Options): js.Promise[JsonLdArray] = js.native
    
    def flatten(input: Document): js.Promise[JsonLdObj] = js.native
    def flatten(input: Document, context: Null, options: Options): js.Promise[JsonLdObj] = js.native
    def flatten(input: Document, context: Unit, options: Options): js.Promise[JsonLdObj] = js.native
    def flatten(input: Document, context: Context): js.Promise[JsonLdObj] = js.native
    def flatten(input: Document, context: Context, options: Options): js.Promise[JsonLdObj] = js.native
  }
  
  type LoadDocumentCallback = js.Function1[/* url */ Url, js.Promise[RemoteDocument]]
  
  trait Options extends StObject {
    
    var base: js.UndefOr[DOMString | Null] = js.undefined
    
    var compactArrays: js.UndefOr[Boolean] = js.undefined
    
    var documentLoader: js.UndefOr[LoadDocumentCallback | Null] = js.undefined
    
    var expandContext: js.UndefOr[Context | Null] = js.undefined
    
    var processingMode: js.UndefOr[DOMString] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBase(value: DOMString): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseNull: Self = StObject.set(x, "base", null)
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setCompactArrays(value: Boolean): Self = StObject.set(x, "compactArrays", value.asInstanceOf[js.Any])
      
      inline def setCompactArraysUndefined: Self = StObject.set(x, "compactArrays", js.undefined)
      
      inline def setDocumentLoader(value: /* url */ Url => js.Promise[RemoteDocument]): Self = StObject.set(x, "documentLoader", js.Any.fromFunction1(value))
      
      inline def setDocumentLoaderNull: Self = StObject.set(x, "documentLoader", null)
      
      inline def setDocumentLoaderUndefined: Self = StObject.set(x, "documentLoader", js.undefined)
      
      inline def setExpandContext(value: Context): Self = StObject.set(x, "expandContext", value.asInstanceOf[js.Any])
      
      inline def setExpandContextNull: Self = StObject.set(x, "expandContext", null)
      
      inline def setExpandContextUndefined: Self = StObject.set(x, "expandContext", js.undefined)
      
      inline def setExpandContextVarargs(value: JsonLdObj*): Self = StObject.set(x, "expandContext", js.Array(value :_*))
      
      inline def setProcessingMode(value: DOMString): Self = StObject.set(x, "processingMode", value.asInstanceOf[js.Any])
      
      inline def setProcessingModeUndefined: Self = StObject.set(x, "processingMode", js.undefined)
    }
  }
  
  trait RemoteDocument extends StObject {
    
    var contextUrl: js.UndefOr[Url] = js.undefined
    
    var document: JsonLd
    
    var documentUrl: Url
  }
  object RemoteDocument {
    
    inline def apply(document: JsonLd, documentUrl: Url): RemoteDocument = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], documentUrl = documentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteDocument]
    }
    
    extension [Self <: RemoteDocument](x: Self) {
      
      inline def setContextUrl(value: Url): Self = StObject.set(x, "contextUrl", value.asInstanceOf[js.Any])
      
      inline def setContextUrlUndefined: Self = StObject.set(x, "contextUrl", js.undefined)
      
      inline def setDocument(value: JsonLd): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrl(value: Url): Self = StObject.set(x, "documentUrl", value.asInstanceOf[js.Any])
      
      inline def setDocumentVarargs(value: JsonLdObj*): Self = StObject.set(x, "document", js.Array(value :_*))
    }
  }
  
  type Url = DOMString
}
