package typings.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait FilterOptions extends StObject {
  
  /**
    * To return only resources that have CreationDate AFTER this date
    */
  var AfterDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  var BeforeDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The column to sort against and direction - only CreationDate (or Date for the events) is available and ASC or DESC for the direction
    */
  var Sort: js.UndefOr[ColumnAndDirection] = js.undefined
}
object FilterOptions {
  
  inline def apply(): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions]
  }
  
  extension [Self <: FilterOptions](x: Self) {
    
    inline def setAfterDate(value: Timestamp): Self = StObject.set(x, "AfterDate", value.asInstanceOf[js.Any])
    
    inline def setAfterDateUndefined: Self = StObject.set(x, "AfterDate", js.undefined)
    
    inline def setBeforeDate(value: Timestamp): Self = StObject.set(x, "BeforeDate", value.asInstanceOf[js.Any])
    
    inline def setBeforeDateUndefined: Self = StObject.set(x, "BeforeDate", js.undefined)
    
    inline def setSort(value: ColumnAndDirection): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
  }
}
