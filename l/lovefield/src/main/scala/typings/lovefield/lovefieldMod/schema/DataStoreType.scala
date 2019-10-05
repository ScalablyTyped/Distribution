package typings.lovefield.lovefieldMod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataStoreType extends js.Object

@JSImport("lovefield", "schema.DataStoreType")
@js.native
object DataStoreType extends js.Object {
  @js.native
  sealed trait FIREBASE extends DataStoreType
  
  @js.native
  sealed trait INDEXED_DB extends DataStoreType
  
  @js.native
  sealed trait LOCAL_STORAGE extends DataStoreType
  
  @js.native
  sealed trait MEMORY extends DataStoreType
  
  @js.native
  sealed trait WEB_SQL extends DataStoreType
  
  /* 3 */ val FIREBASE: typings.lovefield.lovefieldMod.schema.DataStoreType.FIREBASE with Double = js.native
  /* 0 */ val INDEXED_DB: typings.lovefield.lovefieldMod.schema.DataStoreType.INDEXED_DB with Double = js.native
  /* 2 */ val LOCAL_STORAGE: typings.lovefield.lovefieldMod.schema.DataStoreType.LOCAL_STORAGE with Double = js.native
  /* 1 */ val MEMORY: typings.lovefield.lovefieldMod.schema.DataStoreType.MEMORY with Double = js.native
  /* 4 */ val WEB_SQL: typings.lovefield.lovefieldMod.schema.DataStoreType.WEB_SQL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataStoreType with Double] = js.native
}

