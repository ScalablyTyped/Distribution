package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalForageDriver
  extends LocalForageDbMethodsCore
     with LocalForageDriverMethodsOptional {
  
  var _driver: String = js.native
  
  def _initStorage(options: LocalForageOptions): Unit = js.native
  
  var _support: js.UndefOr[Boolean | LocalForageDriverSupportFunc] = js.native
}
