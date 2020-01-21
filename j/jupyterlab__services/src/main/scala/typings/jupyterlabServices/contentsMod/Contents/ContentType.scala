package typings.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contents file type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.notebook
  - typings.jupyterlabServices.jupyterlabServicesStrings.file
  - typings.jupyterlabServices.jupyterlabServicesStrings.directory
*/
trait ContentType extends js.Object

object ContentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typings.jupyterlabServices.jupyterlabServicesStrings.directory = this.cast("directory")
  @scala.inline
  def file: typings.jupyterlabServices.jupyterlabServicesStrings.file = this.cast("file")
  @scala.inline
  def notebook: typings.jupyterlabServices.jupyterlabServicesStrings.notebook = this.cast("notebook")
}

