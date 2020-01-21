package typings.keystonejsAdapterMongoose.mod

import typings.keystonejsKeystone.mod.BaseKeystoneAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/adapter-mongoose", "MongooseAdapter")
@js.native
class MongooseAdapter () extends BaseKeystoneAdapter {
  def this(options: MongooseAdaptorOptions) = this()
  def disconnect(): Unit = js.native
  def dropDatabase(): js.Any = js.native
}

