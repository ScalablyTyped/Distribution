package typings.httpLinkHeader.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parse & format HTTP link headers according to RFC 8288
  */
@JSImport("http-link-header", JSImport.Namespace)
@js.native
/**
  * Link
  * @param value Link header to parse
  */
class ^ () extends Link {
  def this(value: String) = this()
}
@JSImport("http-link-header", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def escapeQuotes(value: String): String = js.native
  
  /**
    * Format a given attribute and it's value
    */
  def formatAttribute(attr: String, value: String): String = js.native
  def formatAttribute(attr: String, value: js.Array[String | Buffer]): String = js.native
  def formatAttribute(attr: String, value: Buffer): String = js.native
  
  def formatExtendedAttribute(attr: String, data: LinkData): String = js.native
  
  /**
    * Determines whether an encoding can be
    * natively handled with a `Buffer`
    */
  def isCompatibleEncoding(value: String): Boolean = js.native
  
  def isSingleOccurenceAttr(attr: String): Boolean = js.native
  
  def isTokenAttr(attr: String): Boolean = js.native
  
  /**
    * Creates a new Link by parsing a link header beginning at the provided
    * offset
    * @param value The header to parse
    * @param offset The offset to start at. Defaults to 0.
    * @return A new Link
    */
  def parse(value: String): Link = js.native
  def parse(value: String, offset: Double): Link = js.native
}
