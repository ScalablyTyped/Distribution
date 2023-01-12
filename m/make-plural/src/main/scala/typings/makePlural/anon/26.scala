package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var few: js.Array[typings.makePlural.makePluralStrings.`4`]
  
  var many: js.Array[typings.makePlural.makePluralStrings.`6`]
  
  var one: js.Tuple4[
    typings.makePlural.makePluralStrings.`1`, 
    typings.makePlural.makePluralStrings.`5`, 
    typings.makePlural.makePluralStrings.`7`, 
    typings.makePlural.makePluralStrings.`9`
  ]
  
  var other: js.Tuple8[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`10`, 
    typings.makePlural.makePluralStrings.`24`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `1000000`
  ]
  
  var two: js.Tuple2[typings.makePlural.makePluralStrings.`2`, typings.makePlural.makePluralStrings.`3`]
}
object `26` {
  
  inline def apply(
    few: js.Array[typings.makePlural.makePluralStrings.`4`],
    many: js.Array[typings.makePlural.makePluralStrings.`6`],
    one: js.Tuple4[
      typings.makePlural.makePluralStrings.`1`, 
      typings.makePlural.makePluralStrings.`5`, 
      typings.makePlural.makePluralStrings.`7`, 
      typings.makePlural.makePluralStrings.`9`
    ],
    other: js.Tuple8[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`10`, 
      typings.makePlural.makePluralStrings.`24`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ],
    two: js.Tuple2[typings.makePlural.makePluralStrings.`2`, typings.makePlural.makePluralStrings.`3`]
  ): `26` = {
    val __obj = js.Dynamic.literal(few = few.asInstanceOf[js.Any], many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], two = two.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `26`] (val x: Self) extends AnyVal {
    
    inline def setFew(value: js.Array[typings.makePlural.makePluralStrings.`4`]): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    inline def setFewVarargs(value: typings.makePlural.makePluralStrings.`4`*): Self = StObject.set(x, "few", js.Array(value*))
    
    inline def setMany(value: js.Array[typings.makePlural.makePluralStrings.`6`]): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setManyVarargs(value: typings.makePlural.makePluralStrings.`6`*): Self = StObject.set(x, "many", js.Array(value*))
    
    inline def setOne(
      value: js.Tuple4[
          typings.makePlural.makePluralStrings.`1`, 
          typings.makePlural.makePluralStrings.`5`, 
          typings.makePlural.makePluralStrings.`7`, 
          typings.makePlural.makePluralStrings.`9`
        ]
    ): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOther(
      value: js.Tuple8[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`10`, 
          typings.makePlural.makePluralStrings.`24`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `1000000`
        ]
    ): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setTwo(
      value: js.Tuple2[typings.makePlural.makePluralStrings.`2`, typings.makePlural.makePluralStrings.`3`]
    ): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
  }
}
