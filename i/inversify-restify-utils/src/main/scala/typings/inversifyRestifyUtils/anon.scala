package typings.inversifyRestifyUtils

import typings.inversifyRestifyUtils.dtsInterfacesMod.interfaces.StrOrRegex
import typings.inversifyRestifyUtils.dtsInterfacesMod.interfaces._RouteOptions
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Path
    extends StObject
       with _RouteOptions {
    
    var path: StrOrRegex
  }
  object Path {
    
    inline def apply(path: StrOrRegex): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setPath(value: StrOrRegex): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  options :std.Object,   path :inversify-restify-utils.inversify-restify-utils/dts/interfaces.interfaces.StrOrRegex} & std.Object */
  trait optionsObjectpathStrOrReg
    extends StObject
       with _RouteOptions {
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    var constructor: js.Function
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    def hasOwnProperty(v: PropertyKey): Boolean
    
    var options: js.Object
    
    var path: StrOrRegex
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    def propertyIsEnumerable(v: PropertyKey): Boolean
  }
  object optionsObjectpathStrOrReg {
    
    inline def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      options: js.Object,
      path: StrOrRegex,
      propertyIsEnumerable: PropertyKey => Boolean
    ): optionsObjectpathStrOrReg = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[optionsObjectpathStrOrReg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: optionsObjectpathStrOrReg] (val x: Self) extends AnyVal {
      
      inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setHasOwnProperty(value: PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: StrOrRegex): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
    }
  }
}
