package typings
package atJupyterlabCoreutilsLib.libRestorablepoolMod.RestorablePoolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for the restorable pool.
  */
trait IOptions extends js.Object {
  /**
    * A namespace designating objects from this pool.
    */
  var namespace: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(namespace: java.lang.String): IOptions = {
    val __obj = js.Dynamic.literal(namespace = namespace)
  
    __obj.asInstanceOf[IOptions]
  }
}

