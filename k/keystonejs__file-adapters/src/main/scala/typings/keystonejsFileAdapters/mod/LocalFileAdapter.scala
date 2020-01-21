package typings.keystonejsFileAdapters.mod

import typings.keystonejsFileAdapters.AnonFilename
import typings.keystonejsFileAdapters.AnonFilenameId
import typings.keystonejsFileAdapters.AnonFilenameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/file-adapters", "LocalFileAdapter")
@js.native
class LocalFileAdapter protected () extends js.Object {
  def this(options: LocalFileAdapterConfig) = this()
  def publicUrl(params: AnonFilenameString): String = js.native
  def save(params: AnonFilename): js.Promise[AnonFilenameId] = js.native
}

