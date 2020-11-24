package typings.iitc.portalHighlighterMod.global

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object ^ extends js.Object {
  
  /** the name of the current highlighter */
  @JSName("_current_highlighter")
  var currentHighlighter: String = js.native
  
  /** an object mapping highlighter names to the object containing callback functions */
  @JSName("_highlighters")
  var highlighters: StringDictionary[Hightligher] | Null = js.native
  
  /**
    * = "No Highlights"
    */
  @JSName("_no_highlighter")
  var noHighlighter: String = js.native
}
