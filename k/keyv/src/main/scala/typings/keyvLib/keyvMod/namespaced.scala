package typings
package keyvLib.keyvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keyv", JSImport.Namespace)
@js.native
class namespaced () extends Keyv {
  /**
       * @param opts The options object is also passed through to the storage adapter. Check your storage adapter docs for any extra options.
       */
  def this(opts: KeyvOptions) = this()
  /**
       * @param uri The connection string URI.
       *
       * Merged into the options object as options.uri.
       * @param opts The options object is also passed through to the storage adapter. Check your storage adapter docs for any extra options.
       */
  def this(uri: java.lang.String) = this()
  /**
       * @param uri The connection string URI.
       *
       * Merged into the options object as options.uri.
       * @param opts The options object is also passed through to the storage adapter. Check your storage adapter docs for any extra options.
       */
  def this(uri: java.lang.String, opts: KeyvOptions) = this()
}

