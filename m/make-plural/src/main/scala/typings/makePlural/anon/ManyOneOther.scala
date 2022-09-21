package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`0Dot0`
import typings.makePlural.makePluralStrings.`0Dot9`
import typings.makePlural.makePluralStrings.`1000000Dot0`
import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000Dot0`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000Dot0`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000Dot0`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`100Dot0`
import typings.makePlural.makePluralStrings.`100`
import typings.makePlural.makePluralStrings.`10Dot0`
import typings.makePlural.makePluralStrings.`1Dot0000`
import typings.makePlural.makePluralStrings.`1Dot000`
import typings.makePlural.makePluralStrings.`1Dot00`
import typings.makePlural.makePluralStrings.`1Dot0`
import typings.makePlural.makePluralStrings.`1Dot1`
import typings.makePlural.makePluralStrings.`1Dot6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManyOneOther extends StObject {
  
  var many: js.Array[`1000000`]
  
  var one: js.Tuple5[typings.makePlural.makePluralStrings.`1`, `1Dot0`, `1Dot00`, `1Dot000`, `1Dot0000`]
  
  var other: js.Tuple17[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`2`, 
    typings.makePlural.makePluralStrings.`16`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `0Dot0`, 
    `0Dot9`, 
    `1Dot1`, 
    `1Dot6`, 
    `10Dot0`, 
    `100Dot0`, 
    `1000Dot0`, 
    `10000Dot0`, 
    `100000Dot0`, 
    `1000000Dot0`
  ]
}
object ManyOneOther {
  
  inline def apply(
    many: js.Array[`1000000`],
    one: js.Tuple5[typings.makePlural.makePluralStrings.`1`, `1Dot0`, `1Dot00`, `1Dot000`, `1Dot0000`],
    other: js.Tuple17[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`2`, 
      typings.makePlural.makePluralStrings.`16`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `0Dot0`, 
      `0Dot9`, 
      `1Dot1`, 
      `1Dot6`, 
      `10Dot0`, 
      `100Dot0`, 
      `1000Dot0`, 
      `10000Dot0`, 
      `100000Dot0`, 
      `1000000Dot0`
    ]
  ): ManyOneOther = {
    val __obj = js.Dynamic.literal(many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManyOneOther]
  }
  
  extension [Self <: ManyOneOther](x: Self) {
    
    inline def setMany(value: js.Array[`1000000`]): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setManyVarargs(value: `1000000`*): Self = StObject.set(x, "many", js.Array(value*))
    
    inline def setOne(
      value: js.Tuple5[typings.makePlural.makePluralStrings.`1`, `1Dot0`, `1Dot00`, `1Dot000`, `1Dot0000`]
    ): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOther(
      value: js.Tuple17[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`2`, 
          typings.makePlural.makePluralStrings.`16`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `0Dot0`, 
          `0Dot9`, 
          `1Dot1`, 
          `1Dot6`, 
          `10Dot0`, 
          `100Dot0`, 
          `1000Dot0`, 
          `10000Dot0`, 
          `100000Dot0`, 
          `1000000Dot0`
        ]
    ): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
  }
}
