package typings.jasmineMatchers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  @js.native
  trait Matchers[T] extends StObject {
    
    //toBe
    def toBeArray(): Boolean = js.native
    
    def toBeCloseToOneOf(
      values: js.Array[_],
      isCloseToFunction: js.Function2[/* actual */ Double, /* expected */ Double, Boolean]
    ): Boolean = js.native
    
    def toBeInRange(min: Double, max: Double): Boolean = js.native
    
    def toBeInstanceOf(Constructor: js.Function): Boolean = js.native
    
    def toBeNan(): Boolean = js.native
    
    def toBeNumber(): Boolean = js.native
    
    def toBeOfType(`type`: String): Boolean = js.native
    
    def toBeOneOf(values: js.Array[_]): Boolean = js.native
    
    //toContain
    def toContainOnce(value: js.Any): Boolean = js.native
    
    def toEachEndWith(searchString: String): Boolean = js.native
    
    def toEachStartWith(searchString: String): Boolean = js.native
    
    def toEndWith(value: js.Any): Boolean = js.native
    def toEndWith(values: js.Array[_]): Boolean = js.native
    
    def toExactlyHaveProperties(names: String*): Boolean = js.native
    
    //toHave
    def toHaveBeenCalledXTimes(count: Double): Boolean = js.native
    
    def toHaveLength(length: Double): Boolean = js.native
    
    def toHaveOwnProperties(names: String*): Boolean = js.native
    
    def toHaveOwnPropertiesWithValues(obj: js.Object): Boolean = js.native
    
    def toHaveProperties(names: String*): Boolean = js.native
    
    def toHavePropertiesWithValues(obj: js.Object): Boolean = js.native
    
    def toSomeEndWith(searchString: String): Boolean = js.native
    
    def toSomeStartWith(searchString: String): Boolean = js.native
    
    //toStartEndWith
    def toStartWith(value: js.Any): Boolean = js.native
    def toStartWith(value: js.Array[_]): Boolean = js.native
    
    def toStartWithEither(searchString: js.Any*): Boolean = js.native
    
    //toThrow
    def toThrowInstanceOf(klass: js.Function): Boolean = js.native
    
    def toThrowStartsWith(text: String): Boolean = js.native
  }
}
