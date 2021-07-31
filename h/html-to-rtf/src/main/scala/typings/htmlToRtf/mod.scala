package typings.htmlToRtf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-to-rtf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertHtmlToRtf(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHtmlToRtf")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def saveRtfInFile(path: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveRtfInFile")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
