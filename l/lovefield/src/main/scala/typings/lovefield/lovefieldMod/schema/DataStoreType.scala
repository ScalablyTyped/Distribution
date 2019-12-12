package typings.lovefield.lovefieldMod.schema

import org.scalablytyped.runtime.TopLevel
import typings.lovefield.lovefieldMod.schema.DataStoreType.FIREBASE
import typings.lovefield.lovefieldMod.schema.DataStoreType.INDEXED_DB
import typings.lovefield.lovefieldMod.schema.DataStoreType.LOCAL_STORAGE
import typings.lovefield.lovefieldMod.schema.DataStoreType.MEMORY
import typings.lovefield.lovefieldMod.schema.DataStoreType.WEB_SQL
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataStoreType with Double] = js.native
  /* 3 */ @js.native
  object FIREBASE extends TopLevel[FIREBASE with Double]
  
  /* 0 */ @js.native
  object INDEXED_DB extends TopLevel[INDEXED_DB with Double]
  
  /* 2 */ @js.native
  object LOCAL_STORAGE extends TopLevel[LOCAL_STORAGE with Double]
  
  /* 1 */ @js.native
  object MEMORY extends TopLevel[MEMORY with Double]
  
  /* 4 */ @js.native
  object WEB_SQL extends TopLevel[WEB_SQL with Double]
  
}

