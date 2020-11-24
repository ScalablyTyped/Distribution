package typings.grammarkdown.hostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/host", "StringAsyncHost")
@js.native
class StringAsyncHost protected () extends CoreAsyncHost {
  def this(file: String, content: String) = this()
  /**
    * @param file The file name for the content.
    * @param content The content of the file.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(file: String, content: js.Thenable[String]) = this()
  def this(file: String, content: String, hostFallback: CoreAsyncHost) = this()
  def this(file: String, content: String, hostFallback: CoreSyncHost) = this()
  def this(file: String, content: js.Thenable[String], hostFallback: CoreAsyncHost) = this()
  def this(file: String, content: js.Thenable[String], hostFallback: CoreSyncHost) = this()
  
  /**
    * The content of the file.
    */
  val content: js.Thenable[String] | String = js.native
  
  /**
    * The file name for the content.
    */
  val file: String = js.native
}
