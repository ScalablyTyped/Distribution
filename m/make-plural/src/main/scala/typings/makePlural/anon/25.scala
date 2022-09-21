package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var one: js.Tuple2[typings.makePlural.makePluralStrings.`1`, typings.makePlural.makePluralStrings.`4`]
  
  var other: js.Tuple8[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`5`, 
    typings.makePlural.makePluralStrings.`19`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `1000000`
  ]
}
object `25` {
  
  inline def apply(
    one: js.Tuple2[typings.makePlural.makePluralStrings.`1`, typings.makePlural.makePluralStrings.`4`],
    other: js.Tuple8[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`5`, 
      typings.makePlural.makePluralStrings.`19`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ]
  ): `25` = {
    val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setOne(
      value: js.Tuple2[typings.makePlural.makePluralStrings.`1`, typings.makePlural.makePluralStrings.`4`]
    ): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOther(
      value: js.Tuple8[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`5`, 
          typings.makePlural.makePluralStrings.`19`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `1000000`
        ]
    ): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
  }
}
