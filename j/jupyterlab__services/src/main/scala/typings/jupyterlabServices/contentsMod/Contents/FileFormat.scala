package typings.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contents file format.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.json
  - typings.jupyterlabServices.jupyterlabServicesStrings.text
  - typings.jupyterlabServices.jupyterlabServicesStrings.base64
*/
trait FileFormat extends js.Object

object FileFormat {
  @scala.inline
  def base64: typings.jupyterlabServices.jupyterlabServicesStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typings.jupyterlabServices.jupyterlabServicesStrings.json = this.cast("json")
  @scala.inline
  def text: typings.jupyterlabServices.jupyterlabServicesStrings.text = this.cast("text")
}

