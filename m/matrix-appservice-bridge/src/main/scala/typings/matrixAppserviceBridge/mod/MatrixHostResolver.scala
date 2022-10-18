package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Axios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "MatrixHostResolver")
@js.native
open class MatrixHostResolver ()
  extends typings.matrixAppserviceBridge.libUtilsMatrixHostResolverMod.MatrixHostResolver {
  def this(opts: Axios) = this()
}
/* static members */
object MatrixHostResolver {
  
  @JSImport("matrix-appservice-bridge", "MatrixHostResolver")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-appservice-bridge", "MatrixHostResolver.determineHostType")
  @js.native
  def determineHostType: Any = js.native
  inline def determineHostType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("determineHostType")(x.asInstanceOf[js.Any])
  
  @JSImport("matrix-appservice-bridge", "MatrixHostResolver.sortSrvRecords")
  @js.native
  def sortSrvRecords: Any = js.native
  inline def sortSrvRecords_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortSrvRecords")(x.asInstanceOf[js.Any])
}
