package typings.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextChange {
  
  @JSImport("grammarkdown", "TextChange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyChange(originalText: String, change: typings.grammarkdown.distParserMod.TextChange): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChange")(originalText.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def clone_(change: typings.grammarkdown.distParserMod.TextChange): typings.grammarkdown.anon.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(change.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.anon.Range]
  
  inline def create(text: String, range: typings.grammarkdown.distTypesMod.Range): typings.grammarkdown.anon.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.anon.Range]
  
  inline def isUnchanged(change: typings.grammarkdown.distParserMod.TextChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnchanged")(change.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
