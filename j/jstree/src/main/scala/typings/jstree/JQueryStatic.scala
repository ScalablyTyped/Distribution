package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /**
    * holds all jstree related functions and variables,
    * including the actual class and methods to create,
    * access and manipulate instances.
    * @property jstree
    * @type {JSTreeStatic}
    */
  var jstree: js.UndefOr[JSTreeStatic] = js.undefined
  
  /**
    * helpers
    */
  var vakata: js.UndefOr[VakataStatic] = js.undefined
}
object JQueryStatic {
  
  inline def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setJstree(value: JSTreeStatic): Self = StObject.set(x, "jstree", value.asInstanceOf[js.Any])
    
    inline def setJstreeUndefined: Self = StObject.set(x, "jstree", js.undefined)
    
    inline def setVakata(value: VakataStatic): Self = StObject.set(x, "vakata", value.asInstanceOf[js.Any])
    
    inline def setVakataUndefined: Self = StObject.set(x, "vakata", js.undefined)
  }
}
