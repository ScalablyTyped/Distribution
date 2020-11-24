package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ionicCliFramework.definitionsMod.TextFootnote
  - typings.ionicCliFramework.definitionsMod.LinkFootnote
*/
trait Footnote extends js.Object
object Footnote {
  
  @scala.inline
  def TextFootnote(id: String | Double, text: String): Footnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnote]
  }
  
  @scala.inline
  def LinkFootnote(id: String | Double, url: String): Footnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnote]
  }
}
