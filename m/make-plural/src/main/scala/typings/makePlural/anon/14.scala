package typings.makePlural.anon

import typings.makePlural.makePluralStrings.`1000000`
import typings.makePlural.makePluralStrings.`100000`
import typings.makePlural.makePluralStrings.`10000`
import typings.makePlural.makePluralStrings.`1000`
import typings.makePlural.makePluralStrings.`1002`
import typings.makePlural.makePluralStrings.`100`
import typings.makePlural.makePluralStrings.`102`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var many: js.Tuple5[
    typings.makePlural.makePluralStrings.`0`, 
    typings.makePlural.makePluralStrings.`2`, 
    typings.makePlural.makePluralStrings.`16`, 
    `102`, 
    `1002`
  ]
  
  var one: js.Array[typings.makePlural.makePluralStrings.`1`]
  
  var other: js.Tuple7[
    typings.makePlural.makePluralStrings.`21`, 
    typings.makePlural.makePluralStrings.`36`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `1000000`
  ]
}
object `14` {
  
  inline def apply(
    many: js.Tuple5[
      typings.makePlural.makePluralStrings.`0`, 
      typings.makePlural.makePluralStrings.`2`, 
      typings.makePlural.makePluralStrings.`16`, 
      `102`, 
      `1002`
    ],
    one: js.Array[typings.makePlural.makePluralStrings.`1`],
    other: js.Tuple7[
      typings.makePlural.makePluralStrings.`21`, 
      typings.makePlural.makePluralStrings.`36`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ]
  ): `14` = {
    val __obj = js.Dynamic.literal(many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setMany(
      value: js.Tuple5[
          typings.makePlural.makePluralStrings.`0`, 
          typings.makePlural.makePluralStrings.`2`, 
          typings.makePlural.makePluralStrings.`16`, 
          `102`, 
          `1002`
        ]
    ): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setOne(value: js.Array[typings.makePlural.makePluralStrings.`1`]): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOneVarargs(value: typings.makePlural.makePluralStrings.`1`*): Self = StObject.set(x, "one", js.Array(value*))
    
    inline def setOther(
      value: js.Tuple7[
          typings.makePlural.makePluralStrings.`21`, 
          typings.makePlural.makePluralStrings.`36`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `1000000`
        ]
    ): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
  }
}
