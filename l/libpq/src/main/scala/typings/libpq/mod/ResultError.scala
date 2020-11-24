package typings.libpq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultError extends js.Object {
  
  var constraintName: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var dataTypeName: js.UndefOr[String] = js.native
  
  var internalPosition: js.UndefOr[String] = js.native
  
  var internalQuery: js.UndefOr[String] = js.native
  
  var messageDetail: js.UndefOr[String] = js.native
  
  var messageHint: js.UndefOr[String] = js.native
  
  var messagePrimary: String = js.native
  
  var schemaName: js.UndefOr[String] = js.native
  
  var severity: String = js.native
  
  var sourceFile: String = js.native
  
  var sourceFunction: String = js.native
  
  var sourceLine: String = js.native
  
  var sqlState: String = js.native
  
  var statementPosition: js.UndefOr[String] = js.native
  
  var tableName: js.UndefOr[String] = js.native
}
object ResultError {
  
  @scala.inline
  def apply(
    messagePrimary: String,
    severity: String,
    sourceFile: String,
    sourceFunction: String,
    sourceLine: String,
    sqlState: String
  ): ResultError = {
    val __obj = js.Dynamic.literal(messagePrimary = messagePrimary.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceFunction = sourceFunction.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any], sqlState = sqlState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultError]
  }
  
  @scala.inline
  implicit class ResultErrorOps[Self <: ResultError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessagePrimary(value: String): Self = this.set("messagePrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFile(value: String): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFunction(value: String): Self = this.set("sourceFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLine(value: String): Self = this.set("sourceLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlState(value: String): Self = this.set("sqlState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintName(value: String): Self = this.set("constraintName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraintName: Self = this.set("constraintName", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDataTypeName(value: String): Self = this.set("dataTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTypeName: Self = this.set("dataTypeName", js.undefined)
    
    @scala.inline
    def setInternalPosition(value: String): Self = this.set("internalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalPosition: Self = this.set("internalPosition", js.undefined)
    
    @scala.inline
    def setInternalQuery(value: String): Self = this.set("internalQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalQuery: Self = this.set("internalQuery", js.undefined)
    
    @scala.inline
    def setMessageDetail(value: String): Self = this.set("messageDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDetail: Self = this.set("messageDetail", js.undefined)
    
    @scala.inline
    def setMessageHint(value: String): Self = this.set("messageHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageHint: Self = this.set("messageHint", js.undefined)
    
    @scala.inline
    def setSchemaName(value: String): Self = this.set("schemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("schemaName", js.undefined)
    
    @scala.inline
    def setStatementPosition(value: String): Self = this.set("statementPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementPosition: Self = this.set("statementPosition", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
}
