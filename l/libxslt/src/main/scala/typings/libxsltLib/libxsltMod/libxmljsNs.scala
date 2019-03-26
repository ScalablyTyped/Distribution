package typings
package libxsltLib.libxsltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt", "libxmljs")
@js.native
object libxmljsNs extends js.Object {
  @js.native
  class Attribute ()
    extends libxmljsLib.libxmljsMod.Attribute
  
  @js.native
  /**
    * Create a new XML Document
    * @param version XML document version, defaults to 1.0
    * @param encoding Encoding, defaults to utf8
    */
  class Document ()
    extends libxmljsLib.libxmljsMod.Document
  
  @js.native
  class Element protected ()
    extends libxmljsLib.libxmljsMod.Element {
    def this(doc: libxmljsLib.libxmljsMod.Document, name: java.lang.String) = this()
  }
  
  @js.native
  class Namespace ()
    extends libxmljsLib.libxmljsMod.Namespace
  
  @js.native
  class Node ()
    extends libxmljsLib.libxmljsMod.Node
  
  @js.native
  class SaxParser ()
    extends libxmljsLib.libxmljsMod.SaxParser
  
  @js.native
  class SaxPushParser ()
    extends libxmljsLib.libxmljsMod.SaxPushParser
  
}

