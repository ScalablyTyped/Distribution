package typings.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonldDashSpecMod {
  type Context = Document
  type DOMString = String
  type Document = JsonLd | Url
  type Iri = Url
  type JsonLd = JsonLdObj | JsonLdArray
  type JsonLdArray = js.Array[js.Object]
  type JsonLdObj = js.Object
  type LoadDocumentCallback = js.Promise[Url]
  type Url = DOMString
}
