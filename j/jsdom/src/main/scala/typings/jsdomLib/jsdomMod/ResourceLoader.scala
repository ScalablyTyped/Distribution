package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "ResourceLoader")
@js.native
class ResourceLoader () extends js.Object {
  def this(obj: ResourceLoaderConstructorOptions) = this()
  def fetch(url: java.lang.String, options: FetchOptions): stdLib.Promise[nodeLib.Buffer] | scala.Null = js.native
}

