package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// module raw
@JSImport("lovefield", "schema")
@js.native
object schemaNs extends js.Object {
  def create(dbName: java.lang.String, dbVersion: scala.Double): lovefieldLib.lovefieldMod.lfNs.schemaNs.Builder = js.native
  @js.native
  object DataStoreType extends js.Object {
    val FIREBASE: lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType.FIREBASE with java.lang.String = js.native
    val INDEXED_DB: lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType.INDEXED_DB with java.lang.String = js.native
    val LOCAL_STORAGE: lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType.LOCAL_STORAGE with java.lang.String = js.native
    val MEMORY: lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType.MEMORY with java.lang.String = js.native
    val WEB_SQL: lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType.WEB_SQL with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType with java.lang.String] = js.native
  }
  
  type DataStoreType = lovefieldLib.lovefieldMod.lfNs.schemaNs.DataStoreType
}

