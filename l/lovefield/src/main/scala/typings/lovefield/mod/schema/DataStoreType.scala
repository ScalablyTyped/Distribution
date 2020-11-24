package typings.lovefield.mod.schema

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataStoreType extends js.Object
@JSImport("lovefield", "schema.DataStoreType")
@js.native
object DataStoreType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataStoreType with Double] = js.native
  
  @js.native
  sealed trait FIREBASE extends DataStoreType
  /* 3 */ @js.native
  object FIREBASE extends TopLevel[FIREBASE with Double]
  
  @js.native
  sealed trait INDEXED_DB extends DataStoreType
  /* 0 */ @js.native
  object INDEXED_DB extends TopLevel[INDEXED_DB with Double]
  
  @js.native
  sealed trait LOCAL_STORAGE extends DataStoreType
  /* 2 */ @js.native
  object LOCAL_STORAGE extends TopLevel[LOCAL_STORAGE with Double]
  
  @js.native
  sealed trait MEMORY extends DataStoreType
  /* 1 */ @js.native
  object MEMORY extends TopLevel[MEMORY with Double]
  
  @js.native
  sealed trait WEB_SQL extends DataStoreType
  /* 4 */ @js.native
  object WEB_SQL extends TopLevel[WEB_SQL with Double]
}
