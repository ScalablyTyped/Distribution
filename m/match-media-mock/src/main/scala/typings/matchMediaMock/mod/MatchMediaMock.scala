package typings.matchMediaMock.mod

import typings.std.MediaQueryList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchMediaMock extends js.Object {
  
  /**
    * Execute query based on provided configuration
    */
  def apply(query: String): MediaQueryList = js.native
  
  /**
    * Set configuration
    */
  def setConfig(config: ConfigOptions): Unit = js.native
}
