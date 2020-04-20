package typings.jupyterlabMathjax2.mod.MathJaxTypesetter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MathJaxTypesetter constructor options.
  */
trait IOptions extends js.Object {
  /**
    * A configuration string to compose into the MathJax URL.
    */
  var config: String
  /**
    * The url to load MathJax from.
    */
  var url: String
}

object IOptions {
  @scala.inline
  def apply(config: String, url: String): IOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

