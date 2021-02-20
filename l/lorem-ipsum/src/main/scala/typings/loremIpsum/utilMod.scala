package typings.loremIpsum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("lorem-ipsum/types/src/bin/util", "copyToClipboard")
  @js.native
  def copyToClipboard(text: String): js.Promise[String] = js.native
  
  @JSImport("lorem-ipsum/types/src/bin/util", "getCopyCommand")
  @js.native
  def getCopyCommand(): String = js.native
  @JSImport("lorem-ipsum/types/src/bin/util", "getCopyCommand")
  @js.native
  def getCopyCommand(platform: String): String = js.native
  
  @JSImport("lorem-ipsum/types/src/bin/util", "getPlatform")
  @js.native
  def getPlatform(): String = js.native
  
  @JSImport("lorem-ipsum/types/src/bin/util", "getVersion")
  @js.native
  def getVersion(): String = js.native
  
  @JSImport("lorem-ipsum/types/src/bin/util", "isSupportedPlatform")
  @js.native
  def isSupportedPlatform(platform: String): Boolean = js.native
}
