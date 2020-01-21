package typings.keystonejsAdapterKnex.mod

import typings.keystonejsKeystone.mod.BaseKeystoneAdapter
import typings.knex.mod.Raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/adapter-knex", "KnexAdapter")
@js.native
class KnexAdapter () extends BaseKeystoneAdapter {
  def this(options: KnexAdaptorOptions) = this()
  def disconnect(): Unit = js.native
  def dropDatabase(): js.Promise[Raw[_]] = js.native
}

