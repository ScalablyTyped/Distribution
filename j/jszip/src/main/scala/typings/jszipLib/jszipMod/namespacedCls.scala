package typings
package jszipLib.jszipMod

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
class namespacedCls () extends JSZip {
  def this(data: jszipLib.InputFileFormat) = this()
  def this(data: jszipLib.InputFileFormat, options: jszipLib.jszipMod.JSZipNs.JSZipLoadOptions) = this()
}

