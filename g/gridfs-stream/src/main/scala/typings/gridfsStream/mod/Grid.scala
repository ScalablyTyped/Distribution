package typings.gridfsStream.mod

import typings.gridfsStream.mod.GridFSStream.Options
import typings.gridfsStream.mod.GridFSStream.ReadStream
import typings.gridfsStream.mod.GridFSStream.WriteStream
import typings.mongodb.mod.Collection
import typings.mongodb.mod.DefaultSchema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gridfs-stream", "Grid")
@js.native
class Grid () extends js.Object {
  var curCol: String = js.native
  var files: Collection[DefaultSchema] = js.native
  def collection(): Collection[DefaultSchema] = js.native
  def collection(name: String): Collection[DefaultSchema] = js.native
  def createReadStream(): ReadStream = js.native
  def createReadStream(options: String): ReadStream = js.native
  def createReadStream(options: Options): ReadStream = js.native
  def createWriteStream(): WriteStream = js.native
  def createWriteStream(options: String): WriteStream = js.native
  def createWriteStream(options: Options): WriteStream = js.native
  def exist(options: Options, callback: js.Function2[/* err */ Error, /* found */ Boolean, Unit]): Unit = js.native
  def findOne(options: Options, callback: js.Function2[/* err */ Error, /* record */ js.Any, Unit]): Unit = js.native
  def remove(options: Options, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

