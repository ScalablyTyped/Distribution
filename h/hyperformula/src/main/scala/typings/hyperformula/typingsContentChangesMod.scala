package typings.hyperformula

import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsContentChangesMod {
  
  @JSImport("hyperformula/typings/ContentChanges", "ContentChanges")
  @js.native
  open class ContentChanges () extends StObject {
    
    /* private */ var add: Any = js.native
    
    def addAll(other: ContentChanges): ContentChanges = js.native
    
    def addChange(newValue: InterpreterValue, address: SimpleCellAddress_): Unit = js.native
    def addChange(newValue: InterpreterValue, address: SimpleCellAddress_, oldValue: InterpreterValue): Unit = js.native
    
    /* private */ var addInterpreterValue: Any = js.native
    
    /* private */ var changes: Any = js.native
    
    def exportChanges[T](exporter: ChangeExporter[T]): js.Array[T] = js.native
    
    def getChanges(): ChangeList = js.native
    
    def isEmpty(): Boolean = js.native
  }
  /* static members */
  object ContentChanges {
    
    @JSImport("hyperformula/typings/ContentChanges", "ContentChanges")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): ContentChanges = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[ContentChanges]
  }
  
  trait CellValueChange extends StObject {
    
    var address: SimpleCellAddress_
    
    var oldValue: js.UndefOr[InterpreterValue] = js.undefined
    
    var value: InterpreterValue
  }
  object CellValueChange {
    
    inline def apply(address: SimpleCellAddress_, value: InterpreterValue): CellValueChange = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellValueChange]
    }
    
    extension [Self <: CellValueChange](x: Self) {
      
      inline def setAddress(value: SimpleCellAddress_): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: InterpreterValue): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setValue(value: InterpreterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangeExporter[T] extends StObject {
    
    def exportChange(arg: CellValueChange): T | js.Array[T]
  }
  object ChangeExporter {
    
    inline def apply[T](exportChange: CellValueChange => T | js.Array[T]): ChangeExporter[T] = {
      val __obj = js.Dynamic.literal(exportChange = js.Any.fromFunction1(exportChange))
      __obj.asInstanceOf[ChangeExporter[T]]
    }
    
    extension [Self <: ChangeExporter[?], T](x: Self & ChangeExporter[T]) {
      
      inline def setExportChange(value: CellValueChange => T | js.Array[T]): Self = StObject.set(x, "exportChange", js.Any.fromFunction1(value))
    }
  }
  
  type ChangeList = js.Array[CellValueChange]
}
