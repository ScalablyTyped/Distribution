package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherTwo extends StObject {
  
  var few: js.Array[typings.makePlural.makePluralStrings.`4`]
  
  var one: js.Tuple2[typings.makePlural.makePluralStrings.`1`, typings.makePlural.makePluralStrings.`3`]
  
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
  
  var two: js.Array[typings.makePlural.makePluralStrings.`2`]
}
object OtherTwo {
  
  inline def apply(
    few: js.Array[typings.makePlural.makePluralStrings.`4`],
    one: js.Tuple2[typings.makePlural.makePluralStrings.`1`, typings.makePlural.makePluralStrings.`3`],
    other: js.Tuple8[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`5`, 
      typings.makePlural.makePluralStrings.`19`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ],
    two: js.Array[typings.makePlural.makePluralStrings.`2`]
  ): OtherTwo = {
    val __obj = js.Dynamic.literal(few = few.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], two = two.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherTwo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherTwo] (val x: Self) extends AnyVal {
    
    inline def setFew(value: js.Array[typings.makePlural.makePluralStrings.`4`]): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    inline def setFewVarargs(value: typings.makePlural.makePluralStrings.`4`*): Self = StObject.set(x, "few", js.Array(value*))
    
    inline def setOne(
      value: js.Tuple2[typings.makePlural.makePluralStrings.`1`, typings.makePlural.makePluralStrings.`3`]
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
    
    inline def setTwo(value: js.Array[typings.makePlural.makePluralStrings.`2`]): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
    
    inline def setTwoVarargs(value: typings.makePlural.makePluralStrings.`2`*): Self = StObject.set(x, "two", js.Array(value*))
  }
}
