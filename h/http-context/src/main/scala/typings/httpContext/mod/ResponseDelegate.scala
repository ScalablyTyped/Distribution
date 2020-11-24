package typings.httpContext.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseDelegate extends js.Object {
  
  def append(field: String, `val`: String*): Unit = js.native
  def append(field: String, `val`: js.Array[String]): Unit = js.native
  
  def attachment(filename: String): Unit = js.native
  
  var body: js.Any = js.native
  
  var etag: String = js.native
  
  var headerSent: Boolean = js.native
  
  var lastModified: String | Date = js.native
  
  var length: Double = js.native
  
  var message: String = js.native
  
  def redirect(url: String, alt: String): Unit = js.native
  
  def remove(field: String): Unit = js.native
  
  def set(field: String, `val`: String): Unit = js.native
  
  var status: Double = js.native
  
  var `type`: String = js.native
  
  def vary(field: String): Unit = js.native
  
  var writable: Boolean = js.native
}
