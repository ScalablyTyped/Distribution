package typings.gulpSort.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-sort", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /** Sort files in stream by path or any custom sort comparator */
  def apply(): ReadWriteStream = js.native
  def apply(comparator: IComparatorFunction): ReadWriteStream = js.native
  def apply(options: IOptions): ReadWriteStream = js.native
}
