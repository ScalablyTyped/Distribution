package typings.grammarkdown.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "LinkReference")
@js.native
class LinkReference ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.LinkReference] {
  def this(text: String) = this()
  
  val text: js.UndefOr[String] = js.native
}
