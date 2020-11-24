package typings.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jsonldSpecMod {
  
  type Context = typings.jsonld.jsonldSpecMod.Document
  
  type DOMString = java.lang.String
  
  type Document = typings.jsonld.jsonldSpecMod.JsonLd | typings.jsonld.jsonldSpecMod.Url
  
  type Frame = typings.jsonld.jsonldSpecMod.JsonLdObj | typings.jsonld.jsonldSpecMod.Url
  
  type Iri = typings.jsonld.jsonldSpecMod.Url
  
  type JsonLd = typings.jsonld.jsonldSpecMod.JsonLdObj | typings.jsonld.jsonldSpecMod.JsonLdArray
  
  type JsonLdArray = js.Array[typings.jsonld.jsonldSpecMod.JsonLdObj]
  
  type JsonLdObj = js.Object
  
  type LoadDocumentCallback = js.Function1[
    /* url */ typings.jsonld.jsonldSpecMod.Url, 
    js.Promise[typings.jsonld.jsonldSpecMod.RemoteDocument]
  ]
  
  type Url = typings.jsonld.jsonldSpecMod.DOMString
}
