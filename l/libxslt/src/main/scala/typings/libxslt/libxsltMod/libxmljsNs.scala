package typings.libxslt.libxsltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt", "libxmljs")
@js.native
object libxmljsNs extends js.Object {
  @js.native
  class Attribute ()
    extends typings.libxmljs.libxmljsMod.Attribute
  
  @js.native
  /**
    * Create a new XML Document
    * @param version XML document version, defaults to 1.0
    * @param encoding Encoding, defaults to utf8
    */
  class Document ()
    extends typings.libxmljs.libxmljsMod.Document
  
  @js.native
  class Element protected ()
    extends typings.libxmljs.libxmljsMod.Element {
    def this(doc: typings.libxmljs.libxmljsMod.Document, name: String) = this()
  }
  
  @js.native
  class Namespace ()
    extends typings.libxmljs.libxmljsMod.Namespace
  
  @js.native
  class Node ()
    extends typings.libxmljs.libxmljsMod.Node
  
  @js.native
  class SaxParser ()
    extends typings.libxmljs.libxmljsMod.SaxParser
  
  @js.native
  class SaxPushParser ()
    extends typings.libxmljs.libxmljsMod.SaxPushParser
  
}

