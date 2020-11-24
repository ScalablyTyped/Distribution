package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends Box {
  
  var config: HexoConfig = js.native
  
  /**
    * Get a View
    */
  def getView(path: String): js.UndefOr[View] = js.native
  
  /**
    * Remove a View
    */
  def removeView(path: String): Unit = js.native
  
  /**
    * Set a View
    */
  def setView(path: String, data: js.Any): Unit = js.native
}
