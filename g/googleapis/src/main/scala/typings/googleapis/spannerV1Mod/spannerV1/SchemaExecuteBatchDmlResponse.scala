package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for ExecuteBatchDml. Contains a list of ResultSet, one for
  * each DML statement that has successfully executed. If a statement fails,
  * the error is returned as part of the response payload. Clients can
  * determine whether all DML statements have run successfully, or if a
  * statement failed, using one of the following approaches:    1. Check if
  * &#39;status&#39; field is OkStatus.   2. Check if result_sets_size() equals
  * the number of statements in      ExecuteBatchDmlRequest.  Example 1: A
  * request with 5 DML statements, all executed successfully. Result: A
  * response with 5 ResultSets, one for each statement in the same order, and
  * an OK status.  Example 2: A request with 5 DML statements. The 3rd
  * statement has a syntax error. Result: A response with 2 ResultSets, for the
  * first 2 statements that run successfully, and a syntax error
  * (INVALID_ARGUMENT) status. From result_set_size() client can determine that
  * the 3rd statement has failed.
  */
trait SchemaExecuteBatchDmlResponse extends StObject {
  
  /**
    * ResultSets, one for each statement in the request that ran successfully,
    * in the same order as the statements in the request. Each ResultSet will
    * not contain any rows. The ResultSetStats in each ResultSet will contain
    * the number of rows modified by the statement.  Only the first ResultSet
    * in the response contains a valid ResultSetMetadata.
    */
  var resultSets: js.UndefOr[js.Array[SchemaResultSet]] = js.undefined
  
  /**
    * If all DML statements are executed successfully, status will be OK.
    * Otherwise, the error status of the first failed statement.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaExecuteBatchDmlResponse {
  
  @scala.inline
  def apply(): SchemaExecuteBatchDmlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteBatchDmlResponse]
  }
  
  @scala.inline
  implicit class SchemaExecuteBatchDmlResponseMutableBuilder[Self <: SchemaExecuteBatchDmlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultSets(value: js.Array[SchemaResultSet]): Self = StObject.set(x, "resultSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetsUndefined: Self = StObject.set(x, "resultSets", js.undefined)
    
    @scala.inline
    def setResultSetsVarargs(value: SchemaResultSet*): Self = StObject.set(x, "resultSets", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
