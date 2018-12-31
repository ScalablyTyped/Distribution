package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptionsCache
  extends catboxLib.catboxMod.PolicyOptions[js.Any]
     with /** other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object). */
/* s */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** a class, a prototype function, or a catbox engine object. */
  var engine: js.UndefOr[catboxLib.catboxMod.EnginePrototypeOrObject] = js.undefined
  /**
    * an identifier used later when provisioning or configuring caching for server methods or plugins. Each cache name must be unique. A single item may omit the name option which defines
    * the default cache. If every cache includes a name, a default memory cache is provisioned as well.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** (optional) string used to isolate cached data. Defaults to 'hapi-cache'. */
  var partition: js.UndefOr[java.lang.String] = js.undefined
  /** if true, allows multiple cache users to share the same segment (e.g. multiple methods using the same cache storage container). Default to false. */
  var shared: js.UndefOr[scala.Boolean] = js.undefined
}

