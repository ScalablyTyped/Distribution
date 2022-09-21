package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManyOneOtherTwo extends StObject {
  
  var few: js.Array[typings.makePlural.makePluralStrings.`4`]
  
  var many: js.Array[typings.makePlural.makePluralStrings.`6`]
  
  var one: js.Array[typings.makePlural.makePluralStrings.`1`]
  
  var other: js.Tuple9[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`5`, 
    typings.makePlural.makePluralStrings.`7`, 
    typings.makePlural.makePluralStrings.`20`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `1000000`
  ]
  
  var two: js.Tuple2[typings.makePlural.makePluralStrings.`2`, typings.makePlural.makePluralStrings.`3`]
}
object ManyOneOtherTwo {
  
  inline def apply(
    few: js.Array[typings.makePlural.makePluralStrings.`4`],
    many: js.Array[typings.makePlural.makePluralStrings.`6`],
    one: js.Array[typings.makePlural.makePluralStrings.`1`],
    other: js.Tuple9[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`5`, 
      typings.makePlural.makePluralStrings.`7`, 
      typings.makePlural.makePluralStrings.`20`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ],
    two: js.Tuple2[typings.makePlural.makePluralStrings.`2`, typings.makePlural.makePluralStrings.`3`]
  ): ManyOneOtherTwo = {
    val __obj = js.Dynamic.literal(few = few.asInstanceOf[js.Any], many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], two = two.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManyOneOtherTwo]
  }
  
  extension [Self <: ManyOneOtherTwo](x: Self) {
    
    inline def setFew(value: js.Array[typings.makePlural.makePluralStrings.`4`]): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    inline def setFewVarargs(value: typings.makePlural.makePluralStrings.`4`*): Self = StObject.set(x, "few", js.Array(value*))
    
    inline def setMany(value: js.Array[typings.makePlural.makePluralStrings.`6`]): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setManyVarargs(value: typings.makePlural.makePluralStrings.`6`*): Self = StObject.set(x, "many", js.Array(value*))
    
    inline def setOne(value: js.Array[typings.makePlural.makePluralStrings.`1`]): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOneVarargs(value: typings.makePlural.makePluralStrings.`1`*): Self = StObject.set(x, "one", js.Array(value*))
    
    inline def setOther(
      value: js.Tuple9[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`5`, 
          typings.makePlural.makePluralStrings.`7`, 
          typings.makePlural.makePluralStrings.`20`, 
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
