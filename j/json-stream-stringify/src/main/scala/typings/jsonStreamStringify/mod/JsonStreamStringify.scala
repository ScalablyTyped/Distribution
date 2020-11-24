package typings.jsonStreamStringify.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonStreamStringify extends Readable {
  
  def path(): js.Tuple2[String, Double] = js.native
  
  var stack: js.Array[String] = js.native
}
