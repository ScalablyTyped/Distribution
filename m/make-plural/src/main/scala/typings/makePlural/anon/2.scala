package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var one: js.Array[typings.makePlural.makePluralStrings.`1`]
  
  var other: js.Tuple8[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`2`, 
    typings.makePlural.makePluralStrings.`16`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `1000000`
  ]
}
object `2` {
  
  inline def apply(
    one: js.Array[typings.makePlural.makePluralStrings.`1`],
    other: js.Tuple8[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`2`, 
      typings.makePlural.makePluralStrings.`16`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ]
  ): `2` = {
    val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setOne(value: js.Array[typings.makePlural.makePluralStrings.`1`]): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOneVarargs(value: typings.makePlural.makePluralStrings.`1`*): Self = StObject.set(x, "one", js.Array(value*))
    
    inline def setOther(
      value: js.Tuple8[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`2`, 
          typings.makePlural.makePluralStrings.`16`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `1000000`
        ]
    ): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
  }
}
