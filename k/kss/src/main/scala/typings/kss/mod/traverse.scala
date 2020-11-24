package typings.kss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kss", "traverse")
@js.native
object traverse extends js.Object {
  
  /** Traverse a directory, parse its contents, and create a `KssStyleGuide`. */
  def apply(directory: String, options: Options): js.Promise[KssStyleguide] = js.native
  def apply(directory: js.Array[String], options: Options): js.Promise[KssStyleguide] = js.native
}
