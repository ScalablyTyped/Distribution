package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// module query
object raw {
  
  @js.native
  trait BackStore extends StObject {
    
    def addTableColumn(tableName: String, columnName: String, defaultValue: String): js.Promise[Unit] = js.native
    def addTableColumn(tableName: String, columnName: String, defaultValue: js.Date): js.Promise[Unit] = js.native
    def addTableColumn(tableName: String, columnName: String, defaultValue: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
    def addTableColumn(tableName: String, columnName: String, defaultValue: Boolean): js.Promise[Unit] = js.native
    def addTableColumn(tableName: String, columnName: String, defaultValue: Double): js.Promise[Unit] = js.native
    
    def createRow(payload: js.Object): Row = js.native
    
    def dropTable(tableName: String): js.Promise[Unit] = js.native
    
    def dropTableColumn(tableName: String, columnName: String): js.Promise[Unit] = js.native
    
    def dump(): js.Array[js.Object] = js.native
    
    def getRawDBInstance(): Any = js.native
    
    def getRawTransaction(): Any = js.native
    
    def getVersion(): Double = js.native
    
    def renameTableColumn(tableName: String, oldColumnName: String, newColumnName: String): js.Promise[Unit] = js.native
  }
}
