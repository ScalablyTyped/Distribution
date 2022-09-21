package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapTableViewOptionsViewSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Optional="false" value indicating wheter the column headers should be arranged for compact header layout - each hieararchy is in a single row.
    */
  var compactColumnHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional="false" value indicating wheter the row headers should be arranged for compact header layout - each hieararchy is in a single row.
    */
  var compactRowHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional="false" a value indicating whether parent for columns is in front of its children.
    *                 If set to true the query set sorts members in a level in their natural order. Their natural order is the default ordering of the members along the hierarchy when no other sort conditions are specified.
    *                 Child members immediately follow their parent members.
    *                 If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    */
  var isParentInFrontForColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional="false" a value indicating whether parent for rows is in front of its children.
    *                 If set to true the query set sorts members in a level in their natural order. Their natural order is the default ordering of the members along the hierarchy when no other sort conditions are specified.
    *                 Child members immediately follow their parent members.
    *                 If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    */
  var isParentInFrontForRows: js.UndefOr[Boolean] = js.undefined
}
object OlapTableViewOptionsViewSettings {
  
  inline def apply(): OlapTableViewOptionsViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapTableViewOptionsViewSettings]
  }
  
  extension [Self <: OlapTableViewOptionsViewSettings](x: Self) {
    
    inline def setCompactColumnHeaders(value: Boolean): Self = StObject.set(x, "compactColumnHeaders", value.asInstanceOf[js.Any])
    
    inline def setCompactColumnHeadersUndefined: Self = StObject.set(x, "compactColumnHeaders", js.undefined)
    
    inline def setCompactRowHeaders(value: Boolean): Self = StObject.set(x, "compactRowHeaders", value.asInstanceOf[js.Any])
    
    inline def setCompactRowHeadersUndefined: Self = StObject.set(x, "compactRowHeaders", js.undefined)
    
    inline def setIsParentInFrontForColumns(value: Boolean): Self = StObject.set(x, "isParentInFrontForColumns", value.asInstanceOf[js.Any])
    
    inline def setIsParentInFrontForColumnsUndefined: Self = StObject.set(x, "isParentInFrontForColumns", js.undefined)
    
    inline def setIsParentInFrontForRows(value: Boolean): Self = StObject.set(x, "isParentInFrontForRows", value.asInstanceOf[js.Any])
    
    inline def setIsParentInFrontForRowsUndefined: Self = StObject.set(x, "isParentInFrontForRows", js.undefined)
  }
}
