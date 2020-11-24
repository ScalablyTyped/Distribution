package typings.listStream.mod

import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStream extends Duplex {
  
  def append(chunk: js.Any): Unit = js.native
  
  def duplicate(): ListStream = js.native
  
  def get(index: Double): js.Any = js.native
  
  var length: Double = js.native
}
