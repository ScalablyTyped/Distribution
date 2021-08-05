package typings.grammarkdown.mod

import typings.grammarkdown.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextChange {
  
  @JSImport("grammarkdown", "TextChange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyChange(originalText: String, change: typings.grammarkdown.parserMod.TextChange): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChange")(originalText.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def clone_(change: typings.grammarkdown.parserMod.TextChange): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(change.asInstanceOf[js.Any]).asInstanceOf[Text]
  
  inline def create(text: String, range: typings.grammarkdown.typesMod.Range): Text = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Text]
  
  inline def isUnchanged(change: typings.grammarkdown.parserMod.TextChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnchanged")(change.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
