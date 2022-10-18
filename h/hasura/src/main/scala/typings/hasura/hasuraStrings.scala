package typings.hasura

import typings.hasura.mod.ScalarOrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasuraStrings {
  
  @js.native
  sealed trait asc
    extends StObject
       with ScalarOrderBy
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait asc_nulls_first
    extends StObject
       with ScalarOrderBy
  inline def asc_nulls_first: asc_nulls_first = "asc_nulls_first".asInstanceOf[asc_nulls_first]
  
  @js.native
  sealed trait asc_nulls_last
    extends StObject
       with ScalarOrderBy
  inline def asc_nulls_last: asc_nulls_last = "asc_nulls_last".asInstanceOf[asc_nulls_last]
  
  @js.native
  sealed trait desc
    extends StObject
       with ScalarOrderBy
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait desc_nulls_first
    extends StObject
       with ScalarOrderBy
  inline def desc_nulls_first: desc_nulls_first = "desc_nulls_first".asInstanceOf[desc_nulls_first]
  
  @js.native
  sealed trait desc_nulls_last
    extends StObject
       with ScalarOrderBy
  inline def desc_nulls_last: desc_nulls_last = "desc_nulls_last".asInstanceOf[desc_nulls_last]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait jsonb extends StObject
  inline def jsonb: jsonb = "jsonb".asInstanceOf[jsonb]
  
  @js.native
  sealed trait uuid extends StObject
  inline def uuid: uuid = "uuid".asInstanceOf[uuid]
}
