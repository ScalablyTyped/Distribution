package typings.gridfsDashStream.gridfsDashStreamMod

import typings.gridfsDashStream.gridfsDashStreamMod.GridFSStream.Options
import typings.gridfsDashStream.gridfsDashStreamMod.GridFSStream.ReadStream
import typings.gridfsDashStream.gridfsDashStreamMod.GridFSStream.WriteStream
import typings.mongodb.Default
import typings.mongodb.mongodbMod.Collection
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gridfs-stream", "Grid")
@js.native
class Grid () extends js.Object {
  var curCol: String = js.native
  var files: Collection[Default] = js.native
  def collection(): Collection[Default] = js.native
  def collection(name: String): Collection[Default] = js.native
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

