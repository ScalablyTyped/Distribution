package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwoZero extends StObject {
  
  var few: js.Tuple2[typings.makePlural.makePluralStrings.`3`, typings.makePlural.makePluralStrings.`4`]
  
  var many: js.Tuple2[typings.makePlural.makePluralStrings.`5`, typings.makePlural.makePluralStrings.`6`]
  
  var one: js.Array[typings.makePlural.makePluralStrings.`1`]
  
  var other: js.Tuple7[
    typings.makePlural.makePluralStrings.`10`, 
    typings.makePlural.makePluralStrings.`25`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `1000000`
  ]
  
  var two: js.Array[typings.makePlural.makePluralStrings.`2`]
  
  var zero: js.Tuple3[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`7`, 
    typings.makePlural.makePluralStrings.`9`
  ]
}
object TwoZero {
  
  inline def apply(
    few: js.Tuple2[typings.makePlural.makePluralStrings.`3`, typings.makePlural.makePluralStrings.`4`],
    many: js.Tuple2[typings.makePlural.makePluralStrings.`5`, typings.makePlural.makePluralStrings.`6`],
    one: js.Array[typings.makePlural.makePluralStrings.`1`],
    other: js.Tuple7[
      typings.makePlural.makePluralStrings.`10`, 
      typings.makePlural.makePluralStrings.`25`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ],
    two: js.Array[typings.makePlural.makePluralStrings.`2`],
    zero: js.Tuple3[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`7`, 
      typings.makePlural.makePluralStrings.`9`
    ]
  ): TwoZero = {
    val __obj = js.Dynamic.literal(few = few.asInstanceOf[js.Any], many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], two = two.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoZero]
  }
  
  extension [Self <: TwoZero](x: Self) {
    
    inline def setFew(
      value: js.Tuple2[typings.makePlural.makePluralStrings.`3`, typings.makePlural.makePluralStrings.`4`]
    ): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    inline def setMany(
      value: js.Tuple2[typings.makePlural.makePluralStrings.`5`, typings.makePlural.makePluralStrings.`6`]
    ): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setOne(value: js.Array[typings.makePlural.makePluralStrings.`1`]): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOneVarargs(value: typings.makePlural.makePluralStrings.`1`*): Self = StObject.set(x, "one", js.Array(value*))
    
    inline def setOther(
      value: js.Tuple7[
          typings.makePlural.makePluralStrings.`10`, 
          typings.makePlural.makePluralStrings.`25`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `1000000`
        ]
    ): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setTwo(value: js.Array[typings.makePlural.makePluralStrings.`2`]): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
    
    inline def setTwoVarargs(value: typings.makePlural.makePluralStrings.`2`*): Self = StObject.set(x, "two", js.Array(value*))
    
    inline def setZero(
      value: js.Tuple3[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`7`, 
          typings.makePlural.makePluralStrings.`9`
        ]
    ): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
  }
}
