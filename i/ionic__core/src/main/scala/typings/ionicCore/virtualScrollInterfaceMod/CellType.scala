package typings.ionicCore.virtualScrollInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicCore.ionicCoreStrings.item
  - typings.ionicCore.ionicCoreStrings.header
  - typings.ionicCore.ionicCoreStrings.footer
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def footer: typings.ionicCore.ionicCoreStrings.footer = this.cast("footer")
  @scala.inline
  def header: typings.ionicCore.ionicCoreStrings.header = this.cast("header")
  @scala.inline
  def item: typings.ionicCore.ionicCoreStrings.item = this.cast("item")
}

