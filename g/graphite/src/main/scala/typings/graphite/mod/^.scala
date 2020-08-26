package typings.graphite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphite", JSImport.Namespace)
@js.native
class ^ protected () extends GraphiteClient {
  def this(properties: GraphiteClientProperties) = this()
}

@JSImport("graphite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def appendTags(flatMetrics: js.Any, tags: js.Any): js.Any = js.native
  def createClient(dsn: String): GraphiteClient = js.native
  def flatten(`object`: js.Any): js.Any = js.native
  def flatten(`object`: js.Any, flat: js.UndefOr[scala.Nothing], prefix: String): js.Any = js.native
  def flatten(`object`: js.Any, flat: js.Any): js.Any = js.native
  def flatten(`object`: js.Any, flat: js.Any, prefix: String): js.Any = js.native
}

