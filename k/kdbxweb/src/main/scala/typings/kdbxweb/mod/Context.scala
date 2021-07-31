package typings.kdbxweb.mod

import typings.std.Date
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Context")
@js.native
class Context protected () extends StObject {
  def this(opts: Kdbx) = this()
  
  def setXmlDate(node: Node, dt: Date): Unit = js.native
}
