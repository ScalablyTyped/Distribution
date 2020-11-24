package typings.gulpMocha

import typings.mocha.Mocha.MochaOptions
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-mocha", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): ReadWriteStream = js.native
  def apply(setupOptions: MochaOptions): ReadWriteStream = js.native
}
