package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageDriver
  extends LocalForageDbMethodsCore
     with LocalForageDriverMethodsOptional {
  var _driver: String = js.native
  var _support: js.UndefOr[Boolean | LocalForageDriverSupportFunc] = js.native
  def _initStorage(options: LocalForageOptions): Unit = js.native
}

