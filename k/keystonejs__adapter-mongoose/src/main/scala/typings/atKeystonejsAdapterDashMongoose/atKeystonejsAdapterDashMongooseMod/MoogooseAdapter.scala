package typings.atKeystonejsAdapterDashMongoose.atKeystonejsAdapterDashMongooseMod

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseKeystoneAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/adapter-mongoose", "MoogooseAdapter")
@js.native
class MoogooseAdapter () extends BaseKeystoneAdapter {
  def this(options: MongooseAdaptorOptions) = this()
  def disconnect(): Unit = js.native
  def dropDatabase(): js.Any = js.native
}

