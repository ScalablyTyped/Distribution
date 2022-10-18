package typings.grammarkdown.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "StringAsyncHost")
@js.native
open class StringAsyncHost protected ()
  extends typings.grammarkdown.distHostMod.StringAsyncHost {
  def this(file: String, content: String) = this()
  /**
    * @param file The file name for the content.
    * @param content The content of the file.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(file: String, content: PromiseLike[String]) = this()
  def this(file: String, content: String, hostFallback: typings.grammarkdown.distHostMod.CoreAsyncHost) = this()
  def this(
    file: String,
    content: PromiseLike[String],
    hostFallback: typings.grammarkdown.distHostMod.CoreAsyncHost
  ) = this()
}
