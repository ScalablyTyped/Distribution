package typings.jpm.contextMenuMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemContext extends Array[Context] {
  
  // a list of Context that also has add, remove methods
  def add(context: Context): Unit = js.native
  
  def remove(context: Context): Unit = js.native
}
