package typings.hotFormulaParser

import typings.hotFormulaParser.mod.Coordinate
import typings.hotFormulaParser.mod.FormulaErrorId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Coordinate
    
    var label: String
    
    var row: Coordinate
  }
  object Column {
    
    inline def apply(column: Coordinate, label: String, row: Coordinate): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Coordinate): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Coordinate): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: FormulaErrorId | Null
    
    var result: String | Double | Boolean | Null
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal(error = null, result = null)
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: FormulaErrorId): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setResult(value: String | Double | Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultNull: Self = StObject.set(x, "result", null)
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var isAbsolute: js.UndefOr[Boolean] = js.undefined
  }
  object Index {
    
    inline def apply(index: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsAbsolute(value: Boolean): Self = StObject.set(x, "isAbsolute", value.asInstanceOf[js.Any])
      
      inline def setIsAbsoluteUndefined: Self = StObject.set(x, "isAbsolute", js.undefined)
    }
  }
}
