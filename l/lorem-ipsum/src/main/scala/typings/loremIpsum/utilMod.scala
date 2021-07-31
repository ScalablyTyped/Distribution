package typings.loremIpsum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("lorem-ipsum/types/src/bin/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def copyToClipboard(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyToClipboard")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def getCopyCommand(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCopyCommand")().asInstanceOf[String]
  @scala.inline
  def getCopyCommand(platform: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCopyCommand")(platform.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getPlatform(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatform")().asInstanceOf[String]
  
  @scala.inline
  def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  
  @scala.inline
  def isSupportedPlatform(platform: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedPlatform")(platform.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
