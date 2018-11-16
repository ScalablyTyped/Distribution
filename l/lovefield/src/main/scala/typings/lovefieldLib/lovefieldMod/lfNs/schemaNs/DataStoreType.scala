package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataStoreType extends js.Object

@JSImport("lovefield/lf/schema", "DataStoreType")
@js.native
object DataStoreType extends js.Object {
  @js.native
  sealed trait FIREBASE
    extends lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType
  
  @js.native
  sealed trait INDEXED_DB
    extends lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType
  
  @js.native
  sealed trait LOCAL_STORAGE
    extends lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType
  
  @js.native
  sealed trait MEMORY
    extends lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType
  
  @js.native
  sealed trait WEB_SQL
    extends lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType
  
}

