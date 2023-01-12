package typings.jsonld

import typings.jsonld.jsonldMod.ContextDefinition
import typings.jsonld.jsonldMod.JsonLdDocument
import typings.jsonld.jsonldMod.NodeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonldSpecMod {
  
  type Context = ContextDefinition
  
  type DOMString = String
  
  type Document = JsonLdDocument
  
  type Frame = JsonLdObj | Url
  
  type Iri = Url
  
  type JsonLd = JsonLdObj | JsonLdArray
  
  type JsonLdArray = js.Array[JsonLdObj]
  
  type JsonLdObj = NodeObject
  
  @js.native
  trait JsonLdProcessor extends StObject {
    
    def compact(input: JsonLdDocument, context: ContextDefinition): js.Promise[JsonLdObj] = js.native
    def compact(input: JsonLdDocument, context: ContextDefinition, options: Options): js.Promise[JsonLdObj] = js.native
    
    def expand(input: JsonLdDocument): js.Promise[JsonLdArray] = js.native
    def expand(input: JsonLdDocument, options: Options): js.Promise[JsonLdArray] = js.native
    
    def flatten(input: JsonLdDocument): js.Promise[JsonLdObj] = js.native
    def flatten(input: JsonLdDocument, context: Null, options: Options): js.Promise[JsonLdObj] = js.native
    def flatten(input: JsonLdDocument, context: Unit, options: Options): js.Promise[JsonLdObj] = js.native
    def flatten(input: JsonLdDocument, context: ContextDefinition): js.Promise[JsonLdObj] = js.native
    def flatten(input: JsonLdDocument, context: ContextDefinition, options: Options): js.Promise[JsonLdObj] = js.native
  }
  
  type LoadDocumentCallback = js.Function1[/* url */ Url, js.Promise[RemoteDocument]]
  
  trait Options extends StObject {
    
    var base: js.UndefOr[DOMString | Null] = js.undefined
    
    var compactArrays: js.UndefOr[Boolean] = js.undefined
    
    var documentLoader: js.UndefOr[LoadDocumentCallback | Null] = js.undefined
    
    var expandContext: js.UndefOr[ContextDefinition | Null] = js.undefined
    
    var processingMode: js.UndefOr[DOMString] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBase(value: DOMString): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseNull: Self = StObject.set(x, "base", null)
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setCompactArrays(value: Boolean): Self = StObject.set(x, "compactArrays", value.asInstanceOf[js.Any])
      
      inline def setCompactArraysUndefined: Self = StObject.set(x, "compactArrays", js.undefined)
      
      inline def setDocumentLoader(value: /* url */ Url => js.Promise[RemoteDocument]): Self = StObject.set(x, "documentLoader", js.Any.fromFunction1(value))
      
      inline def setDocumentLoaderNull: Self = StObject.set(x, "documentLoader", null)
      
      inline def setDocumentLoaderUndefined: Self = StObject.set(x, "documentLoader", js.undefined)
      
      inline def setExpandContext(value: ContextDefinition): Self = StObject.set(x, "expandContext", value.asInstanceOf[js.Any])
      
      inline def setExpandContextNull: Self = StObject.set(x, "expandContext", null)
      
      inline def setExpandContextUndefined: Self = StObject.set(x, "expandContext", js.undefined)
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoteDocument] (val x: Self) extends AnyVal {
      
      inline def setContextUrl(value: Url): Self = StObject.set(x, "contextUrl", value.asInstanceOf[js.Any])
      
      inline def setContextUrlUndefined: Self = StObject.set(x, "contextUrl", js.undefined)
      
      inline def setDocument(value: JsonLd): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrl(value: Url): Self = StObject.set(x, "documentUrl", value.asInstanceOf[js.Any])
      
      inline def setDocumentVarargs(value: JsonLdObj*): Self = StObject.set(x, "document", js.Array(value*))
    }
  }
  
  type Url = DOMString
}
