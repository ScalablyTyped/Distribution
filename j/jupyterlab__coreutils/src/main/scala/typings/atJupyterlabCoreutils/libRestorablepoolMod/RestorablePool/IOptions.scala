package typings.atJupyterlabCoreutils.libRestorablepoolMod.RestorablePool

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
  var namespace: String
}

object IOptions {
  @scala.inline
  def apply(namespace: String): IOptions = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

