package typings.itConcat

import typings.bl.mod.^
import typings.itConcat.anon.Type
import typings.itConcat.anon.`0`
import typings.node.Buffer
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-concat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(source: AsyncIterable[Buffer | String | ^ ]): js.Promise[^] = js.native
  def apply(source: AsyncIterable[Buffer | String | ^ ], options: Type): js.Promise[String] = js.native
  def apply(source: AsyncIterable[Buffer | ^ ], options: `0`): js.Promise[^] = js.native
}
