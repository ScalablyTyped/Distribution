package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AsyncHost")
@js.native
class AsyncHost ()
  extends grammarkdownLib.distHostMod.AsyncHost {
  def this(hasReadFileWriteFileBaseOptions: grammarkdownLib.distHostMod.AsyncHostOptions) = this()
}

@JSImport("grammarkdown", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  def forFile(content: java.lang.String): grammarkdownLib.distHostMod.AsyncSingleFileHost = js.native
  def forFile(content: java.lang.String, file: java.lang.String): grammarkdownLib.distHostMod.AsyncSingleFileHost = js.native
  def forFile(
    content: java.lang.String,
    file: java.lang.String,
    hostFallback: grammarkdownLib.distHostMod.AsyncHost
  ): grammarkdownLib.distHostMod.AsyncSingleFileHost = js.native
}

