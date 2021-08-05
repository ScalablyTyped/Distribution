package typings.knockstrap

import typings.knockstrap.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutTemplateSources extends StObject {
  
  var stringTemplate: Instantiable
}
object KnockoutTemplateSources {
  
  inline def apply(stringTemplate: Instantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(stringTemplate = stringTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
  
  extension [Self <: KnockoutTemplateSources](x: Self) {
    
    inline def setStringTemplate(value: Instantiable): Self = StObject.set(x, "stringTemplate", value.asInstanceOf[js.Any])
  }
}
