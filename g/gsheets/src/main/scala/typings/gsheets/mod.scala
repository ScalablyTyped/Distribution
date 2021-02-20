package typings.gsheets

import org.scalablytyped.runtime.StringDictionary
import typings.gsheets.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gsheets", "getSpreadsheet")
  @js.native
  def getSpreadsheet(spreadsheetId: String): js.Promise[Spreadsheet] = js.native
  
  @JSImport("gsheets", "getWorksheet")
  @js.native
  def getWorksheet(spreadsheetId: String, worksheetTitle: String): js.Promise[Worksheet] = js.native
  
  @JSImport("gsheets", "getWorksheetById")
  @js.native
  def getWorksheetById(spreadsheetId: String, worksheetId: String): js.Promise[WorksheetFromId] = js.native
  
  type Row = StringDictionary[String | Double | Null]
  
  @js.native
  trait Spreadsheet extends StObject {
    
    var title: String = js.native
    
    var updated: String = js.native
    
    var worksheets: js.Array[Id] = js.native
  }
  object Spreadsheet {
    
    @scala.inline
    def apply(title: String, updated: String, worksheets: js.Array[Id]): Spreadsheet = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], worksheets = worksheets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spreadsheet]
    }
    
    @scala.inline
    implicit class SpreadsheetMutableBuilder[Self <: Spreadsheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorksheets(value: js.Array[Id]): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorksheetsVarargs(value: Id*): Self = StObject.set(x, "worksheets", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Worksheet extends StObject {
    
    var data: js.Array[Row] | Null = js.native
    
    var title: String = js.native
    
    var updated: String = js.native
  }
  object Worksheet {
    
    @scala.inline
    def apply(title: String, updated: String): Worksheet = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Worksheet]
    }
    
    @scala.inline
    implicit class WorksheetMutableBuilder[Self <: Worksheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Row]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDataVarargs(value: Row*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorksheetFromId extends Worksheet {
    
    @JSName("data")
    var data_WorksheetFromId: js.Array[Row] = js.native
  }
  object WorksheetFromId {
    
    @scala.inline
    def apply(data: js.Array[Row], title: String, updated: String): WorksheetFromId = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorksheetFromId]
    }
    
    @scala.inline
    implicit class WorksheetFromIdMutableBuilder[Self <: WorksheetFromId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Row]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Row*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
}
