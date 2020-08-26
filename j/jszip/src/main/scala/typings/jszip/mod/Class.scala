package typings.jszip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jszip", JSImport.Namespace)
@js.native
/**
  * Create JSZip instance
  */
/**
  * Create JSZip instance
  * If no parameters given an empty zip archive will be created
  *
  * @param data Serialized zip archive
  * @param options Description of the serialized zip archive
  */
class Class () extends JSZip {
  def this(data: InputFileFormat) = this()
  def this(data: js.UndefOr[InputFileFormat], options: JSZipLoadOptions) = this()
}

