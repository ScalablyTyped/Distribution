package typings.gsheets

import org.scalablytyped.runtime.StringDictionary
import typings.gsheets.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gsheets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSpreadsheet(spreadsheetId: String): js.Promise[Spreadsheet] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpreadsheet")(spreadsheetId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Spreadsheet]]
  
  inline def getWorksheet(spreadsheetId: String, worksheetTitle: String): js.Promise[Worksheet] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorksheet")(spreadsheetId.asInstanceOf[js.Any], worksheetTitle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Worksheet]]
  
  inline def getWorksheetById(spreadsheetId: String, worksheetId: String): js.Promise[WorksheetFromId] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorksheetById")(spreadsheetId.asInstanceOf[js.Any], worksheetId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WorksheetFromId]]
  
  type Row = StringDictionary[String | Double | Null]
  
  trait Spreadsheet extends StObject {
    
    var title: String
    
    var updated: String
    
    var worksheets: js.Array[Id]
  }
  object Spreadsheet {
    
    inline def apply(title: String, updated: String, worksheets: js.Array[Id]): Spreadsheet = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], worksheets = worksheets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spreadsheet]
    }
    
    extension [Self <: Spreadsheet](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setWorksheets(value: js.Array[Id]): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
      
      inline def setWorksheetsVarargs(value: Id*): Self = StObject.set(x, "worksheets", js.Array(value*))
    }
  }
  
  trait Worksheet extends StObject {
    
    var data: js.Array[Row] | Null
    
    var title: String
    
    var updated: String
  }
  object Worksheet {
    
    inline def apply(title: String, updated: String): Worksheet = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[Worksheet]
    }
    
    extension [Self <: Worksheet](x: Self) {
      
      inline def setData(value: js.Array[Row]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataVarargs(value: Row*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorksheetFromId
    extends StObject
       with Worksheet {
    
    @JSName("data")
    var data_WorksheetFromId: js.Array[Row]
  }
  object WorksheetFromId {
    
    inline def apply(data: js.Array[Row], title: String, updated: String): WorksheetFromId = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorksheetFromId]
    }
    
    extension [Self <: WorksheetFromId](x: Self) {
      
      inline def setData(value: js.Array[Row]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Row*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
}
