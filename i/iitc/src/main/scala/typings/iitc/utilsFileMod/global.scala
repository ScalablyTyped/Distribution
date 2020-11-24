package typings.iitc.utilsFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def saveAs(data: js.Any, filename: String, dataType: String): Unit = js.native
  
  /**
    * Save data to file with given filename, using IITCm file chooser, or generic browser routine.
    * `dataType` can be set to filter IITCm file chooser filetypes.
    */
  def saveFile(data: String): Unit = js.native
  def saveFile(data: String, filename: js.UndefOr[scala.Nothing], dataType: String): Unit = js.native
  def saveFile(data: String, filename: String): Unit = js.native
  def saveFile(data: String, filename: String, dataType: String): Unit = js.native
}
