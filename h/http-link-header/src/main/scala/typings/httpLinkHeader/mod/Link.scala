package typings.httpLinkHeader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parse & format HTTP link headers according to RFC 8288
  */
@js.native
trait Link extends js.Object {
  
  /**
    * Get refs where the given attribute has a given value
    * @param attribute Attribute name
    * @param value Value to match
    * @return An array of references
    */
  def get(attribute: String, value: String): js.Array[Reference] = js.native
  
  def has(attribute: String, value: String): Boolean = js.native
  
  /**
    * Parse a link header beginning at the provided offset
    * @param value The header to parse
    * @param offset The offset to start at. Defaults to 0.
    * @return The calling instance
    */
  def parse(value: String): Link = js.native
  def parse(value: String, offset: Double): Link = js.native
  
  var refs: js.Array[Reference] = js.native
  
  /**
    * Get refs with given relation type
    * @param value The rel value
    * @return An array of references
    */
  def rel(value: String): js.Array[Reference] = js.native
  
  def set(ref: Reference): Link = js.native
}
