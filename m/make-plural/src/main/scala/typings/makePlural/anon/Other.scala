package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Other extends StObject {
  
  var other: js.Tuple7[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`15`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `1000000`
  ]
}
object Other {
  
  inline def apply(
    other: js.Tuple7[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`15`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ]
  ): Other = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  
  extension [Self <: Other](x: Self) {
    
    inline def setOther(
      value: js.Tuple7[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`15`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `1000000`
        ]
    ): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
  }
}
