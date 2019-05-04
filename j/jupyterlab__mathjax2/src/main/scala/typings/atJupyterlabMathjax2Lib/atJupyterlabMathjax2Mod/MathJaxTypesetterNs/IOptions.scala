package typings
package atJupyterlabMathjax2Lib.atJupyterlabMathjax2Mod.MathJaxTypesetterNs

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
  var config: java.lang.String
  /**
    * The url to load MathJax from.
    */
  var url: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(config: java.lang.String, url: java.lang.String): IOptions = {
    val __obj = js.Dynamic.literal(config = config, url = url)
  
    __obj.asInstanceOf[IOptions]
  }
}

