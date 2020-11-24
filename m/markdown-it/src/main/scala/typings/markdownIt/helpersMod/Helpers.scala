package typings.markdownIt.helpersMod

import typings.markdownIt.parseLinkDestinationMod.ParseResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Helpers extends js.Object {
  
  def parseLinkDestination(str: String, pos: Double, max: Double): ParseResult = js.native
  @JSName("parseLinkDestination")
  var parseLinkDestination_Original: js.Function3[/* str */ String, /* pos */ Double, /* max */ Double, ParseResult] = js.native
  
  def parseLinkLabel(state: typings.markdownIt.stateInlineMod.^, start: Double): Double = js.native
  def parseLinkLabel(state: typings.markdownIt.stateInlineMod.^, start: Double, disableNested: Boolean): Double = js.native
  @JSName("parseLinkLabel")
  var parseLinkLabel_Original: js.Function3[
    /* state */ typings.markdownIt.stateInlineMod.^, 
    /* start */ Double, 
    /* disableNested */ js.UndefOr[Boolean], 
    Double
  ] = js.native
  
  def parseLinkTitle(str: String, pos: Double, max: Double): ParseResult = js.native
  @JSName("parseLinkTitle")
  var parseLinkTitle_Original: js.Function3[/* str */ String, /* pos */ Double, /* max */ Double, ParseResult] = js.native
}
