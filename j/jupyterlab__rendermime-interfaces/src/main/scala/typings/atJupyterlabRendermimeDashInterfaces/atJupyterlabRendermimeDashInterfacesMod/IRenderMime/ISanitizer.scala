package typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that handles html sanitization.
  */
trait ISanitizer extends js.Object {
  /**
    * Sanitize an HTML string.
    */
  def sanitize(dirty: String): String
}

object ISanitizer {
  @scala.inline
  def apply(sanitize: String => String): ISanitizer = {
    val __obj = js.Dynamic.literal(sanitize = js.Any.fromFunction1(sanitize))
  
    __obj.asInstanceOf[ISanitizer]
  }
}

