package typings.koDotPlus.KoPlus

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editable[T]
  extends KnockoutObservable[T]
     with EditableFunctions

