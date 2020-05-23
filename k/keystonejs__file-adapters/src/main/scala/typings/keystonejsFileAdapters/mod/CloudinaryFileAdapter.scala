package typings.keystonejsFileAdapters.mod

import typings.keystonejsFileAdapters.anon.Filename
import typings.keystonejsFileAdapters.anon.FilenameId
import typings.keystonejsFileAdapters.anon.FilenameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/file-adapters", "CloudinaryFileAdapter")
@js.native
class CloudinaryFileAdapter protected () extends js.Object {
  def this(options: CloudinaryFileAdapterConfig) = this()
  def publicUrl(params: FilenameString): String = js.native
  def save(params: Filename): js.Promise[FilenameId] = js.native
}

