package typings.localforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalForageDriver
  extends StObject
     with LocalForageDriverDbMethods {
  
  var _driver: String = js.native
  
  def _initStorage(options: LocalForageOptions): Unit = js.native
  
  var _support: js.UndefOr[Boolean | LocalForageDriverSupportFunc] = js.native
}
