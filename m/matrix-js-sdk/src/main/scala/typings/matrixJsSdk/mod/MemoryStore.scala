package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.LocalStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "MemoryStore")
@js.native
open class MemoryStore ()
  extends StObject
     with MatrixStore {
  def this(opts: LocalStorage) = this()
  
  var localStorage: js.UndefOr[Any] = js.native
}
