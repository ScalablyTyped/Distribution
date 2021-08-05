package typings.jointjs.anon

import typings.jointjs.jointjsStrings.bbox
import typings.jointjs.jointjsStrings.bottomLeft
import typings.jointjs.jointjsStrings.bottomMiddle
import typings.jointjs.jointjsStrings.center
import typings.jointjs.jointjsStrings.corner
import typings.jointjs.jointjsStrings.leftMiddle
import typings.jointjs.jointjsStrings.origin
import typings.jointjs.jointjsStrings.rightMiddle
import typings.jointjs.jointjsStrings.topMiddle
import typings.jointjs.jointjsStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBy extends StObject {
  
  var searchBy: js.UndefOr[
    bottomLeft | bottomMiddle | center | corner | leftMiddle | origin | rightMiddle | topMiddle | topRight | bbox
  ] = js.undefined
}
object SearchBy {
  
  inline def apply(): SearchBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBy]
  }
  
  extension [Self <: SearchBy](x: Self) {
    
    inline def setSearchBy(
      value: bottomLeft | bottomMiddle | center | corner | leftMiddle | origin | rightMiddle | topMiddle | topRight | bbox
    ): Self = StObject.set(x, "searchBy", value.asInstanceOf[js.Any])
    
    inline def setSearchByUndefined: Self = StObject.set(x, "searchBy", js.undefined)
  }
}
