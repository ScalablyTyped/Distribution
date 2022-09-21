package typings.gsheetdb

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.gsheetdb.anon.RowNb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gsheetdb", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.gsheetdb.mod.gsheetdb {
    def this(parameters: GSheetDBParameters) = this()
  }
  
  trait GSheetDBParameters extends StObject {
    
    var credentialsJSON: js.Object
    
    var sheetName: String
    
    var spreadsheetId: String
  }
  object GSheetDBParameters {
    
    inline def apply(credentialsJSON: js.Object, sheetName: String, spreadsheetId: String): GSheetDBParameters = {
      val __obj = js.Dynamic.literal(credentialsJSON = credentialsJSON.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any], spreadsheetId = spreadsheetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GSheetDBParameters]
    }
    
    extension [Self <: GSheetDBParameters](x: Self) {
      
      inline def setCredentialsJSON(value: js.Object): Self = StObject.set(x, "credentialsJSON", value.asInstanceOf[js.Any])
      
      inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
      
      inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    }
  }
  
  type Row = js.Array[Boolean | String | Double | Null]
  
  type SheetData = js.Array[RowNb]
  
  @js.native
  trait gsheetdb extends StObject {
    
    var client: js.UndefOr[JWT | UserRefreshClient] = js.native
    
    def connect(): js.Promise[Unit] = js.native
    
    var credentialsJSON: js.Object = js.native
    
    def getData(): js.Promise[SheetData] = js.native
    def getData(dataRange: String): js.Promise[SheetData] = js.native
    
    var headerRow: Row = js.native
    
    def insertRows(rows: js.Array[Row]): js.Promise[Unit] = js.native
    
    var sheetName: String = js.native
    
    var spreadsheetId: String = js.native
    
    def updateRow(rowNumber: Double, rowArray: Row): js.Promise[Unit] = js.native
  }
}
