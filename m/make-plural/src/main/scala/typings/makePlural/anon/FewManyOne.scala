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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FewManyOne extends StObject {
  
  var few: js.Tuple2[typings.makePlural.makePluralStrings.`2`, typings.makePlural.makePluralStrings.`4`]
  
  var many: js.Tuple9[
    `0Dot0`, 
    `1Dot0`, 
    `1Dot5`, 
    `10Dot0`, 
    `100Dot0`, 
    `1000Dot0`, 
    `10000Dot0`, 
    `100000Dot0`, 
    `1000000Dot0`
  ]
  
  var one: js.Array[typings.makePlural.makePluralStrings.`1`]
  
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
object FewManyOne {
  
  inline def apply(
    few: js.Tuple2[typings.makePlural.makePluralStrings.`2`, typings.makePlural.makePluralStrings.`4`],
    many: js.Tuple9[
      `0Dot0`, 
      `1Dot0`, 
      `1Dot5`, 
      `10Dot0`, 
      `100Dot0`, 
      `1000Dot0`, 
      `10000Dot0`, 
      `100000Dot0`, 
      `1000000Dot0`
    ],
    one: js.Array[typings.makePlural.makePluralStrings.`1`],
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
  ): FewManyOne = {
    val __obj = js.Dynamic.literal(few = few.asInstanceOf[js.Any], many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[FewManyOne]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FewManyOne] (val x: Self) extends AnyVal {
    
    inline def setFew(
      value: js.Tuple2[typings.makePlural.makePluralStrings.`2`, typings.makePlural.makePluralStrings.`4`]
    ): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    inline def setMany(
      value: js.Tuple9[
          `0Dot0`, 
          `1Dot0`, 
          `1Dot5`, 
          `10Dot0`, 
          `100Dot0`, 
          `1000Dot0`, 
          `10000Dot0`, 
          `100000Dot0`, 
          `1000000Dot0`
        ]
    ): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setOne(value: js.Array[typings.makePlural.makePluralStrings.`1`]): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOneVarargs(value: typings.makePlural.makePluralStrings.`1`*): Self = StObject.set(x, "one", js.Array(value*))
    
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
