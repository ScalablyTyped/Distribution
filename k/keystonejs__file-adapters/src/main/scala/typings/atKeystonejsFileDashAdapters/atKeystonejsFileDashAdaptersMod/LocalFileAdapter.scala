package typings.atKeystonejsFileDashAdapters.atKeystonejsFileDashAdaptersMod

import typings.atKeystonejsFileDashAdapters.Anon_Filename
import typings.atKeystonejsFileDashAdapters.Anon_FilenameId
import typings.atKeystonejsFileDashAdapters.Anon_FilenameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/file-adapters", "LocalFileAdapter")
@js.native
class LocalFileAdapter protected () extends js.Object {
  def this(options: LocalFileAdapterConfig) = this()
  def publicUrl(params: Anon_FilenameString): String = js.native
  def save(params: Anon_Filename): js.Promise[Anon_FilenameId] = js.native
}

