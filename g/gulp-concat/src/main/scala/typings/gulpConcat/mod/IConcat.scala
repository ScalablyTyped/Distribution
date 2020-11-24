package typings.gulpConcat.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConcat extends js.Object {
  
  def apply(filename: String): ReadWriteStream = js.native
  def apply(filename: String, options: IOptions): ReadWriteStream = js.native
  def apply(options: IVinylOptions): ReadWriteStream = js.native
}
