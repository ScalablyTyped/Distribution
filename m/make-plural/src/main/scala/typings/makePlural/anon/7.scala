package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`0Dot0`
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
import typings.makePlural.makePluralStrings.`1Dot0`
import typings.makePlural.makePluralStrings.`1Dot5`
import typings.makePlural.makePluralStrings.`2Dot0`
import typings.makePlural.makePluralStrings.`3Dot5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var many: js.Array[`1000000`]
  
  var one: js.Tuple5[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`1`, 
    `0Dot0`, 
    `1Dot0`, 
    `1Dot5`
  ]
  
  var other: js.Tuple14[
    typings.makePlural.makePluralStrings.`2`, 
    typings.makePlural.makePluralStrings.`17`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `2Dot0`, 
    `3Dot5`, 
    `10Dot0`, 
    `100Dot0`, 
    `1000Dot0`, 
    `10000Dot0`, 
    `100000Dot0`, 
    `1000000Dot0`
  ]
}
object `7` {
  
  inline def apply(
    many: js.Array[`1000000`],
    one: js.Tuple5[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`1`, 
      `0Dot0`, 
      `1Dot0`, 
      `1Dot5`
    ],
    other: js.Tuple14[
      typings.makePlural.makePluralStrings.`2`, 
      typings.makePlural.makePluralStrings.`17`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `2Dot0`, 
      `3Dot5`, 
      `10Dot0`, 
      `100Dot0`, 
      `1000Dot0`, 
      `10000Dot0`, 
      `100000Dot0`, 
      `1000000Dot0`
    ]
  ): `7` = {
    val __obj = js.Dynamic.literal(many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setMany(value: js.Array[`1000000`]): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setManyVarargs(value: `1000000`*): Self = StObject.set(x, "many", js.Array(value*))
    
    inline def setOne(
      value: js.Tuple5[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`1`, 
          `0Dot0`, 
          `1Dot0`, 
          `1Dot5`
        ]
    ): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOther(
      value: js.Tuple14[
          typings.makePlural.makePluralStrings.`2`, 
          typings.makePlural.makePluralStrings.`17`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `2Dot0`, 
          `3Dot5`, 
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
